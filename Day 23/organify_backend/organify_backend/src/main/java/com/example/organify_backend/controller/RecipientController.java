package com.example.organify_backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.organify_backend.model.*;
import com.example.organify_backend.service.*;

@RestController
@RequestMapping("/recipient")
@CrossOrigin(origins = "http://localhost:3000")
public class RecipientController {
	@Autowired
    private RecipientService service;

	@PostMapping("/add")
    public String insert(@RequestBody Recipient recipient) {
        service.insertRecipient(recipient);
        return "Your records have been added";
    }
	

	@GetMapping("/getDetails")
    public List<Recipient> getAllDonors() {
        return (List<Recipient>) service.getAllRecipients();
    }

	 @PutMapping("/put/{id}")
	 public Recipient updateDetails(@RequestBody Recipient r,@RequestParam long id) {
	        r.setRecipientId(id); // Assuming you want to update by ID
	        return service.updateRecipient(r);
	 }

	 @DeleteMapping("/delete/{id}")
	 public String recipientDeletebyId(@PathVariable("id") long recipientId) {
	        service.deleteRecipientById(recipientId);
	        return "Your records have been deleted for the donor id:" + recipientId + ".";
	 }
}