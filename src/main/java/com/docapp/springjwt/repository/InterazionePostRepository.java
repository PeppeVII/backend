package com.docapp.springjwt.repository;

import com.docapp.springjwt.models.InterazionePost;
import com.docapp.springjwt.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**

 The InterazionePostRepository interface extends JpaRepository interface
 and provides methods to interact with InterazionePost entities in the database.
 */
public interface InterazionePostRepository extends JpaRepository<InterazionePost, Long> {
    /**
     Retrieves all InterazionePost entities associated with a particular post ID.
     @param postId the ID of the post to retrieve InterazionePost entities for
     @return a list of InterazionePost entities associated with the specified post ID
     */
    List<InterazionePost> findAllByPostId(Long postId);
    /**
     Retrieves all InterazionePost entities associated with a particular Post entity.
     @param post the Post entity to retrieve InterazionePost entities for
     @return a list of InterazionePost entities associated with the specified Post entity
     */
    List<InterazionePost> findAllByPost(Post post);
}



