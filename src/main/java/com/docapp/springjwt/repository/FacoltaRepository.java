package com.docapp.springjwt.repository;

import com.docapp.springjwt.models.Facolta;
import com.docapp.springjwt.models.Universita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**

 The FacoltaRepository interface provides the methods to access the Facolta entities from the database.
 */
@Repository
public interface FacoltaRepository extends JpaRepository<Facolta, Long> {
        /**
         Retrieves a Facolta entity by name.
         @param nome the name of the Facolta to retrieve
         @return the Facolta entity
         */
        Facolta findByNome(String nome);
        /**
         Retrieves a list of Facolta entities associated with the specified university id.
         @param id the id of the university
         @return the list of Facolta entities associated with the specified university id
         */
        List<Facolta> findAllByUniversitaId(Long id);
        /**
         Retrieves a list of Facolta entities associated with the specified university.
         @param universita the university associated with the Facolta entities
         @return the list of Facolta entities associated with the specified university
         */
        List<Facolta> findAllByUniversita(Universita universita);
}


