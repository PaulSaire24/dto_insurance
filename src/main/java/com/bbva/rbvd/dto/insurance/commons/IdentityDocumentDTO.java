package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;

public class IdentityDocumentDTO implements Serializable {
    private String value;
    private DocumentTypeDTO documentType;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DocumentTypeDTO getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeDTO documentType) {
        this.documentType = documentType;
    }

    @Override
    public String toString() {
        return "IdentityDocumentDTO{" +
                "value='" + value + '\'' +
                ", documentType=" + documentType +
                '}';
    }
}
