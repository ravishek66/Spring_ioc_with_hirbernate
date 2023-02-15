package com.qsp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Aadharcard {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
 @Value("Darbhanga")
	private String address;
 @Value("98765434567")
	private String Aaddharno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAaddharno() {
		return Aaddharno;
	}
	public void setAaddharno(String aaddharno) {
		Aaddharno = aaddharno;
	}
	@Override
	public String toString() {
		return "Aadharcard [id=" + id + ", address=" + address + ", Aaddharno=" + Aaddharno + "]";
	}
	
	
}
