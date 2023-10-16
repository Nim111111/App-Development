package com.example.organify_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.organify_backend.model.Hospital;
import com.example.organify_backend.repository.HospitalRepository;


@Service
public class HospitalService {
	@Autowired
	  HospitalRepository hr;

	  public Hospital insertHospital(Hospital hospital) {
	        return hr.save(hospital);
	  }

	  public Iterable<Hospital> getAllHospitals() {
	        return hr.findAll();
	  }

	  public Hospital updateHospitals(Hospital h) {
		  
	   Hospital hh=hr.findById(h.getHospitalId()).orElse(null);
	   hh.setHospitalName(h.getHospitalName());
	   hh.setCity(h.getCity());
	   hh.setState(h.getState());
	   hh.setCountry(h.getCountry());
	   hh.setContactInfo(h.getContactInfo());
	   hh.setEmailId(h.getEmailId());
		 	 
	   return hr.save(hh);
	       
	  }

	  public void deleteHospitalById(long hospitalId) {
	        hr.deleteById(hospitalId);
	  }
}
