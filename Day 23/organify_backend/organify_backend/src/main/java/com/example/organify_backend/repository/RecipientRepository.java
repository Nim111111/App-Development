package com.example.organify_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.organify_backend.model.Recipient;

public interface RecipientRepository extends JpaRepository<Recipient, Long> {

}
