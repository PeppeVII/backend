package com.docapp.springjwt.repository;

import com.docapp.springjwt.models.Documento;
import com.docapp.springjwt.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**

 The FeedbackRepository interface extends JpaRepository interface
 and provides methods to interact with Feedback entities in the database.
 */
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    /**
     Retrieves all Feedback entities associated with a particular Documento entity.
     @param documento the Documento entity to retrieve Feedback entities for
     @return a list of Feedback entities associated with the specified Documento entity
     */
    List<Feedback> findAllByDocumento(Documento documento);
    /**
     Retrieves all Feedback entities associated with a particular document ID.
     @param documentoId the ID of the document to retrieve Feedback entities for
     @return a list of Feedback entities associated with the specified document ID
     */
    List<Feedback> findAllByDocumentoId(Long documentoId);
}
