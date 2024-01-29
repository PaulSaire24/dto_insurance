package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ParticipantsDTO implements Serializable {
    private ParticipantTypeDTO participantType;
    private PersonDTO person;
    private List<IdentityDocumentDTO> identityDocument;
    private List<ContactDetailsDTO> contactDetails;
    private List<AddressesDTO> addresses;

    public ParticipantTypeDTO getParticipantType() {
        return participantType;
    }

    public void setParticipantType(ParticipantTypeDTO participantType) {
        this.participantType = participantType;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    public List<IdentityDocumentDTO> getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(List<IdentityDocumentDTO> identityDocument) {
        this.identityDocument = identityDocument;
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

    @Override
    public String toString() {
        return "ParticipantsDTO{" +
                "participantType=" + participantType +
                ", person=" + person +
                ", identityDocument=" + identityDocument +
                ", contactDetails=" + contactDetails +
                ", addresses=" + addresses +
                '}';
    }
}
