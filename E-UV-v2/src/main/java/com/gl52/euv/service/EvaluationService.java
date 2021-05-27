package com.gl52.euv.service;

import com.gl52.euv.pojo.Evaluation;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
/**
 *  Interface de service pour les informations Evaluations
 */
public interface EvaluationService {

    /**  Créer une évaluation
     * @param etitle
     * @param edescp
     * @param eduration
     * @param econtent
     * @return boolean
     */
    boolean createEvaluation(String etitle, String edescp, Date eduration, String econtent);

    /** Obtenez toutes les évaluations
     * @return  List<Evaluation>
     */
    List<Evaluation> getAllEvaluation();

    /** Obtenez toutes les évaluations et réponses
     * @param eid
     * @return HashMap
     */
    HashMap getAnEvaluationAndReponse(int eid);

    /** Obtenez toutes les évaluations et mettez à jour la date d'entrée en vigueur de l'évaluation
     * @return  List<Evaluation>
     */
    List<Evaluation> upateAndfindAllEvaluation();

    /** Déterminer si la date d'évaluation a dépassé la période de validité
     * @param duration
     * @return
     */
    Boolean testState(Date duration);

    /** Obtenez une évaluation
     * @param id
     * @return Evaluation
     */
    Evaluation getEvaluationById(int id);
}
