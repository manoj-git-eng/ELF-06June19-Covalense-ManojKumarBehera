package com.covalense.emp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "training_info")
public class TrainingInfoBean implements Serializable {

	@Id
	@Column(name = "CourseId")
	private Integer courseId;
	@Column(name = "CourseName")
	private String courseName;
	@Column(name = "Duration")
	private Integer duration;
	@Column(name = "CourseType")
	private String courseType;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training_info", joinColumns = {
			@JoinColumn(name = "course_id") }, inverseJoinColumns = { @JoinColumn(name = "Id") })
	List<EmployeeInfoBean> infoBeans;

}
