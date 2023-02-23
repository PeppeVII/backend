package com.docapp.springjwt.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**

 Entity class representing a document uploaded by a student.
 The document contains a name, a description, the university it belongs to, its size, the student who uploaded it, its file path and its hash.
 */

@Entity
@Table(name = "documento")
public class Documento {
    public static final String basepath="uploads/documenti/";

    /**
     The document ID.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     The name of the document.
     */

    @NotBlank
    @Size(max = 70)
    @Column(name = "nome")
    private String nome;

/**
 The description of the document with regex.
 */

    @Pattern(regexp = "^[A-Za-z0-9.,; ]*$", message = "Descrizione cannot contain special characters")
    @Size(max = 650)
    @NotNull
    @Column(name = "descrizione")
    private String descrizione;

    /**
     The university the document belongs to.
     */

    @ManyToOne
    @JoinColumn(name = "universita_id")
    private Universita universita;

    /**
     The size of the document in bytes.
     */

    @NotNull
    @Column(name = "dimensione")
    private Long dimensione;

    /**
     The student who uploaded the document.
     */

    //we use JsonManagedReference to avoid infinite recursion, but also
    //to show the studente field in the json response
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name = "studente_id" )
    private User studente;

    /**
     The file path of the document.
     */

    @NotNull
    @Column(name = "path")
    @JsonIgnore
    private String path;

    /**
     The hash of the document.
     */

    @NotNull
    @Column(name = "hash")
    private String hash;

    /**
     Empty constructor for the Documento class.
     */

    public Documento() {
    }

    /**
     Constructor for the Documento class.
     @param nome The name of the document.
     @param descrizione The description of the document.
     @param universita The university the document belongs to.
     @param dimensione The size of the document in bytes.
     @param studente The student who uploaded the document.
     @param path The file path of the document.
     @param hash The hash of the document.
     */

    public Documento(String nome, String descrizione, Universita universita, Long dimensione, User studente, String path, String hash){
        this.nome = nome;
        this.descrizione = descrizione;
        this.universita = universita;
        this.dimensione = dimensione;
        this.studente = studente;
        this.path= path;
        this.hash= hash;
    }

    /**
     Getter for the hash of the document.
     @return The hash of the document.
     */

    public String getHash() {
        return hash;
    }

    /**
     Setter for the hash of the document.
     @param hash The hash of the document.
     */

    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     Getter for the file path of the document.
     @return The file path of the document.
     */

    public String getPath() {
        return path;
    }

    /**
     Setter for the file path of the document.
     @param path The file path of the document.
     */

    public void setPath(String path) {
        this.path = path;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Universita getUniversita() {
        return universita;
    }


    public void setUniversita(Universita universita) {
        this.universita = universita;
    }

    public Long getDimensione() {
        return dimensione;
    }

    public void setDimensione(Long dimensione) {
        this.dimensione = dimensione;
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


}
