package com.docapp.springjwt.models;

import javax.persistence.*;


import javax.persistence.*;
import java.util.List;

/**
 Entity class representing a conversation between two users.
 */

@Entity
@Table(name = "conversazione")
public class Conversazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_conversazione", nullable = false)
    private String nomeConversazione;

    @ManyToOne
    @JoinColumn(name = "studente1", nullable = false)
    private User studente1;

    @ManyToOne
    @JoinColumn(name = "studente2", nullable = false)
    private User studente2;

    @OneToMany(mappedBy = "conversazione", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Messaggio> messaggi;

    public Conversazione() {
    }

    /**
     Constructor for a new conversation between two users.
     @param nomeConversazione the name of the conversation
     @param studente1 the first user in the conversation
     @param studente2 the second user in the conversation
     */

    public Conversazione(String nomeConversazione, User studente1, User studente2) {
        this.nomeConversazione = nomeConversazione;
        this.studente1 = studente1;
        this.studente2 = studente2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeConversazione() {
        return nomeConversazione;
    }

    public void setNomeConversazione(String nomeConversazione) {
        this.nomeConversazione = nomeConversazione;
    }

    public User getStudente1() {
        return studente1;
    }

    public void setStudente1(User studente1) {
        this.studente1 = studente1;
    }

    public User getStudente2() {
        return studente2;
    }

    public void setStudente2(User studente2) {
        this.studente2 = studente2;
    }

    public List<Messaggio> getMessaggi() {
        return messaggi;
    }

    public void setMessaggi(List<Messaggio> messaggi) {
        this.messaggi = messaggi;
    }
}
