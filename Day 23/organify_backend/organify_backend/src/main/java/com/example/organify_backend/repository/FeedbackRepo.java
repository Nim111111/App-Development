package com.example.organify_backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.organify_backend.model.*;

@Repository
public interface FeedbackRepo extends JpaRepository<FeedbackModel, Integer>
{
	
}
