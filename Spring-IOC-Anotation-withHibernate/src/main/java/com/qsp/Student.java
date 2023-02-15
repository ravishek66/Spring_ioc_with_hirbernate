package com.qsp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Value("Ravishek")
	private String name;
    @Value("Male")
	private String gender;
    
    @OneToOne
    @Autowired
    private Aadharcard aadharcard;
    
    
	public Aadharcard getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(Aadharcard aadharcard) {
		this.aadharcard = aadharcard;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", aadharcard=" + aadharcard + "]";
	}
	
    
    
    
}
