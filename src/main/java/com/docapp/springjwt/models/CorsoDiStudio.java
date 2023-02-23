package com.docapp.springjwt.models;

import javax.persistence.*;

/**
 Entity class representing a study course in a university.
 */

@Entity
@Table(name = "corso_di_studio")
public class CorsoDiStudio {
    /**
     The unique identifier of the study course.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     The name of the study course.
     */

    @Column(name = "nome", length = 30, nullable = false)
    private String nome;

    /**
     The university that offers the study course.
     */

    @ManyToOne
    @JoinColumn(name = "universita_id")
    private Universita universita;

    /**
     Creates a new instance of {@code CorsoDiStudio} with default values.
     */

    public CorsoDiStudio() {
    }

    /**
     Creates a new instance of {@code CorsoDiStudio} with the given parameters.
     @param nome the name of the study course.
     @param universita the university that offers the study course.
     */

    public CorsoDiStudio(String nome, Universita universita) {
        this.nome = nome;
        this.universita = universita;
    }

    /**
     Returns the unique identifier of the study course.
     @return the unique identifier of the study course.
     */

    public Long getId() {
        return id;
    }

    /**
     Sets the unique identifier of the study course.
     @param id the unique identifier of the study course.
     */

    public void setId(Long id) {
        this.id = id;
    }

    /**
     Returns the name of the study course.
     @return the name of the study course.
     */

    public String getNome() {
        return nome;
    }

    /**
     Sets the name of the study course.
     @param nome the name of the study course.
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     Returns the university that offers the study course.
     @return the university that offers the study course.
     */

    public Universita getUniversita() {
        return universita;
    }

    /**
     Sets the university that offers the study course.
     @param universita the university that offers the study course.
     */

    public void setUniversita(Universita universita) {
        this.universita = universita;
    }
}