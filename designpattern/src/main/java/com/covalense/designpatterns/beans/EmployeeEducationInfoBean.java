package com.covalense.designpatterns.beans;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeEducationInfoBean {
	private int id;			
	private String educationType;
	private String degreeType	;
	private String branch	;		
	private String collageNm;		
	private String university;		
	private Date yop	;		
	private double percentage;		
	private String location	;	


}
