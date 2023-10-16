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
import com.example.organify_backend.constant.*;
import com.example.organify_backend.service.*;

@RestController
@RequestMapping("/donor")
@CrossOrigin(origins = "http://localhost:3000")
public class DonorController {
	@Autowired
    private DonorService service;

	@PostMapping("/add")
    public String insert(@RequestBody Donor donor) {
        service.insertDonor(donor);
        return "Your records have been added";
    }
	

	@GetMapping("/getDetails")
    public List<Donor> getAllDonors() {
        return (List<Donor>) service.getAllDonors();
    }

	 @PutMapping("/put/{id}")
	 public Donor updateDetails(@RequestBody Donor d,@RequestParam long id) {
	        d.setDonorId(id); // Assuming you want to update by ID
	        return service.updateDonors(d);
	 }

	 @DeleteMapping("/delete/{id}")
	 public String donorDeletebyId(@PathVariable("id") long donorId) {
	        service.deleteDonorById(donorId);
	        return "Your records have been deleted for the donor id:" + donorId + ".";
	 }

}