package com.docapp.springjwt.repository;

import com.docapp.springjwt.models.Universita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**

 The UniversitaRepository interface extends JpaRepository interface
 and provides methods to interact with Universita entities in the database.
 */
@Repository
public interface UniversitaRepository extends JpaRepository<Universita, Long> {
    /**
     Retrieves all Universita entities with a matching name.
     @param nome the name to match against
     @return an optional list of Universita entities with a matching name, or an empty optional if no matches found
     */
    Optional<List<Universita>> findAllByNome(String nome);
    /**
     Retrieves the first Universita entity with a matching name.
     @param nome the name to match against
     @return an optional Universita entity with a matching name, or an empty optional if no match found
     */
    Optional<Universita> findByNome(String nome);
    /**
     Retrieves all Universita entities with a name containing the specified search term.
     @param nome the search term to match against
     @return an optional list of Universita entities with a matching name, or an empty optional if no matches found
     */
    Optional<List<Universita>> findAllByNomeLike(String nome);
}

