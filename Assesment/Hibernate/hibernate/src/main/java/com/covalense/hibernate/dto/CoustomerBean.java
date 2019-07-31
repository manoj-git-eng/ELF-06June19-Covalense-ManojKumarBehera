package com.covalense.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import lombok.Data;

@Data
@Entity
@Table(name = "coustmer")
public class CoustomerBean implements Serializable {
	
	private StudentBean student;

	@Id
	private int id;
	private String firstname;
	private String lastname;
	private long contactNumber;
	private String address;
	private String city;
	private String state;
	private String country;

}
