package com.example.organify_backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.organify_backend.repository.*;
import com.example.organify_backend.response.FeedbackResponse;
import com.example.organify_backend.service.*;
import com.example.organify_backend.model.*;
@RestController
@RequestMapping("/feedback")
public class FeedbackController 
{
	@Autowired
	FeedbackService fs;
	
	@GetMapping("/get")
	public List<FeedbackResponse> getFeedback()
	{
		return fs.getFeedback();
	}
	
	@PostMapping("/post")
	public String saveFeedback(@RequestBody FeedbackModel fm)
	{
		fs.saveFeedback(fm);
		return "Saved...!";
	}
	
	@DeleteMapping("/del")
	public String deleteFeedback(@RequestParam int id)
	{
		fs.deleteFeedback(id);
		return "Delete...!";
	}
}
