package com.docapp.springjwt.repository;

import com.docapp.springjwt.models.Conversazione;
import com.docapp.springjwt.models.Messaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**

 The MessaggioRepository interface extends JpaRepository interface
 and provides methods to interact with Messaggio entities in the database.
 */
@Repository
public interface MessaggioRepository extends JpaRepository<Messaggio, Long> {
    /**
     Retrieves all Messaggio entities associated with a particular conversation ID.
     @param conversazioneId the ID of the conversation to retrieve Messaggio entities for
     @return a list of Messaggio entities associated with the specified conversation ID
     */
    List<Messaggio> findAllByConversazione_Id(Long conversazioneId);
    /**
     Retrieves the Messaggio entity with the specified ID and associated with the specified conversation ID.
     @param messaggioId the ID of the Messaggio entity to retrieve
     @param conversazioneId the ID of the conversation the Messaggio entity belongs to
     @return an optional Messaggio entity with the specified ID and associated with the specified conversation ID,
     */
    Optional<Messaggio> findByIdAndConversazione_Id(Long messaggioId, Long conversazioneId);
    /**
     Retrieves all Messaggio entities associated with a particular conversation entity.
     @param conversazione the conversation entity to retrieve Messaggio entities for
     @return a list of Messaggio entities associated with the specified conversation entity
     */
    List<Messaggio> findByConversazione(Conversazione conversazione);
}


