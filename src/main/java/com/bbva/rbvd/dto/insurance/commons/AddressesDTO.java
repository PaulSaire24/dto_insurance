package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;

public class AddressesDTO implements Serializable {
    private LocationDTO location;
    private String formattedAddress;
    private AddressTypeDTO addressType;

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public AddressTypeDTO getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressTypeDTO addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "AddressesDTO{" +
                "location=" + location +
                '}';
    }
}
