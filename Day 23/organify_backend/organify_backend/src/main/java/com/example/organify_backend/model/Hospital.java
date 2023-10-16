package com.example.organify_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospitaltable")
public class Hospital {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	private long hospitalId;
	
	@Column(name="hospital_Name")
    private String hospitalName;
	
	
	@Column(name="city")
    private String city;
	
	@Column(name="state")
	private String  state;
	
	@Column(name="country")
	private String  country;
	
	@Column(name="contact_Info")
	private long contactInfo;	
	
	@Column(name="emailId")
    private String emailId;
	
	public Hospital() {
		super();
	}

	public Hospital(long hospitalId, String hospitalName, String city, String state, String country, long contactInfo,
			String emailId) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.contactInfo = contactInfo;
		this.emailId = emailId;
	}

	public long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(long contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", city=" + city + ", state="
				+ state + ", country=" + country + ", contactInfo=" + contactInfo + ", emailId=" + emailId + "]";
	}
	
	
	
	
}
