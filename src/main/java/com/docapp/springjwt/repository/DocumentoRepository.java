package com.docapp.springjwt.repository;

import com.docapp.springjwt.models.Conversazione;
import com.docapp.springjwt.models.Documento;
import com.docapp.springjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**

 Repository interface for accessing and manipulating Documento entities from the database.
 */
@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    /**
     Finds all Documento entities by the ID of the student who uploaded them.
     @param userId the ID of the student
     @return a list of all Documento entities uploaded by the specified student
     */
    List<Documento> findAllByStudenteId(Long userId);
    /**
     Finds all Documento entities uploaded by the specified student.
     @param user the student who uploaded the Documento entities
     @return an Optional containing a list of all Documento entities uploaded by the specified student,
     */
    Optional<List<Documento>> findAllByStudente(User user);
    /**
     Finds a Documento entity by its ID and the student who uploaded it.
     @param id the ID of the Documento entity
     @param currentUser the student who uploaded the Documento entity
     @return an Optional containing the specified Documento entity, or an empty Optional if no entity was found
     */
    Optional<Documento> findByIdAndStudente(Long id, User currentUser);
}
