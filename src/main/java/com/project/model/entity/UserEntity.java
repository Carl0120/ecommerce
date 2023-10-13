package com.project.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(nullable = false, length = 50)
   private String name;

   @Column(nullable = false, unique = true, length = 50)
   private String username;

   @Column(nullable = false, unique = true)
   private String password;

   @Column(nullable = false, unique = true)
   private String email;

   private String address;

   @Column(nullable = false, unique = true, length = 50)
   private String phone;

   @OneToMany(mappedBy = "user")
   private List<ProductEntity> products;

   @ManyToOne
   @JoinColumn(name = "rolId", nullable = false)
   private RolEntity rol;


}
