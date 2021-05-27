package com.gl52.euv.controller;

import com.gl52.euv.service.MeetingService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping(value = "/Meeting")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;
    /**
     * create a meeting
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping("/setMeeting.do")
    @ResponseBody
    public String joinGroup(@RequestParam Map<String, Object> map) throws Exception {
        int groupId=Integer.parseInt(map.get("groupId").toString()) ;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date eDate =  simpleDateFormat.parse(map.get("mDate").toString());
        JSONObject result = new JSONObject();
        try {
            meetingService.createMeeting(groupId,eDate);
            return result.put("msg","successful").toString();
        }   catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}