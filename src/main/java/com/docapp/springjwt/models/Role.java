package com.docapp.springjwt.models;

import javax.persistence.*;

/**

 Entity representing a user role.
 */

@Entity
@Table(name = "roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;

  /**

   Default constructor for Role entity.
   */

  public Role() {

  }

  /**
   Constructor for Role entity.
   @param name The name of the role.
   */

  public Role(ERole name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ERole getName() {
    return name;
  }

  public void setName(ERole name) {
    this.name = name;
  }
}