package com.example.feedback.models;
import jakarta.persistence.*;

@Entity
@Table(name = "Feedback")
public class FeedbackModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "Name")
	String name;
	@Column(name = "Email")
	String email;
	@Column(name = "Message")
	String message;
	@Column(name = "Age")
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}