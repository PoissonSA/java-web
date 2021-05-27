package com.gl52.euv.service;

import com.gl52.euv.pojo.User;

import java.util.List;

/**
 * Interface de service pour les informations utilisateur
 */
public interface UserService {

     /**  Obtenir l'utilisateur par nom d'utilisateur et mot de passe
      * @param name
      * @param password
      * @return Objet de classe utilisateur
      */
     User identify(String name,String password);

     /** L'utilisateur rejoint un groupe,l'ID de groupe est inséré dans la table de l'utilisateur
      * @param userId
      * @param groupId
      */
     void insertGroupId(int userId,int groupId);

     /**  Déterminer si l'utilisateur a rejoint un groupe
      * @param userId
      * @return Si oui, retournez true, sinon retournez false
      */
     boolean isHasGroup(int userId);

     /** Obtenir l'ID de groupe d'un utilisateur
      * @param userId
      * @return ID de group
      */
     int getGroupId(int userId);

     /** Obtenir tous les étudiants dans un groupe
      * @param groupId
      * @return Collection d'étudiants
      */
     List<User> getUserByGroupId(int groupId);
}
