package com.example.organify_backend.model;
	

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="donorrtable")
public class Donor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	private long donorId;
	
	@Column(name="firstName")
    private String firstName;
	
	@Column(name="lastName")
    private String lastName;
	
	@Column(name="fatherName")
    private String fatherName;
	
	@Column(name="address")
    private String address;
	
	@Column(name="city")
    private String city;
	
	@Column(name="state")
    private String state;
	
	@Column(name="country")
    private String country;
	
	@Column(name="mobile")
	private String mobile;	
	
	@Column(name="email")
	private String email;	

	@Column(name="dob")
	private String dob;
	
	@Column(name="age")
	private String age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="blood_Type")
	private String bloodType;
	
	@Column(name="organ_Type")
    private String organType;	
	
	@Column(name="willingToBe_LivingDonor")
    private Boolean willingToBeLivingDonor=false;
	
	@Column(name="health_Conditions")
    private String healthConditions;	
	
	@Column(name="addition_Comments")
    private String additionalComments;
	

	@Column(name="consent")
    private Boolean consent=false;
	
	@Column(name="consent2")
    private Boolean consent2=false;
		
	 
	public Donor() {
		super();
	}


	public Donor(long donorId, String firstName, String lastName, String fatherName, String address, String city,
			String state, String country, String mobile, String email, String dob, String age, String gender,
			String bloodType, String organType, Boolean willingToBeLivingDonor, String healthConditions,
			String additionalComments, Boolean consent, Boolean consent2) {
		super();
		this.donorId = donorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
		this.organType = organType;
		this.willingToBeLivingDonor = willingToBeLivingDonor;
		this.healthConditions = healthConditions;
		this.additionalComments = additionalComments;
		this.consent = consent;
		this.consent2 = consent2;
	}


	public long getDonorId() {
		return donorId;
	}


	public void setDonorId(long donorId) {
		this.donorId = donorId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBloodType() {
		return bloodType;
	}


	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}


	public String getOrganType() {
		return organType;
	}


	public void setOrganType(String organType) {
		this.organType = organType;
	}


	public boolean isWillingToBeLivingDonor() {
		return willingToBeLivingDonor;
	}


	public void setWillingToBeLivingDonor(Boolean willingToBeLivingDonor) {
		this.willingToBeLivingDonor = willingToBeLivingDonor;
	}


	public String getHealthConditions() {
		return healthConditions;
	}


	public void setHealthConditions(String healthConditions) {
		this.healthConditions = healthConditions;
	}


	public String getAdditionalComments() {
		return additionalComments;
	}


	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}


	public boolean isConsent() {
	    return consent != null ? consent.booleanValue() : false;
	}


	public void setConsent(Boolean consent) {
		this.consent = consent;
	}


	public boolean isConsent2() {
		return consent != null ? consent.booleanValue() : false;
	}


	public void setConsent2(Boolean consent2) {
		this.consent2 = consent2;
	}


	@Override
	public String toString() {
		return "Donor [donorId=" + donorId + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherName="
				+ fatherName + ", address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", mobile=" + mobile + ", email=" + email + ", dob=" + dob + ", age=" + age + ", gender=" + gender
				+ ", bloodType=" + bloodType + ", organType=" + organType + ", willingToBeLivingDonor="
				+ willingToBeLivingDonor + ", healthConditions=" + healthConditions + ", additionalComments="
				+ additionalComments + ", consent=" + consent + ", consent2=" + consent2 + "]";
	}
   
	

			
	

}