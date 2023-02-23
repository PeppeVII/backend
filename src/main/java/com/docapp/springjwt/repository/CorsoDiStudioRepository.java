package com.docapp.springjwt.repository;


import com.docapp.springjwt.models.CorsoDiStudio;
import com.docapp.springjwt.models.Universita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**

 Repository interface for performing CRUD operations on {@link CorsoDiStudio} entity
 */
@Repository
public interface CorsoDiStudioRepository extends JpaRepository<CorsoDiStudio, Long> {
    /**
     Finds a {@link CorsoDiStudio} by name
     @param nome the name of the course of study
     @return the course of study with the given name, or null if not found
     */
    CorsoDiStudio findByNome(String nome);
    /**
     Finds all {@link CorsoDiStudio} associated with a given university
     @param universita the university associated with the courses of study to be returned
     @return a list of all courses of study associated with the given university
     */
    List<CorsoDiStudio> findAllByUniversita(Universita universita);
    /**
     Finds all {@link CorsoDiStudio} whose names contain a given string
     @param nome the string to search for in course of study names
     @return a list of all courses of study whose names contain the given string
     */
    List<CorsoDiStudio> findByNomeLike(String nome);
    /**
     Finds all {@link CorsoDiStudio} associated with a university with the given id
     @param id the id of the university associated with the courses of study to be returned
     @return a list of all courses of study associated with the university with the given id
     */
    List<CorsoDiStudio> findAllByUniversitaId(Long id);
}



