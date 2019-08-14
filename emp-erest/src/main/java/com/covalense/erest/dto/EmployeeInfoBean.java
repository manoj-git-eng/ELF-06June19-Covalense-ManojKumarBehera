package com.covalense.erest.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@XmlRootElement(name="employee-info-bean")
@JsonRootName(value="employee-info-bean")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {
	
	//@XmlElement(name="employee_otherinfo")
	@JsonProperty(value="employee-otherinfo-bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;

	@JsonProperty(value="employee-addressinfo-bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;

	@JsonProperty(value="employee-educationinfo-bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationDetailsPKBean.infoBean")
	private List<EducationDetailsInfoBean> educationDetailsInfoBeans;

	@JsonProperty(value="employee-experienceinfo-bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExPKBean.infoBean")
	private List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans;

	@JsonProperty(value="employee-traininginfo-bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans;

	@Id
	@Column(name = "Id")
	private Integer id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Age")
	private Integer age;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Salary")
	private Double salary;
	@Column(name = "Phone")
	private Long phnum;
	@Column(name = "Joining_Date")
	private Date joiningDate;
	@Column(name = "Account_Number")
	private Long accountNumber;
	@Column(name = "Email")
	private String email;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "Date_Of_Birth")
	private Date dateOfBirth;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "departmentId", referencedColumnName = "dept_Id")
	private DepartmentInfoBean departmentInfoBean;

	@Column(name = "Password")
	private String password;

	// @Column(name = "Manager_Id")
	// private String managerId;

	@ManyToOne
	@JoinColumn(name = "Manager_Id", referencedColumnName = "Id")
	private EmployeeInfoBean mngrId;

	public EmployeeOtherInfoBean getEmployeeOtherInfoBean() {
		return employeeOtherInfoBean;
	}

	public void setEmployeeOtherInfoBean(EmployeeOtherInfoBean employeeOtherInfoBean) {
		this.employeeOtherInfoBean = employeeOtherInfoBean;
	}

	public List<EmployeeAddressInfoBean> getAddressInfoBean() {
		return addressInfoBean;
	}

	public void setAddressInfoBean(List<EmployeeAddressInfoBean> addressInfoBean) {
		this.addressInfoBean = addressInfoBean;
	}

	public List<EducationDetailsInfoBean> getEducationDetailsInfoBeans() {
		return educationDetailsInfoBeans;
	}

	public void setEducationDetailsInfoBeans(List<EducationDetailsInfoBean> educationDetailsInfoBeans) {
		this.educationDetailsInfoBeans = educationDetailsInfoBeans;
	}

	public List<EmployeeExperienceInfoBean> getEmployeeExperienceInfoBeans() {
		return employeeExperienceInfoBeans;
	}

	public void setEmployeeExperienceInfoBeans(List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans) {
		this.employeeExperienceInfoBeans = employeeExperienceInfoBeans;
	}

	public List<TrainingInfoBean> getTrainingInfoBeans() {
		return trainingInfoBeans;
	}

	public void setTrainingInfoBeans(List<TrainingInfoBean> trainingInfoBeans) {
		this.trainingInfoBeans = trainingInfoBeans;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getPhnum() {
		return phnum;
	}

	public void setPhnum(Long phnum) {
		this.phnum = phnum;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeInfoBean getMngrId() {
		return mngrId;
	}

	public void setMngrId(EmployeeInfoBean mngrId) {
		this.mngrId = mngrId;
	}
	
	

}
