package com.gl52.euv.service;

import com.gl52.euv.pojo.Evaluation;
import com.gl52.euv.pojo.Response;

import java.util.List;
import java.util.Map;

/**
 * Interface de service pour les informations Responses
 */
public interface ResponseService {
    /** Obtenez toutes les réponses pour une évaluation
     * @param eid ID de la  évaluation
     * @return
     */
    List<Map<String, Object>> getResponseByEvaluationId(int eid);

    /** Obtenir une évaluation par ID d'évaluation
     * @param eid ID de l'évaluation
     * @return Evaluation
     */
    Evaluation getEvaluationByEid(int eid);

    /** Créer une réponse
     * @param eid ID de l'évaluation
     * @param userId Identifiant d'utilisateur
     * @param content Le contenu de la réponse
     * @return boolean
     */
    boolean createResponse(int eid,int userId,String content);
}
