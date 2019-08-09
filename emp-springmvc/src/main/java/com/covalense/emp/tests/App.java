package com.covalense.emp.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.emp.dto.EducationDetailsInfoBean;
import com.covalense.emp.dto.EducationDetailsPKBean;
import com.covalense.emp.dto.EmployeeAddressInfoBean;
import com.covalense.emp.dto.EmployeeAddressPKBean;
import com.covalense.emp.dto.EmployeeExPKBean;
import com.covalense.emp.dto.EmployeeExperienceInfoBean;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.model.HibernateImpl;

public class App {
	public static void main(String[] args) throws ParseException {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

		bean.setId(3);
		bean.setName("Manoj");
		bean.setAge(20);
		bean.setSalary(50500);
		bean.setPhnum(460232);
		bean.setAccountNumber(64579495);
		Date date = format.parse("1993-02-03");
		bean.setGender("male");
		//bean.setDepartmentId("22");
		bean.setDesignation("pilot");
		bean.setEmail("manoj@gmail.com");
		bean.setDateOfBirth(date);
		bean.setJoiningDate(date);
		//bean.setManagerId("112");
		bean.setPassword("manu");

		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setAadhar(3475647);
		otherInfoBean.setBlood("A+");
		otherInfoBean.setEconact(145633333);
		otherInfoBean.setFname("bakul");
		otherInfoBean.setMname("manu");
		otherInfoBean.setIschallenged(false);
		otherInfoBean.setIsmarried(true);
		otherInfoBean.setNationality("Indian");
		otherInfoBean.setPan("257nh78");
		otherInfoBean.setPassport(1212121212);
		otherInfoBean.setReligion("Hindu");
		otherInfoBean.setSname("sandhya");

		otherInfoBean.setInfoBean(bean);
		

		//for employee address.
		EmployeeAddressPKBean addressPKBean1 = new EmployeeAddressPKBean();
		addressPKBean1.setAddresssType("T");
		addressPKBean1.setInfoBean(bean);

		EmployeeAddressPKBean addressPKBean2 = new EmployeeAddressPKBean();
		addressPKBean2.setAddresssType("P");
		addressPKBean2.setInfoBean(bean);

		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddressPKBean(addressPKBean1);
		addressInfoBean1.setAddress1("manana");
		addressInfoBean1.setAddress2("sabana");
		addressInfoBean1.setCity("bbsr");
		addressInfoBean1.setCountry("India");
		addressInfoBean1.setState("odisha");
		addressInfoBean1.setLandmark("wgdqwe");
		addressInfoBean1.setPincode(251652);

		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPKBean(addressPKBean2);
		addressInfoBean2.setAddress1("runana");
		addressInfoBean2.setAddress2("sabjfkana");
		addressInfoBean2.setCity("mysore");
		addressInfoBean2.setCountry("India");
		addressInfoBean2.setState("karnataka");
		addressInfoBean2.setLandmark("wgdqwe");
		addressInfoBean2.setPincode(951652);
		
		//for education details.
		EducationDetailsPKBean educationDetailsPKBean1=new EducationDetailsPKBean();
		educationDetailsPKBean1.setInfoBean(bean);
		educationDetailsPKBean1.setEducationType("engineering");
		
		EducationDetailsPKBean educationDetailsPKBean2=new EducationDetailsPKBean();
		educationDetailsPKBean2.setInfoBean(bean);
		educationDetailsPKBean2.setEducationType("master");
		
		
		EducationDetailsInfoBean educationDetailsInfoBean1=new EducationDetailsInfoBean();
		educationDetailsInfoBean1.setEducationDetailsPKBean(educationDetailsPKBean1);
		educationDetailsInfoBean1.setCollege("pfgmec");
		educationDetailsInfoBean1.setBranch("EgfE");
		educationDetailsInfoBean1.setPassout(2018);
		
		EducationDetailsInfoBean educationDetailsInfoBean2=new EducationDetailsInfoBean();
		educationDetailsInfoBean2.setEducationDetailsPKBean(educationDetailsPKBean2);
		educationDetailsInfoBean2.setCollege("pmzsec");
		educationDetailsInfoBean2.setBranch("EEty");
		educationDetailsInfoBean2.setPassout(2018);
		
		
		
		
		//for employee experience details.
		EmployeeExPKBean employeeExPKBean1=new EmployeeExPKBean();
		employeeExPKBean1.setInfoBean(bean);
		employeeExPKBean1.setCompanyName("covalense");
		
		EmployeeExPKBean employeeExPKBean2=new EmployeeExPKBean();
		employeeExPKBean2.setInfoBean(bean);
		employeeExPKBean2.setCompanyName("intel");
		
		EmployeeExperienceInfoBean employeeExperienceInfoBean1=new EmployeeExperienceInfoBean();
		employeeExperienceInfoBean1.setEmployeeExPKBean(employeeExPKBean1);
		employeeExperienceInfoBean1.setTechnology("fdh");
		employeeExperienceInfoBean1.setExperienceYear(5);
		
		EmployeeExperienceInfoBean employeeExperienceInfoBean2=new EmployeeExperienceInfoBean();
		employeeExperienceInfoBean2.setEmployeeExPKBean(employeeExPKBean2);
		employeeExperienceInfoBean2.setTechnology("jadfdfva");
		employeeExperienceInfoBean2.setExperienceYear(5);

		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(bean, otherInfoBean, 
				Arrays.asList(addressInfoBean1, addressInfoBean2),
				Arrays.asList(educationDetailsInfoBean1,educationDetailsInfoBean2),
				Arrays.asList(employeeExperienceInfoBean1,employeeExperienceInfoBean2));
	}
}
