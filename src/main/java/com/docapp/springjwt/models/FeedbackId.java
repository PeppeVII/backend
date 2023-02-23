package com.docapp.springjwt.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


/**

 This class represents the composite primary key for the Feedback entity.
 It is embedded within the Feedback entity as a composite primary key.
 */

@Embeddable
public class FeedbackId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long documentoId;

    private Long studenteId;

    /**
     Default constructor.
     */

    public FeedbackId() {
    }

    /**
     Constructor that initializes the document ID and student ID.
     @param documentoId the document ID
     @param studenteId the student ID
     */

    public FeedbackId(Long documentoId, Long studenteId) {
        this.documentoId = documentoId;
        this.studenteId = studenteId;
    }

    public Long getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(Long documentoId) {
        this.documentoId = documentoId;
    }

    public Long getStudenteId() {
        return studenteId;
    }

    public void setStudenteId(Long studenteId) {
        this.studenteId = studenteId;
    }

    /**
     Compares this FeedbackId object with another object for equality.
     @param o the object to compare with
     @return true if the objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FeedbackId)) {
            return false;
        }
        FeedbackId other = (FeedbackId) o;
        return Objects.equals(documentoId, other.documentoId)
                && Objects.equals(studenteId, other.studenteId);
    }

    /**
     Computes the hash code for this FeedbackId object.
     @return the hash code value for this object
     */

    @Override
    public int hashCode() {
        return Objects.hash(documentoId, studenteId);
    }
}
