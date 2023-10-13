package com.project.model.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class UserEntity {
   private Integer id;
   private String name;
   private String username;
   private String password;
   private String email;
   private String address;
   private String phone;
   private String rol;

   @Override
   public String toString() {
      return "UserEntity{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", username='" + username + '\'' +
              ", password='" + password + '\'' +
              ", email='" + email + '\'' +
              ", address='" + address + '\'' +
              ", phone='" + phone + '\'' +
              ", rol='" + rol + '\'' +
              '}';
   }
}
