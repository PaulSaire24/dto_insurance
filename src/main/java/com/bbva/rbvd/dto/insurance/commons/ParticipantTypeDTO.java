package com.bbva.rbvd.dto.insurance.commons;

public class ParticipantTypeDTO {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ParticipantTypeDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
