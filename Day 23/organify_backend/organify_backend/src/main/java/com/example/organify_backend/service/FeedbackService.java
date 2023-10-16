package com.example.organify_backend.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.organify_backend.model.*;
import com.example.organify_backend.repository.*;
import com.example.organify_backend.request.*;
import com.example.organify_backend.response.*;

@Service
public class FeedbackService 
{
	@Autowired
	FeedbackRepo fr;
//	
//	public void saveFeedback(FeedbackModel fm)
//	{
//		fr.save(fm);
//	}
//	
//	public List<FeedbackModel> getFeedback()
//	{
//		return fr.findAll();
//	}
//	
//    public void deleteFeedback(int id)
//    {
//    	fr.deleteById(id);
//    }
    
    public ResponseEntity<String> saveFeedback(FeedbackModel fm) {
    	RestTemplate restTemplate = new RestTemplate();
    	return restTemplate.postForEntity("http://localhost:8090/api/plants/post", fm, String.class);
    }
    public <Plant> List<FeedbackResponse> getFeedback() {
    	
    	ResponseEntity<FeedbackModel[]> response = new RestTemplate().getForEntity(
    			  "http://localhost:8080/feedback/get",
    			  FeedbackModel[].class);
    	List<FeedbackModel> productList = Arrays.asList(response.getBody());
        return productList.stream()
                .map(this::mapPlantToResponse)
                .collect(Collectors.toList());
    }
    
    public ResponseEntity<String> deleteFeedback(int id) {


        HashMap<String, Integer> uriVariables = new HashMap<>();
    	uriVariables.put("id", id);
    	System.out.println("Feedback ID from the request in serviceImpl:::"+id);

    	//HttpEntity<Product> request1 = new HttpEntity<Product>(product);
		new RestTemplate().delete("http://localhost:8080/feedback/del", uriVariables);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatusCode.valueOf(200));
    }
    
    
    private FeedbackResponse mapPlantToResponse(FeedbackModel fb) {
        return FeedbackResponse.builder()
                .id(fb.getId())
                .name(fb.getName())
                .email(fb.getEmail())
                .message(fb.getMessage())
                .age(fb.getAge())
                .build();
    }
}