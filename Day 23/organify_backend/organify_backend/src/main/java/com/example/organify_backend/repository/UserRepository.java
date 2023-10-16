package com.example.organify_backend.repository;


//package com.iamneo.ecom.repository;

import java.util.Optional;
import com.example.organify_backend.model.*;

import org.springframework.data.jpa.repository.JpaRepository;


//import com.iamneo.ecom.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByEmail(String username);

  User findByUid(Long uid);

  void deleteByUid(Long uid);

}