package com.docapp.springjwt.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

/**

 Entity class representing a university.
 */

@Entity
@Table(name = "universita")
public class Universita {
    /**
     Unique identifier for the university.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     List of documents associated with the university.
     */

    @OneToMany(mappedBy = "universita")
    private List<Documento> documenti;

    /**
     List of courses of study offered by the university.
     */

    @OneToMany(mappedBy = "universita")
    private List<CorsoDiStudio> corsiDiStudio;

    /**
     List of faculties associated with the university.
     */

    @OneToMany(mappedBy = "universita")
    private List<Facolta> facolta;

    /**
     Name of the university.
     */

    @Size(max = 40)
    @Column(name = "nome", nullable = false, columnDefinition = "TEXT")
    private String nome;

    /**
     Constructs a new university object with default values for all fields.
     */

    public Universita() {

    }

    /**
     Constructs a new university object with the specified values for its fields.
     @param documenti list of documents associated with the university
     @param corsiDiStudio list of courses of study offered by the university
     @param facolta list of faculties associated with the university
     @param nome name of the university
     */

    public Universita(List<Documento> documenti, List<CorsoDiStudio> corsiDiStudio, List<Facolta> facolta, String nome) {
        this.documenti = documenti;
        this.corsiDiStudio = corsiDiStudio;
        this.facolta = facolta;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Documento> getDocumenti() {
        return documenti;
    }

    public void setDocumenti(List<Documento> documenti) {
        this.documenti = documenti;
    }

    public List<CorsoDiStudio> getCorsiDiStudio() {
        return corsiDiStudio;
    }

    public void setCorsiDiStudio(List<CorsoDiStudio> corsiDiStudio) {
        this.corsiDiStudio = corsiDiStudio;
    }

    public List<Facolta> getFacolta() {
        return facolta;
    }

    public void setFacolta(List<Facolta> facolta) {
        this.facolta = facolta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
