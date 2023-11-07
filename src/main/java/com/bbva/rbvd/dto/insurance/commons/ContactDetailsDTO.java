package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;

public class ContactDetailsDTO implements Serializable {
    private String id;
    private ContactDTO contact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ContactDetailsDTO{" +
                "id='" + id + '\'' +
                ", contact=" + contact +
                '}';
    }
}
