package com.example.organify_backend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.organify_backend.repository.*;
import com.example.organify_backend.model.*;

@Service
public class DonorService {
	@Autowired
	  DonorRepository dr;

	  public Donor insertDonor(Donor donor) {
	        return dr.save(donor);
	  }

	  public Iterable<Donor> getAllDonors() {
	        return dr.findAll();
	  }

	  public Donor updateDonors(Donor d) {
		  
	   Donor dd=dr.findById(d.getDonorId()).orElse(null);
	   dd.setFirstName(d.getFirstName());
	   dd.setLastName(d.getLastName());
	   dd.setFatherName(d.getFatherName());
	   dd.setAddress(d.getAddress());
	   dd.setCity(d.getCity());
	   dd.setState(d.getState());
	   dd.setCountry(d.getCountry());
	   dd.setMobile(d.getMobile());
	   dd.setEmail(d.getEmail());
	   dd.setDob(d.getDob());
	   dd.setAge(d.getAge());
	   dd.setGender(d.getGender());
	   dd.setOrganType(d.getOrganType());
	   dd.setBloodType(d.getBloodType());
	   dd.setWillingToBeLivingDonor(d.isWillingToBeLivingDonor());
	   dd.setHealthConditions(d.getHealthConditions());
	   dd.setAdditionalComments(d.getAdditionalComments());
	   dd.setConsent(d.isConsent());
	   dd.setConsent2(d.isConsent2());
		 	 
	   return dr.save(dd);
	       
	  }

	  public void deleteDonorById(long donorId) {
	        dr.deleteById(donorId);
	  }
}
