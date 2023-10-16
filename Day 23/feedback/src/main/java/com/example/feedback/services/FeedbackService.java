package com.example.feedback.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.feedback.models.*;
import com.example.feedback.repository.*;
@Service
public class FeedbackService 
{
	@Autowired
	FeedbackRepo fr;
	
	public void saveFeedback(FeedbackModel fm)
	{
		fr.save(fm);
	}
	
	public List<FeedbackModel> getFeedback()
	{
		return fr.findAll();
	}
	
    public void deleteFeedback(int id)
    {
    	fr.deleteById(id);
    }
}
