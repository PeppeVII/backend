package com.docapp.springjwt.models;

import javax.persistence.*;

/**

 Entity class representing feedback for a document given by a student.
 */

@Entity
@Table(name = "feedback")
public class Feedback {

    /**
     The composite primary key for this feedback, composed of the document and student IDs.
     */

    @EmbeddedId
    private FeedbackId id;

    /**
     The document for which this feedback was given.
     */

    @ManyToOne
    @MapsId("documentoId")
    private Documento documento;

    /**
     The student who gave this feedback.
     */

    @ManyToOne
    @MapsId("studenteId")
    private User studente;

    /**
     Constructs a new empty Feedback object.
     */

    public Feedback() {
    }

    /**
     Constructs a new Feedback object with the specified properties.
     @param id the composite primary key for this feedback
     @param documento the document for which this feedback was given
     @param studente the student who gave this feedback
     */

    public Feedback(FeedbackId id, Documento documento, User studente) {
        this.id = id;
        this.documento = documento;
        this.studente = studente;
    }

    public FeedbackId getId() {
        return id;
    }

    public void setId(FeedbackId id) {
        this.id = id;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public User getStudente() {
        return studente;
    }

    public void setStudente(User studente) {
        this.studente = studente;
    }
}
