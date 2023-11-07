package com.bbva.rbvd.dto.insurance.commons;

public class AddressesDTO {
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
