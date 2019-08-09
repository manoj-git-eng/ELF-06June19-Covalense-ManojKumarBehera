package com.covalense.emp.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.emp.dto.EmployeeAddressInfoBean;
import com.covalense.emp.dto.EmployeeAddressPKBean;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.model.HibernateImpl;

public class App4 {
	public static void main(String[] args) throws ParseException {

		EmployeeInfoBean bean = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

		bean.setId(370);
		bean.setName("Modi");
		bean.setAge(62);
		bean.setSalary(80500);
		bean.setPhnum(460232);
		bean.setAccountNumber(64579495);
		Date date = format.parse("1993-02-03");
		bean.setGender("male");
		//bean.setDepartmentInfoBean(departmentInfoBean);
		bean.setDesignation("pilot");
		bean.setEmail("manoj@gmail.com");
		bean.setDateOfBirth(date);
		bean.setJoiningDate(date);
		// bean.setManagerId("112");
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
		bean.setEmployeeOtherInfoBean(otherInfoBean);

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
		
		bean.setAddressInfoBean(Arrays.asList(addressInfoBean1,addressInfoBean2));
		

		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(bean);

	}
}
