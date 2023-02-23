package com.docapp.springjwt.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**

 This class represents the composite primary key of the InterazionePost entity.
 It is embedded in the InterazionePost entity and consists of the ids of the post and the user involved in the interaction.
 */

@Embeddable
public class InterazionePostId implements Serializable {

    private Long postId;

    private Long studenteId;

    /**
     Default constructor.
     */

    public InterazionePostId() {
    }

    /**
     Constructor that initializes the ids of the post and the user.
     @param postId the id of the post
     @param studenteId the id of the user
     */

    public InterazionePostId(Long postId, Long studenteId) {
        this.postId = postId;
        this.studenteId = studenteId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getStudenteId() {
        return studenteId;
    }

    public void setStudenteId(Long studenteId) {

        this.studenteId = studenteId;
    }

    /**
     Indicates whether some other object is "equal to" this one.
     @param o the reference object with which to compare
     @return true if this object is the same as the o argument; false otherwise
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InterazionePostId that)) return false;
        return Objects.equals(getPostId(), that.getPostId()) &&
                Objects.equals(getStudenteId(), that.getStudenteId());
    }

    /**
     Returns a hash code value for the object.
     @return a hash code value for the object
     */

    @Override
    public int hashCode() {
        return Objects.hash(getPostId(), getStudenteId());
    }
}