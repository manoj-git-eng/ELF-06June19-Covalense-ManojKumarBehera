package com.covalense.hibernate.dto;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class StudentBean {

	@Id
	private int rollNo;
	private String firstname;
	private String lastname;
	private String subject;
	private int totalno;

}
