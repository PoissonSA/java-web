package com.gl52.euv.service;

import com.gl52.euv.pojo.Meeting;

import java.util.Date;

/**
 *  Interface de service pour les informations réunions
 */
public interface MeetingService {
    /**  Créer un RDV
     * @param groupId ID du groupe
     * @param mDate la date du RDV
     */
    void createMeeting(int groupId, Date mDate);

    /** Obtenez la date du dernier RDV
     * @param groupId
     * @return  Objet de classe de réunion contenant des informations RDV
     */
    Meeting getLastMeeting(int groupId);
}
