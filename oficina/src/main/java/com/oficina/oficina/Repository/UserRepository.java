package com.oficina.oficina.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oficina.oficina.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
