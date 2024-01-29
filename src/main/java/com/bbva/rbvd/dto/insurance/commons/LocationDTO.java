package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;
import java.util.List;

public class LocationDTO implements Serializable {
    private List<AddressComponentsDTO> addressComponent;
    private List<String> locationTypes;


}
