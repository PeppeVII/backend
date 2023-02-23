package com.docapp.springjwt.repository;


import com.docapp.springjwt.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**

 The PostRepository interface extends JpaRepository interface
 and provides methods to interact with Post entities in the database.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    /**
     Retrieves all Post entities with a matching title.
     @param titolo the title to match against
     @return a list of Post entities with a matching title
     */
    List<Post> findAllByTitolo(String titolo);
}