package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ParticipantsDTO implements Serializable {
    String customerId;
    DocumentDTO document;
    String firstName;
    String middleName;
    String lastName;
    Date birthDate;
    GenderDTO gender;
    List<ContactDetailsDTO> contactDetails;
    List<AddressesDTO> addresses;
    ParticipantTypeDTO participantType;
    DictumDTO dictum;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public DocumentDTO getDocument() {
        return document;
    }

    public void setDocument(DocumentDTO document) {
        this.document = document;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public GenderDTO getGender() {
        return gender;
    }

    public void setGender(GenderDTO gender) {
        this.gender = gender;
    }

    public List<ContactDetailsDTO> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetailsDTO> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<AddressesDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressesDTO> addresses) {
        this.addresses = addresses;
    }

    public ParticipantTypeDTO getParticipantType() {
        return participantType;
    }

    public void setParticipantType(ParticipantTypeDTO participantType) {
        this.participantType = participantType;
    }

    public DictumDTO getDictum() {
        return dictum;
    }

    public void setDictum(DictumDTO dictum) {
        this.dictum = dictum;
    }

    @Override
    public String toString() {
        return "ParticipantsDTO{" +
                "customerId='" + customerId + '\'' +
                ", document=" + document +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", contactDetails=" + contactDetails +
                ", addresses=" + addresses +
                ", participantType=" + participantType +
                ", dictum=" + dictum +
                '}';
    }
}
