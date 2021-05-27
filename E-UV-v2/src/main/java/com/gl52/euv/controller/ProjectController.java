package com.gl52.euv.controller;

import com.gl52.euv.pojo.Project;
import com.gl52.euv.pojo.Subject;
import com.gl52.euv.service.ProjectService;
import org.apache.tomcat.util.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/Project")
public class ProjectController {
    private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
    @Autowired
    private ProjectService projectService;

    /**
     * Find all subjects with params of page
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAllSubject.do")
    @ResponseBody
    public Map findAllProject (HttpServletRequest request,
                               HttpServletResponse response,@RequestParam Map<String, Object> param) throws Exception {
        try {
            System.out.println(param);
            return projectService.getAllSubjects(param);
        }   catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
    /**
     * Find all subjects with no params of page
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAllSubjectName.do")
    @ResponseBody
    public List<Subject> findAllSubjectName (HttpServletRequest request,
                                             HttpServletResponse response, @RequestParam Map<String, Object> param) throws Exception {
        try {
            System.out.println(param);
            return projectService.getAllSubjectsName();
        }   catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }

//    @RequestMapping("/getSubjectList.do")
//    @ResponseBody
//    public Map getSubjectList(){
//        projectService
//    }

//    @RequestMapping("/showProject.do")
//    public String showProject (HttpServletRequest request,
//                                         HttpServletResponse response) throws Exception {
//       return "Projects";
//    }

//    @RequestMapping("/showSubject.do")
//    public String showSubject (HttpServletRequest request,
//                               HttpServletResponse response) throws Exception {
//        return "subjectCreation";
//    }

    /**
     * Find subject details based on subject id
     * @param subjectId
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping("/subjectInformation.do")
    public String subjectInformation (@RequestParam Integer subjectId,Map<String, Object> map) throws Exception {
        try {
        Subject subject=projectService.getSubjectById(subjectId);
        map.put("subject",subject);
            return "subjectInformation";
        }  catch (Exception e) {
        e.printStackTrace();
        return null;
        }
    }


    /**
     * Create subject
     * @param map
     * @param httpSession
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/createSubject.do", method= RequestMethod.POST)
    public  String requestList(@RequestParam Map<String, Object>  map, HttpSession httpSession) {
        String subjectName = map.get("subjectName").toString();
        String description = map.get("description").toString();
        int minimum = Integer.parseInt(map.get("minimum").toString());
        int maximum = Integer.parseInt(map.get("maximum").toString());
        try {
           int i=projectService.createSubject(subjectName,description,minimum,maximum);
           System.out.println(i);
            return "Projects";
        }   catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
