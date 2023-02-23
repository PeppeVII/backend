package com.docapp.springjwt.models;

import javax.persistence.*;
/**

 Entity class representing a faculty of a university.
 */


@Entity
@Table(name = "facolta")
public class Facolta {

    /**
     The unique identifier of the faculty.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     The name of the faculty.
     */

    @Column(name = "nome", length = 40, nullable = false)
    private String nome;

    /**
     The university to which the faculty belongs.
     */

    @ManyToOne
    @JoinColumn(name = "universita_id")
    private Universita universita;

    /**
     Creates a new instance of the faculty class.
     */

    public Facolta() {
    }

    /**
     Creates a new instance of the faculty class with the specified name and university.
     @param nome the name of the faculty
     @param universita the university to which the faculty belongs
     */

    public Facolta(String nome, Universita universita) {
        this.nome = nome;
        this.universita = universita;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Universita getUniversita() {
        return universita;
    }

    public void setUniversita(Universita universita) {
        this.universita = universita;
    }
}