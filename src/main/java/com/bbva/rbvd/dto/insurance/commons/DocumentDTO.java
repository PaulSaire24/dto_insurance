package com.bbva.rbvd.dto.insurance.commons;

import java.io.Serializable;

public class DocumentDTO implements Serializable {
    DocumentTypeDTO documentType;
    String documentNumber;

    public DocumentTypeDTO getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeDTO documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return "DocumentDTO{" +
                "documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }
}
