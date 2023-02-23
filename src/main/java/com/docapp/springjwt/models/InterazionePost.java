package com.docapp.springjwt.models;


import javax.persistence.*;
/**
This class represents an interaction between a user and a post.
        It is mapped to the "interazione_post" table in the database.
        */

@Entity
@Table(name = "interazione_post")
public class InterazionePost {
    @EmbeddedId
    private InterazionePostId id;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("postId")
    private Post post;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("studenteId")
    private User studente;

    /**
     Default constructor.
     */

    public InterazionePost() {
    }

    /**
     Constructor that initializes the post and user involved in the interaction.
     @param post the post
     @param studente the user who interacted with the post
     */

    public InterazionePost(Post post, User studente) {
        this.post = post;
        this.studente = studente;
        this.id = new InterazionePostId(post.getId(), studente.getId());
    }

    public InterazionePostId getId() {
        return id;
    }

    public void setId(InterazionePostId id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getStudente() {
        return studente;
    }

    public void setStudente(User studente) {
        this.studente = studente;
    }
}