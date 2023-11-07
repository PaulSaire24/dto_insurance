package com.bbva.rbvd.dto.insurance.commons;

public class DocumentTypeDTO {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DocumentTypeDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
