package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;
import java.util.List;

public class LocationDTO implements Serializable {
    private List<AddressComponentsDTO> addressComponents;
    private String formattedAddress;

    public List<AddressComponentsDTO> getAddressComponents() {
        return addressComponents;
    }

    public void setAddressComponents(List<AddressComponentsDTO> addressComponents) {
        this.addressComponents = addressComponents;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    @Override
    public String toString() {
        return "LocationDTO{" +
                "addressComponents=" + addressComponents +
                ", formattedAddress='" + formattedAddress + '\'' +
                '}';
    }
}
