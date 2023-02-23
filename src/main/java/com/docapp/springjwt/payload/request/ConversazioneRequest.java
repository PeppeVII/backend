package com.docapp.springjwt.payload.request;
/**

 A class representing a request for creating or updating a conversation.
 */
public class ConversazioneRequest {
    /** The second student in the conversation. */
    private String studente2;
    /** The first student in the conversation. */
    private String studente1;
    /** The ID of the conversation. */
    private String id;
    /** The name of the conversation. */
    private String nome_conversazione;
    /**
     Constructs an empty {@code ConversazioneRequest}.
     */
    public ConversazioneRequest() {
    }
    /**
     Constructs a {@code ConversazioneRequest} with the specified parameters.
     @param id the ID of the conversation
     @param studente1 the first student in the conversation
     @param studente2 the second student in the conversation
     @param nome_conversazione the name of the conversation
     */
    public ConversazioneRequest(String id, String studente1, String studente2, String nome_conversazione) {
        this.studente2 = studente2;
        this.studente1 = studente1;
        this.id = id;
        this.nome_conversazione = nome_conversazione;
    }

    public String getStudente2() {
        return studente2;
    }

    public void setStudente2(String studente2) {
        this.studente2 = studente2;
    }

    public String getStudente1() {
        return studente1;
    }

    public void setStudente1(String studente1) {
        this.studente1 = studente1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome_conversazione() {
        return nome_conversazione;
    }

    public void setNome_conversazione(String nome_conversazione) {
        this.nome_conversazione = nome_conversazione;
    }
}

