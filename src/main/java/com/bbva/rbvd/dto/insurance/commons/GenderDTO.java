package com.bbva.rbvd.dto.insurance.commons;

public class GenderDTO {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GenderDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
