package com.gl52.euv.controller;

import com.gl52.euv.pojo.Evaluation;
import com.gl52.euv.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/Evaluation")
public class EvaluationController  {

    @Autowired
    private EvaluationService evaluationService;

    /**
     * Create an evaluation
     * @param map
     * @param httpSession
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/createEvaluation.do", method= RequestMethod.POST)
    public  String requestList(@RequestParam Map<String, Object> map, HttpSession httpSession,Map<String, Object> param) throws ParseException {
        String etitle = map.get("etitle").toString();
        String edescp = map.get("edescp").toString();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date eduration =  simpleDateFormat.parse(map.get("eduration1").toString());
        String econtent= map.get("econtent").toString();
        try {
           if(evaluationService.createEvaluation(etitle,edescp,eduration,econtent)) {
               param.put("msg","Vous avez réussi à publier une évaluation");
               return "/evaluation/setEvaluation";
           }
            param.put("msg", "La création a échoué, veuillez contacter l'administrateur");
            return "/evaluation/setEvaluation";
        }   catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Find all evaluations
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAllEvaluation.do")
    public String findAllEvaluation (HttpServletRequest request,
                             HttpServletResponse response,Map<String, Object> param) throws Exception {
        try {
            List<Evaluation> evaluations=evaluationService.getAllEvaluation();
            param.put("evaluationList",evaluations);
            return "/evaluation/getEvaluation";
        }   catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * Find all evaluations
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/upateAndfindAllEvaluation.do")
    public String upateAndfindAllEvaluation (HttpServletRequest request,
                                     HttpServletResponse response,Map<String, Object> param) throws Exception {
        try {
            List<Evaluation> evaluations=evaluationService.upateAndfindAllEvaluation();
            param.put("evaluations",evaluations);
            return "/evaluation/evaluations";
        }   catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * Get details of an evaluation
     * @param eid
     * @param param
     * @return
     * @throws Exception
     */
    @RequestMapping("/getdetail.do")
    public String getdetail (@RequestParam Integer eid,Map<String, Object> param) throws Exception {
        try {
            HashMap h =evaluationService.getAnEvaluationAndReponse(eid);
            param.put("evaluation",h.get("evaluation"));
            param.put("responses",h.get("responses"));
            return "/evaluation/detail";
        }   catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
