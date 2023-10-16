package com.example.organify_backend.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="recipienttable")
public class Recipient {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	private long recipientId;
	
	@Column(name="firstName")
    private String firstName;
	
	@Column(name="lastName")
    private String lastName;
		
	@Column(name="address")
    private String address;
	
	@Column(name="city")
    private String city;
		
	@Column(name="country")
    private String country;
	
	@Column(name="mobile")
	private String mobile;	
	
	@Column(name="email")
	private String email;	

	
	@Column(name="age")
	private String age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="blood_Type")
	private String bloodType;
	
	@Column(name="organ_Type")
    private String organType;	
	
	@Column(name="additional_Comments")
    private String additionalComments;

	public Recipient() {
		super();
	}

	public Recipient(long recipientId, String firstName, String lastName, String address, String city, String country,
			String mobile, String email, String age, String gender, String bloodType, String organType,
			String additionalComments) {
		super();
		this.recipientId = recipientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.mobile = mobile;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
		this.organType = organType;
		this.additionalComments = additionalComments;
	}

	public long getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(long recipientId) {
		this.recipientId = recipientId;
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

	public String getAdditionalComments() {
		return additionalComments;
	}

	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}

	@Override
	public String toString() {
		return "Recipient [recipientId=" + recipientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", city=" + city + ", country=" + country + ", mobile=" + mobile + ", email="
				+ email + ", age=" + age + ", gender=" + gender + ", bloodType=" + bloodType + ", organType="
				+ organType + ", additionalComments=" + additionalComments + "]";
	}	
	
	
	
	
}