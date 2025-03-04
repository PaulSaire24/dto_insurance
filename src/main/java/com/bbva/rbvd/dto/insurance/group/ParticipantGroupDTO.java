package com.bbva.rbvd.dto.insurance.group;

import com.bbva.rbvd.dto.insurance.commons.ParticipantsDTO;

import java.io.Serializable;
import java.util.List;

public class ParticipantGroupDTO implements Serializable {
    private String documentNumber;
    private String documentType;
    private List<ParticipantsDTO> participantList;


    public List<ParticipantsDTO> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<ParticipantsDTO> participantList) {
        this.participantList = participantList;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public String toString() {
        return "ParticipantGroupDTO{" +
                "documentNumber='" + documentNumber + '\'' +
                ", documentType='" + documentType + '\'' +
                ", participantList=" + participantList +
                '}';
    }
}
