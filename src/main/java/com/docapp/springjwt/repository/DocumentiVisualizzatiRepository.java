package com.docapp.springjwt.repository;

import com.docapp.springjwt.models.DocumentiVisualizzati;
import com.docapp.springjwt.models.Documento;
import com.docapp.springjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**

 Repository interface for DocumentiVisualizzati entity.
 */
public interface DocumentiVisualizzatiRepository extends JpaRepository<DocumentiVisualizzati, Long> {
    /**
     Returns a list of DocumentiVisualizzati entities that have the given Documento.
     @param documento the Documento object to filter the results by
     @return a list of DocumentiVisualizzati entities that have the given Documento
     */
    List<DocumentiVisualizzati> findAllByDocumento(Documento documento);
    /**
     Returns a list of DocumentiVisualizzati entities that belong to the given User.
     @param studente the User object to filter the results by
     @return a list of DocumentiVisualizzati entities that belong to the given User
     */
    List<DocumentiVisualizzati> findByStudente(User studente);
}
