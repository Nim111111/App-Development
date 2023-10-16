package com.example.feedback.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.feedback.models.*;

@Repository
public interface FeedbackRepo extends JpaRepository<FeedbackModel, Integer>
{
	
}
