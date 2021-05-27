package com.gl52.euv.controller;

import com.gl52.euv.pojo.Group;
import com.gl52.euv.service.GroupService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/Group")
public class GroupController {

    @Autowired
    private GroupService groupService;
    /**
     * Find all groups
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAllGroup.do")
    @ResponseBody
    public Map findAllGroup (HttpServletRequest request,
                               HttpServletResponse response, @RequestParam Map<String, Object> param) throws Exception {
        try {
            System.out.println(param);
            return groupService.getAllGroups(param);
        }   catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
    /**
     * create a group
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping("/createGroup.do")
    public String createGroup (@RequestParam Map<String, Object>  param, HttpSession session,Map<String, Object> map) throws Exception {
        System.out.println("Request successful. Post param : list - " + param);
        String groupName = param.get("groupName").toString();
        int subjectId = Integer.parseInt(param.get("subjectId").toString());
        int userId= (int) session.getAttribute("userId");
        try {
            Integer groupID=groupService.createGroup(groupName,subjectId,userId);
            if(groupID==null){
                map.put("msg","you already have a group");
            }else{
                session.setAttribute("groupid", groupID);
            }
            return "groups";
        }   catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }




    /**
     * create a group
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping("/joinGroup.do")
    public String joinGroup (@RequestParam("groupId") String groupId, HttpSession session,Map<String, Object> map) throws Exception {
        System.out.println("Request successful. Get param : list - " + groupId);
        int groupID = Integer.parseInt(groupId);
        int userId= (int) session.getAttribute("userId");
        try {
            if(!groupService.joinGroup(groupID,userId)){
                map.put("msg","you already have a group");
            }else{
                session.setAttribute("groupid", groupID);
            }
            return "groups";
        }   catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
    /**
     * enter a group
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping("/groupPage.do")
    public String groupPage ( HttpSession session,@RequestParam Map<String, Object> map,Map<String, Object> param) throws Exception {
        try {
            HashMap hashMap=null;
            if(map.size()!=0){
                int groupId = Integer.parseInt(map.get("groupId").toString());
                hashMap=groupService.getGroupByGroupId(groupId);
            }else{
                int userId= (int) session.getAttribute("userId");
                 hashMap=groupService.getGroupByUserId(userId);
            }
            if(hashMap==null){
                param.put("msg", "you don't have a group");
                param.put("hasGroup",false);
                return "/group/group";
            }else {
                param.put("hasGroup",true);
                param.put("hashMap",hashMap);
                return "/group/group";
            }
        }   catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }


    /**
     * enter a group
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping("/validerGroup.do")
    public String validerGroup ( HttpSession session,@RequestParam Map<String, Object> map,Map<String, Object> param) throws Exception {
        try {
            int groupId = Integer.parseInt(map.get("groupId").toString());
            groupService.validerGroup(groupId);
            return "groups";

        }   catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
    /**
     * upload file
     * @param request
     * @param response
     * @param groupId
     * @return
     * @throws Exception
     */
    @RequestMapping({"/uploadFile.do"})
    public void  uploadFile(MultipartHttpServletRequest request, HttpServletResponse response,@RequestParam String groupId) throws Exception {
        PrintWriter writer = response.getWriter();
        InputStream in = null;
        JSONObject result = new JSONObject();
        try {
            int groupID=Integer.parseInt(groupId);
            MultipartHttpServletRequest multipartRequest = request;
            Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
            Map.Entry<String, MultipartFile> entry = fileMap.entrySet().iterator().next();
            MultipartFile multipartFile =  entry.getValue();
            in = multipartFile.getInputStream();
            byte[] data = multipartFile.getBytes();
            in.read(data);
            groupService.saveFichier(multipartFile.getOriginalFilename(),data,groupID);
            result.put("message","File uploaded successfully!!");
            result.put("fileName",multipartFile.getOriginalFilename());

        } catch (Exception e) {
            System.out.println("message，File upload failed!!");
        } finally {
            try {
                // 关闭输入流
                in.close();
                writer.println(result);
                writer.flush();
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * export file
     * @param request
     * @param response
     * @param groupId
     * @return
     * @throws Exception
     */
    @RequestMapping({"/exportFile.do"})
    public void export(HttpServletRequest request, HttpServletResponse response,@RequestParam String groupId)throws Exception {
        OutputStream toClient = null;
        try {
            int groupID=Integer.parseInt(groupId);
            HashMap hashMap=groupService.getGroupByGroupId(groupID);
            Group group= (Group) hashMap.get("group");
            String fileName= group.getFilename();
            response.reset();
            response.setContentType("application/octet-stream");
            response.setBufferSize(1024);
            response.setHeader("Content-Disposition", "attachment; filename=" + new String(fileName.getBytes("gb2312"),"iso8859-1"));
            toClient = new BufferedOutputStream(response.getOutputStream());
            toClient.write(group.getFile());
            toClient.flush();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            if(toClient != null){
                toClient.close();
            }
        }
    }
}
