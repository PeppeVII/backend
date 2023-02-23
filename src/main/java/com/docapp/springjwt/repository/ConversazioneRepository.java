package com.docapp.springjwt.repository;

import com.docapp.springjwt.models.Conversazione;
import com.docapp.springjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**

 The ConversazioneRepository interface provides the methods to perform CRUD operations on Conversazione entities
 and additional queries to retrieve Conversazione objects.
 */
@Repository
public interface ConversazioneRepository extends JpaRepository<Conversazione, Long> {
    /**
     Finds all the conversations of a given user.
     @param user the User to search the conversations for
     @return a List of Conversazione objects where the user is either studente1 or studente2
     */
    @Query("SELECT c FROM Conversazione c WHERE c.studente1 = :user OR c.studente2 = :user")
    List<Conversazione> findAllByStudente1OrStudente2(@Param("user") User user);
    /**
     Finds a conversation by ID and one of the users in the conversation.
     @param conversazioneId the ID of the Conversazione to find
     @param studente the User who is one of the students in the conversation
     @return an Optional of Conversazione that matches the ID and contains the studente
     */
    @Query("SELECT c FROM Conversazione c WHERE c.id = :conversazioneId AND (c.studente1 = :studente OR c.studente2 = :studente)")
    Optional<Conversazione> findByIdAndStudenti1OrStudente2(Long conversazioneId, User studente);
    /**
     Finds a conversation by two given users.
     @param currentUser the User who starts the conversation
     @param studente2 the User who receives the conversation
     @return an Optional of Conversazione object that matches the two given Users
     */
    Optional<Conversazione> findByStudente1AndStudente2(User currentUser, User studente2);
}


