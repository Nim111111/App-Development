package com.example.organify_backend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.organify_backend.model.*;
import com.example.organify_backend.repository.*;

@Service
public class RecipientService {
	  @Autowired
	  RecipientRepository rr;

	  public Recipient insertRecipient(Recipient recipient) {
	        return rr.save(recipient);
	  }

	  public Iterable<Recipient> getAllRecipients() {
	        return rr.findAll();
	  }

	  public Recipient updateRecipient(Recipient r) {
		  
	   Recipient rrr=rr.findById(r.getRecipientId()).orElse(null);
	   rrr.setFirstName(r.getFirstName());
	   rrr.setLastName(r.getLastName());
	   rrr.setAddress(r.getAddress());
	   rrr.setCity(r.getCity());
	   rrr.setCountry(r.getCountry());
	   rrr.setMobile(r.getMobile());
	   rrr.setEmail(r.getEmail());
	   rrr.setAge(r.getAge());
	   rrr.setGender(r.getGender());
	   rrr.setOrganType(r.getOrganType());
	   rrr.setBloodType(r.getBloodType());
	   rrr.setAdditionalComments(r.getAdditionalComments());
		 	 
	   return rr.save(rrr);
	       
	  }

	  public void deleteRecipientById(long recipientId) {
	        rr.deleteById(recipientId);
	  }

}