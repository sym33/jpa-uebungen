package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.time.LocalDate;


/**
 * The persistent class for the patient database table.
 * 
 */
@Entity
@NamedQuery(name="Patient.findAll", query="SELECT p FROM Patient p")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer patientnb;

	private LocalDate birthdate;

	private String city;

	private String firstname;

	private String gender;

	private String insurancenb;

	private String name;

	private String phone;

	private String street;

	private String zip;

	public Patient() {
	}

	public Integer getPatientnb() {
		return this.patientnb;
	}

	public void setPatientnb(Integer patientnb) {
		this.patientnb = patientnb;
	}

	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInsurancenb() {
		return this.insurancenb;
	}

	public void setInsurancenb(String insurancenb) {
		this.insurancenb = insurancenb;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
