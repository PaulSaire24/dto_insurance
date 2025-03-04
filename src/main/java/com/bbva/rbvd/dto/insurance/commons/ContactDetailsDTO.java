package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;

public class ContactDetailsDTO implements Serializable {
    private String contact;
    private String contactType;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @Override
    public String toString() {
        return "ContactDetailsDTO{" +
                "contact='" + contact + '\'' +
                ", contactType='" + contactType + '\'' +
                '}';
    }
}
