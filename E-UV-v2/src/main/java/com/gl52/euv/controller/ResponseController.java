package com.gl52.euv.controller;

import com.gl52.euv.pojo.Evaluation;
import com.gl52.euv.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/Response")
public class ResponseController {
    @Autowired
    private ResponseService responseService;
    /**
     * Create an evaluation
     * @param eid
     * @param param
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/setResponse.do")
    public  String requestList(@RequestParam Integer eid,Map<String, Object> param) {

        try {
            Evaluation evaluation =responseService.getEvaluationByEid(eid);
            param.put("evaluation",evaluation);
            return "/evaluation/setResponse";
        }   catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value="/postResponse.do")
    public  String requestList(@RequestParam Map<String, Object>  param, HttpSession session) {

        try {
            String rcontent = param.get("rcontent").toString();
            int eid = Integer.parseInt(param.get("eid").toString());
            int userId= (int) session.getAttribute("userId");

            if(responseService.createResponse(eid,userId,rcontent)){
               return "/evaluation/evaluations";
            }

            return null;
//            param.put("evaluation",evaluation);
//            return "/evaluation/setResponse";
        }   catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
