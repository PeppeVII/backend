package com.docapp.springjwt.models;

import javax.persistence.*;

/**

 This class represents a Post entity in the application.
 */

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titolo", nullable = false, length = 30)
    private String titolo;

    @Column(name = "testo", nullable = false, columnDefinition = "TEXT")
    private String testo;

    @Column(name = "is_domanda", nullable = false)
    private boolean isDomanda;

    /**
     Default constructor for Post entity.
     */

    public Post() {
    }

    /**
     Constructor for Post entity with parameters.
     @param titolo the title of the post.
     @param testo the content of the post.
     @param isDomanda a boolean flag indicating if the post is a question or not.
     */

    public Post( String titolo, String testo, boolean isDomanda) {

        this.titolo = titolo;
        this.testo = testo;
        this.isDomanda = isDomanda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public boolean isDomanda() {
        return isDomanda;
    }

    public void setDomanda(boolean domanda) {
        isDomanda = domanda;
    }
}
