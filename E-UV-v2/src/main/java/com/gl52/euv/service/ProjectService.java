package com.gl52.euv.service;

import com.gl52.euv.pojo.Project;
import com.gl52.euv.pojo.Subject;

import java.util.List;
import java.util.Map;

/**
 * Interface de service pour les informations sujet
 */
public interface ProjectService {
     /** Obtenez tous les thèmes du projet
      * @param param Informations de pagination
      * @return
      */
     Map<String,Object> getAllSubjects(Map<String, Object> param);

     /** Obtenez tous les thèmes du projet
      * @return
      */
     List<Subject> getAllSubjectsName();

     /** Créer un thème de projet
      * @param subjectName Nom du sujet
      * @param description la description du sujet
      * @param min Nombre minimum de membres de l'équipe
      * @param max Nombre maximum de membres de l'équipe
      * @return En cas de succès, renvoie 1
      */
     int createSubject(String subjectName,String description,int min,int max);

     /** Obtener un sujet
      * @param subjectId ID du suject
      * @return
      */
     Subject getSubjectById(int subjectId);
}
