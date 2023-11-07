package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;

public class AddressesDTO implements Serializable {
    LocationDTO location;

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "AddressesDTO{" +
                "location=" + location +
                '}';
    }
}
