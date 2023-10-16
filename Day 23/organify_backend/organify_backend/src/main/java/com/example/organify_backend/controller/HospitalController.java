package com.example.organify_backend.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.organify_backend.repository.*;
import com.example.organify_backend.model.*;
import com.example.organify_backend.service.*;


@RestController
public class HospitalController {	@Autowired
    private HospitalService service;

	@PostMapping("/addhospitaldetails")
    public String insert(@RequestBody Hospital hospital) {
        service.insertHospital(hospital);
        return "Your records have been added";
    }

	@GetMapping("/gethospitalDetails")
    public List<Hospital> getAllHospitals() {
        return (List<Hospital>) service.getAllHospitals();
    }

	 @PutMapping("/addhospitalDetails/{id}")
	 public Hospital updateDetails(@RequestBody Hospital h, @PathVariable("id") long id) {
	        h.setHospitalId(id); // Assuming you want to update by ID
	        return service.updateHospitals(h);
	 }

	 @DeleteMapping("/deletebyhospitalId/{id}")
	 public String HospitalDeletebyId(@PathVariable("id") long hospitalId) {
	        service.deleteHospitalById(hospitalId);
	        return "Your records have been deleted for the hospital id:" + hospitalId + ".";
	 }


}
