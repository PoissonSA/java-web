package com.gl52.euv.service;

import java.util.HashMap;
import java.util.Map;

/**
 *  Interface de service pour les informations Groupes
 */
public interface GroupService {
    /** Obtenez tous les groupes
     * @param param Informations de pagination
     * @return
     */
    Map<String,Object> getAllGroups(Map<String, Object> param);

    /** Créer un groupe
     * @param groupName
     * @param subjectId
     * @param userId
     * @return
     */
    Integer createGroup(String groupName, int subjectId, int userId);

    /** Un étudiant rejoint un groupe
     * @param groupId
     * @param userId
     * @return
     */
    boolean joinGroup(int groupId, int userId);

    /** Obtenir les informations sur le groupe et le rendez-vous d'un étudiant
     * @param userId
     * @return
     */
    HashMap getGroupByUserId(int userId);

    /** Obtenir les informations sur le groupe et le rendez-vous d'un étudiant
     * @param groupId
     * @return
     */
    HashMap getGroupByGroupId(int groupId);

    /** Enregistrer le fichier dans la table de groupe
     * @param originalFilename  nom de fichier
     * @param data
     * @param groupId
     */
    void saveFichier(String originalFilename, byte[] data, int groupId);

    /** valider un groupe
     * @param groupId
     */
    void validerGroup(int groupId);
}
