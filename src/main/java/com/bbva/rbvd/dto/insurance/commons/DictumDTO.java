package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;
import java.util.List;

public class DictumDTO implements Serializable {
    Boolean isApproved;
    List<ReasonsDTO> reasons;

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }

    public List<ReasonsDTO> getReasons() {
        return reasons;
    }

    public void setReasons(List<ReasonsDTO> reasons) {
        this.reasons = reasons;
    }

    @Override
    public String toString() {
        return "DictumDTO{" +
                "isApproved=" + isApproved +
                ", reasons=" + reasons +
                '}';
    }
}
