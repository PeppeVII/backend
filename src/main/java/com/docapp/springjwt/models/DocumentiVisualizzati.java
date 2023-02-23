package com.docapp.springjwt.models;



import javax.persistence.*;
/**

 Entity class representing a viewed document by a student.
 */


@Entity
@Table(name = "documentivisualizzati")
public class DocumentiVisualizzati {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User studente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documento_id")
    private Documento documento;

    public DocumentiVisualizzati() {
    }

    /**
     Creates a new instance of DocumentiVisualizzati.
     @param studente the student who viewed the document
     @param documento the viewed document
     */

    public DocumentiVisualizzati(User studente, Documento documento) {
        this.studente = studente;
        this.documento = documento;
    }

    /**
     Returns the ID of the viewed document.
     @return the ID of the viewed document
     */

    public Long getId() {
        return id;
    }

    /**
     Sets the ID of the viewed document.
     @param id the ID of the viewed document
     */

    public void setId(Long id) {
        this.id = id;
    }

    /**
     Returns the student who viewed the document.
     @return the student who viewed the document
     */

    public User getStudente() {
        return studente;
    }

    /**
     Sets the student who viewed the document.
     @param studente the student who viewed the document
     */

    public void setStudente(User studente) {
        this.studente = studente;
    }

    /**
     Returns the viewed document.
     @return the viewed document
     */

    public Documento getDocumento() {
        return documento;
    }

    /**
     Sets the viewed document.
     @param documento the viewed document
     */

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
