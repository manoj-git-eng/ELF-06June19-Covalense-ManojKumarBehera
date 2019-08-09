package com.covalense.emp.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.TrainingInfoBean;
import com.covalense.hibernateapp.model.HibernateImpl;

public class ManyToManyTest {
	public static void main(String[] args) throws ParseException {

		EmployeeInfoBean bean1 = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

		bean1.setId(1);
		bean1.setName("Manoj");
		bean1.setAge(20);
		bean1.setSalary(50500);
		bean1.setPhnum(460232);
		bean1.setAccountNumber(64579495);
		Date date1 = format.parse("1993-02-03");
		bean1.setGender("male");
		//bean1.setDepartmentId("22");
		bean1.setDesignation("pilot");
		bean1.setEmail("manoj@gmail.com");
		bean1.setDateOfBirth(date1);
		bean1.setJoiningDate(date1);
		bean1.setPassword("manu");
		bean1.setMngrId(bean1);

		EmployeeInfoBean bean2 = new EmployeeInfoBean();

		bean2.setId(2);
		bean2.setName("Manoj");
		bean2.setAge(20);
		bean2.setSalary(50500);
		bean2.setPhnum(460232);
		bean2.setAccountNumber(64579495);
		Date date2 = format.parse("1993-02-03");
		bean2.setGender("male");
		//bean2.setDepartmentId("22");
		bean2.setDesignation("pilot");
		bean2.setEmail("manoj@gmail.com");
		bean2.setDateOfBirth(date2);
		bean2.setJoiningDate(date2);
		bean2.setPassword("manu");
		bean2.setMngrId(bean1);

		EmployeeInfoBean bean3 = new EmployeeInfoBean();

		bean3.setId(3);
		bean3.setName("Manoj");
		bean3.setAge(20);
		bean3.setSalary(50500);
		bean3.setPhnum(460232);
		bean3.setAccountNumber(64579495);
		Date date3 = format.parse("1993-02-03");
		bean3.setGender("male");
		//bean3.setDepartmentId("22");
		bean3.setDesignation("pilot");
		bean3.setEmail("manoj@gmail.com");
		bean3.setDateOfBirth(date3);
		bean3.setJoiningDate(date3);
		bean3.setPassword("manu");
		bean3.setMngrId(bean1);

		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseId(101);
		trainingInfoBean.setCourseName("java");
		trainingInfoBean.setDuration(123);
		trainingInfoBean.setInfoBeans(Arrays.asList(bean1, bean2, bean3));

		HibernateImpl impl = new HibernateImpl();

		impl.createTrainingList(Arrays.asList(trainingInfoBean));

	}
}
