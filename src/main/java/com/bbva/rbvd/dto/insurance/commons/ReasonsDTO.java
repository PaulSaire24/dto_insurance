package com.bbva.rbvd.dto.insurance.commons;

public class ReasonsDTO {
    String id;
    String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ReasonsDTO{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
