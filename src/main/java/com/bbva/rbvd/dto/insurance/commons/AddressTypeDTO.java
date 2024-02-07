package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;

public class AddressTypeDTO implements Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddressTypeDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
