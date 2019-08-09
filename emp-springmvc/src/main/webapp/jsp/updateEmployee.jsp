<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.dto.EmployeeExperienceInfoBean"%>
<%@page import="com.covalense.emp.dto.EducationDetailsInfoBean"%>
<%@page import="com.covalense.emp.dto.EmployeeAddressInfoBean"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.covalense.emp.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="true"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Registration!!</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function add() {
		document.getElementById("otherId").value = document
				.getElementById("id").value;
	}
</script>
<style>
table {
	background: rgb(113, 219, 170);
	height: 200px;
	width: 900px;
}
</style>
</head>
<%
	EmployeeInfoBean infoBean = (EmployeeInfoBean) session.getAttribute("infoBean");
%>
<body style="background: rgb(133, 150, 151)">
	<center>
		<table>
			<tr>
				<td>${msg}


					<h1>Employee Registration.</h1>

					<div class="container">

						EMPLOYEE INFORMATION <input type="button" data-toggle="collapse"
							data-target="#empInfo" value="+" />
						<hr>




						<!--  <button data-toggle="collapse" data-target="#empOtherInfo">Employee
			Other Information</button>  -->
						<div id="empInfo" class="collapse">
							<div class="container">
								<p class="h3" style="text-align: center;">EMPLOYEE
									INFORMATION</p>
								<hr>
								<form action="./create" method="POST">
									<div class="row">
										<div class="col">
											<label for="Employee Id">ID</label> <input type="number"
												class="form-control" onkeyup="add()" required id="id"
												name="id" placeholder="ID" value="<%=infoBean.getId()%>">
										</div>
										<div class="col">
											<label for="Account Number">ACCOUNT NUMBER</label> <input
												type="number" class="form-control" name="accountNumber"
												placeholder="ACCOUNT NUMBER"
												value="<%=infoBean.getAccountNumber()%>">
										</div>
									</div>
									<div class="row">
										<div class="col">
											<label for="Emp Name">NAME</label> <input type="text"
												class="form-control" name="name" placeholder="NAME"
												value="<%=infoBean.getName()%>">
										</div>
										<div class="col">
											<label for="Email">EMAIL ID</label> <input type="email"
												class="form-control" name="email" placeholder="EMAIL ID"
												value="<%=infoBean.getEmail()%>">
										</div>
									</div>
									<div class="row">
										<div class="col">
											<label for="password">Password</label> <input type="password"
												class="form-control" name="password" placeholder="Password"
												value="<%=infoBean.getPassword()%>">
										</div>
										<div class="col">
											<label for="confirmPassword">Confirm Password</label> <input
												type="password" class="form-control" name="cnfPass"
												placeholder="Confirm Password">
										</div>
									</div>
									<div class="row">
										<div class="col">
											<label for="Age">AGE</label> <input type="number"
												class="form-control" name="age" placeholder="AGE"
												value="<%=infoBean.getAge()%>">
										</div>
										<div class="col">
											<label for="Designation">DESIGNATION</label> <input
												type="text" class="form-control" name="designation"
												placeholder="DESIGNATION"
												value="<%=infoBean.getDesignation()%>">
										</div>
									</div>
									<div class="row">
										<div class="col">
											<label for="inputGender">Gender</label> <select
												class="form-control" name="gender">
												<%
													if (infoBean.getGender().equals("male")) {
												%>
												<option value="male" selected="selected">male</option>
												<option value="female">female</option>
												<%
													} else {
												%>
												<option value="male">male</option>
												<option value="female" selected="selected">female</option>
												<%
													}
												%>
											</select>
										</div>
										<div class="col">
											<label for="DOB">Date of Birth</label> <input type="date"
												class="form-control" name="dateOfBirth"
												placeholder="yyyy-mm-dd"
												value="<%=infoBean.getDesignation()%>">
										</div>
									</div>
									<div class="row">
										<div class="col">
											<label for="Salary">SALARY</label> <input type="number"
												class="form-control" name="salary" placeholder="SALARY"
												value="<%=infoBean.getSalary()%>">
										</div>
										<div class="col">
											<label for="DeptId">DEPAETMENT ID</label> <input
												type="number" class="form-control" name="departmentId.id"
												placeholder="DEPAETMENT ID"
												value="<%=infoBean.getDepartmentInfoBean()%>">
										</div>
									</div>
									<div class="row">
										<div class="col">
											<label for="Phone">PHONE NUMBER</label> <input type="tel"
												class="form-control" name="phnum" placeholder="PHONE NUMBER"
												value="<%=infoBean.getPhnum()%>">
										</div>
										<div class="col">
											<label for="Manager">MANAGER ID</label> <input type="number"
												class="form-control" name="managerId.id"
												placeholder="MANAGER ID" value="<%=infoBean.getMngrId()%>">
										</div>
									</div>
									<div class="row">

										<div class="col-6">
											<label for="Joining Date">JOINING DATE</label> <input
												type="date" class="form-control" name="joiningDate"
												placeholder="JOINING DATE"
												value="<%=infoBean.getJoiningDate()%>">
										</div>

										<div class="col-3">
											<br>
											<button type="reset"
												class="form-control btn btn-outline-secondary">reset</button>
										</div>



									</div>
									<hr>
									EMPLOYEE OTHER INFORMATION <input type="button"
										data-toggle="collapse" data-target="#empOtherInfo" value="+" />
									<hr>

									<div id="empOtherInfo" class="collapse">
										<!-- <div class="container"> -->
										<p class="h3" style="text-align: center;">EMPLOYEE OTHER
											INFORMATION</p>
										<hr>
										<!-- <form action="/create" method="POST"> -->
										<div class="row">

											<div class="col">
												<label for="exampleInputemergenum">Emergency Contact
													Number</label> <input type="tel" class="form-control"
													name="employeeOtherInfoBean.econact"
													placeholder="Please Enter Emergency Contact Number"
													value="<%=infoBean.getEmployeeOtherInfoBean().getEconact()%>">
											</div>
											<div class="col">
												<label for="exampleInputmotname">Mother Name</label> <input
													type="text" class="form-control" id="mothername"
													name="employeeOtherInfoBean.mname"
													placeholder="Please Enter Mother Name"
													value="<%=infoBean.getEmployeeOtherInfoBean().getMname()%>">
											</div>
										</div>
										<div class="row">
											<div class="col">
												<label for="exampleInputPan">Pan Number</label> <input
													type="text" class="form-control"
													name="employeeOtherInfoBean.pan"
													placeholder="Please Enter Pan Number"
													value="<%=infoBean.getEmployeeOtherInfoBean().getPan()%>">
											</div>

											<div class="col">
												<label for="exampleInputspouse">Spouse Name</label> <input
													type="text" class="form-control"
													name="employeeOtherInfoBean.sname"
													placeholder="Please Enter Spouse Name"
													value="<%=infoBean.getEmployeeOtherInfoBean().getSname()%>">
											</div>
										</div>
										<div class="row">
											<div class="col">
												<label for="inputStatus">Marrital Status</label> <select
													name="employeeOtherInfoBean.ismarried" class="form-control">
													<%
														if (infoBean.getEmployeeOtherInfoBean().getIsmarried().equals("Married")) {
													%>
													<option>Select</option>
													<option value="true" selected="selected">Married</option>
													<option value="false">Unmarried</option>
													<%
														} else {
													%>
													<option>Select</option>
													<option value="false">Married</option>
													<option value="true" selected="selected">Unmarried</option>
													<%
														}
													%>

												</select>
											</div>
											<div class="col">
												<label for="inputnationality">Nationality</label> <select
													name="employeeOtherInfoBean.nationality"
													class="form-control">
													<%
														if (infoBean.getEmployeeOtherInfoBean().getNationality().equals("Indian")) {
													%>
													<option value="indian" selected="selected">Indian</option>
													<option value="other">Other</option>
													<%
														} else {
													%>
													<option value="indian">Indian</option>
													<option value="other" selected="selected">Other</option>
													<%
														}
													%>
												</select>
											</div>
											<div class="col">
												<label for="exampleInputpassport">Passport Number</label> <input
													type="text" class="form-control"
													name="employeeOtherInfoBean.passport"
													placeholder="Please Enter Passport Number"
													value="<%=infoBean.getEmployeeOtherInfoBean().getPassport()%>">
											</div>
										</div>
										<div class="row">
											<div class="col">
												<label for="inputbloodgrp">Blood Group</label> <select
													name="employeeOtherInfoBean.blood" class="form-control">
													<%
														if (infoBean.getEmployeeOtherInfoBean().getBlood().equals("AB+")) {
													%>
													<option value="AB+" selected="selected">AB+</option>
													<option value="AB-">AB-</option>
													<option value="A+">A+</option>
													<option value="A-">A-</option>
													<option value="o+">o+</option>
													<option value="o-">o-</option>
													<%
														} else if (infoBean.getEmployeeOtherInfoBean().getBlood().equals("AB-")) {
													%>
													<option value="AB+">AB+</option>
													<option value="AB-" selected="selected">AB-</option>
													<option value="A+">A+</option>
													<option value="A-">A-</option>
													<option value="o+">o+</option>
													<option value="o-">o-</option>
													<%
														} else if (infoBean.getEmployeeOtherInfoBean().getBlood().equals("A+")) {
													%>
													<option value="AB+">AB+</option>
													<option value="AB-">AB-</option>
													<option value="A+" selected="selected">A+</option>
													<option value="A-">A-</option>
													<option value="o+">o+</option>
													<option value="o-">o-</option>
													<%
														} else if (infoBean.getEmployeeOtherInfoBean().getBlood().equals("A-")) {
													%>
													<option value="AB+">AB+</option>
													<option value="AB-">AB-</option>
													<option value="A+">A+</option>
													<option value="A-" selected="selected">A-</option>
													<option value="o+">o+</option>
													<option value="o-">o-</option>
													<%
														} else if (infoBean.getEmployeeOtherInfoBean().getBlood().equals("o+")) {
													%>
													<option value="AB+">AB+</option>
													<option value="AB-">AB-</option>
													<option value="A+">A+</option>
													<option value="A-">A-</option>
													<option value="o+" selected="selected">o+</option>
													<option value="o-">o-</option>
													<%
														} else {
													%>
													<option value="AB+">AB+</option>
													<option value="AB-">AB-</option>
													<option value="A+">A+</option>
													<option value="A-">A-</option>
													<option value="o+">o+</option>
													<option value="o-" selected="selected">o-</option>
													<%
														}
													%>



												</select>
											</div>
											<div class="col">
												<label for="inputreligion">Religion</label> <select
													name="employeeOtherInfoBean.religion" class="form-control">
													<%
														if (infoBean.getEmployeeOtherInfoBean().getReligion().equals("Hindu")) {
													%>
													<option value="hindu" selected="selected">Hindu</option>
													<option value="christian">Christian</option>
													<option value="muslim">Muslim</option>
													<%
														} else if (infoBean.getEmployeeOtherInfoBean().getReligion().equals("Christian")) {
													%>
													<option value="hindu">Hindu</option>
													<option value="christian" selected="selected">Christian</option>
													<option value="muslim">Muslim</option>
													<%
														} else {
													%>
													<option value="hindu">Hindu</option>
													<option value="christian">Christian</option>
													<option value="muslim" selected="selected">Muslim</option>
													<%
														}
													%>


												</select>
											</div>
											<div class="col">
												<label for="exampleInputaadhar">Aadhar Number</label> <input
													type="text" class="form-control"
													name="employeeOtherInfoBean.aadhar"
													placeholder="Please Enter Aadhar Number"
													value="<%=infoBean.getEmployeeOtherInfoBean().getAadhar()%>">
											</div>
										</div>
										<div class="row">
											<div class="col-4">
												<label for="inputphysicallych">Physically Challenged</label>
												<select name="employeeOtherInfoBean.ischallenged"
													class="form-control">
													<%
														if (infoBean.getEmployeeOtherInfoBean().getIschallenged().equals("Yes")) {
													%>
													<option value="true" selected="selected">Yes</option>
													<option value="false">No</option>
													<%
														} else {
													%>
													<option value="false">Yes</option>
													<option value="true" selected="selected">No</option>
													<%
														}
													%>

												</select>
											</div>
											<div class="col-4">
												<label for="exampleInputfather">Father Name</label> <input
													type="text" class="form-control"
													name="employeeOtherInfoBean.fname"
													placeholder="Please Enter Father Number"
													value="<%=infoBean.getEmployeeOtherInfoBean().getFname()%>">
											</div>


											<div class="col-2">
												<br>
												<button type="reset"
													class="form-control btn btn-outline-secondary">reset</button>
											</div>
										</div>

										<hr>
										EMPLOYEE ADDRESS INFORMATION <input type="button"
											data-toggle="collapse" data-target="#empAddressInfo"
											value="+" />
										<hr>


										<%
												List<EmployeeAddressInfoBean> addressInfoBean=infoBean.getAddressInfoBean();
														int i=0;
														for(EmployeeAddressInfoBean addressInfoBean2:addressInfoBean){
															
														

										%>
										<div id="empAddressInfo" class="collapse">
											<p class="h3" style="text-align: center;">EMPLOYEE
												ADDRESS INFORMATION</p>
											<hr>
											
											<div class="row">

												<div class="col">
													<label for="city">City</label> <input type="text"
														class="form-control" id="city" placeholder="Enter City"
														name="addressInfoBean[<%=i%>].city">
												</div>
											</div>
											<div class="row">
												<div class="col">
													<label for="address type">Address Type</label> <input
														type="text" class="form-control" id="addresstype"
														placeholder="Enter Address Type"
														name="addressInfoBean[<%=i%>].addressPKBean.addresssType">
												</div>
												<div class="col">
													<label for="state">State</label> <input type="text"
														class="form-control" id="state" placeholder="Enter State"
														name="addressInfoBean[<%=i%>].state">
												</div>
											</div>
											<div class="row">
												<div class="col">
													<label for="address1">Address1 </label> <input type="text"
														class="form-control" id="address1"
														placeholder="Enter Address 1"
														name="addressInfoBean[<%=i%>].address1">
												</div>
												<div class="col">
													<label for="country">Country </label> <input type="text"
														class="form-control" id="country"
														placeholder="Enter Country"
														name="addressInfoBean[<%=i%>].country">
												</div>
											</div>

											<div class="row">
												<div class="col">
													<label for="address2">Address 2 </label> <input type="text"
														class="form-control" id="address2"
														placeholder="Enter Address 2"
														name="addressInfoBean[<%=i%>].address2">
												</div>
												<div class="col">
													<label for="pin">Pincode</label> <input type="number"
														class="form-control" id="pincode"
														placeholder="Enter Pincode"
														name="addressInfoBean[<%=i%>].pincode">
												</div>
											</div>

											<div class="row">

												<div class="col-6">
													<label for="landmark">Landmark</label> <input type="text"
														class="form-control" id="landmark"
														placeholder="Enter Landmark"
														name="addressInfoBean[<%=i%>].landmark">
												</div>


												<div class="col-2">
													<br>
													<button type="reset"
														class="form-control btn btn-outline-secondary">reset</button>
												</div>

											</div>
											<%
											i++;
														}
														
											%>
											<!-- <hr>
											EMPLOYEE TEMPORARY ADDRESS INFORMATION <input type="button"
												data-toggle="collapse"
												data-target="#empTempararyAddressInfo" value="+" />
											<hr>
										</div>

										<hr>
										<div id="empTempararyAddressInfo" class="collapse">
											<p class="h5" style="text-align: center;">EMPLOYEE
												TEMPARARY ADDRESS</p>
											<div class="row">

												<div class="col">
													<label for="city">City</label> <input type="text"
														class="form-control" id="city" placeholder="Enter City"
														name="addressInfoBean[1].city">
												</div>
											</div>
											<div class="row">
												<div class="col">
													<label for="address type">Address Type</label> <input
														type="text" class="form-control" id="addresstype"
														placeholder="Enter Address Type"
														name="addressInfoBean[1].addressPKBean.addresssType">
												</div>
												<div class="col">
													<label for="state">State</label> <input type="text"
														class="form-control" id="state" placeholder="Enter State"
														name="addressInfoBean[1].state">
												</div>
											</div>
											<div class="row">
												<div class="col">
													<label for="address1">Address1 </label> <input type="text"
														class="form-control" id="address1"
														placeholder="Enter Address 1"
														name="addressInfoBean[1].address1">
												</div>
												<div class="col">
													<label for="country">Country </label> <input type="text"
														class="form-control" id="country"
														placeholder="Enter Country"
														name="addressInfoBean[1].country">
												</div>
											</div>

											<div class="row">
												<div class="col">
													<label for="address2">Address 2 </label> <input type="text"
														class="form-control" id="address2"
														placeholder="Enter Address 2"
														name="addressInfoBean[1].address2">
												</div>
												<div class="col">
													<label for="pin">Pincode</label> <input type="number"
														class="form-control" id="pincode"
														placeholder="Enter Pincode"
														name="addressInfoBean[1].pincode">
												</div>
											</div>

											<div class="row">

												<div class="col-6">
													<label for="landmark">Landmark</label> <input type="text"
														class="form-control" id="landmark"
														placeholder="Enter Landmark"
														name="addressInfoBean[1].landmark">
												</div>

												<div class="col-3">
													<br>
													<button type="reset"
														class="form-control btn btn-outline-secondary">reset</button>
												</div>

											</div> -->
											<hr>

											<%
											List<EducationDetailsInfoBean> educationDetailsInfoBean=infoBean.getEducationDetailsInfoBeans();
															int j=0;
															for(EducationDetailsInfoBean educationDetailsInfoBean2:educationDetailsInfoBean){
																
															}
											%>
											EMPLOYEE EDUCATION INFORMATION <input type="button"
												data-toggle="collapse" data-target="#empEducationInfo"
												value="+" />
											<hr>
										</div>

										<hr>
										<div id="empEducationInfo" class="collapse">
											<p class="h3" style="text-align: center;">EMPLOYEE
												EDUCATION INFORMATION</p>

											<div class="row">
												<div class="col">
													<label for="Education">Education Type</label> <input
														type="text" id="educationtype"
														placeholder="Enter Education Type" class="form-control"
														autofocus
														name="educationDetailsInfoBeans[<%=j%>].educationDetailsPKBean.educationType">
												</div>

											</div>
											<div class="row">
												<div class="col">
													<label for="branch" class="col-sm-3 control-label">Branch</label>
													<input type="branch" id="branch" placeholder="Enter Branch"
														class="form-control"
														name="educationDetailsInfoBeans[<%=j%>].branch">
												</div>
												<div class="col">
													<label for="college" class="col-sm-3 control-label">College
														Name</label> <input type="text" id="collge"
														placeholder="Enter College Name" class="form-control"
														name="educationDetailsInfoBeans[<%=j%>].college">
												</div>
											</div>
											<div class="row">
												<div class="col">
													<label for="yop">Year of Passing</label> <input type="date"
														id="yop" class="form-control"
														name="educationDetailsInfoBeans[<%=j%>].passout">

												</div>






												<div class="col">
													<br>
													<button type="reset"
														class="form-control btn btn-outline-secondary">reset</button>
												</div>

											</div>
											<hr>
											<%
											j++;
													}
											%>


											<!-- EMPLOYEE EDUCATION INFORMATION <input type="button"
												data-toggle="collapse" data-target="#empEducationInfo2"
												value="+" />
											<hr>
										</div>

										<hr>
										<div id="empEducationInfo2" class="collapse">
											<p class="h3" style="text-align: center;">EMPLOYEE
												EDUCATION INFORMATION</p>
											<div class="row">
												<div class="col">
													<label for="Education">Education Type</label> <input
														type="text" id="educationtype"
														placeholder="Enter Education Type" class="form-control"
														autofocus
														name="educationDetailsInfoBeans[1].educationDetailsPKBean.educationType">
												</div>

											</div>
											<div class="row">
												<div class="col">
													<label for="branch" class="col-sm-3 control-label">Branch</label>
													<input type="branch" id="branch" placeholder="Enter Branch"
														class="form-control"
														name="educationDetailsInfoBeans[1].branch">
												</div>
												<div class="col">
													<label for="college" class="col-sm-3 control-label">College
														Name</label> <input type="text" id="collge"
														placeholder="Enter College Name" class="form-control"
														name="educationDetailsInfoBeans[1].college">
												</div>
											</div>
											<div class="row">
												<div class="col">
													<label for="yop">Year of Passing</label> <input type="date"
														id="yop" class="form-control"
														name="educationDetailsInfoBeans[1].passout">

												</div>



												<div class="col">
													<br>
													<button type="reset"
														class="form-control btn btn-outline-secondary">reset</button>
												</div>

											</div> -->
											<hr>
											<%
											List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans= infoBean.getEmployeeExperienceInfoBeans();
															int k=0;
															for(EmployeeExperienceInfoBean experienceInfoBean:employeeExperienceInfoBeans){
																
															}
											%>
											EMPLOYEE EXPERIENCE INFORMATION <input type="button"
												data-toggle="collapse" data-target="#empExperienceInfo"
												value="+" />
											<hr>
										</div>

										<hr>
										<div id="empExperienceInfo" class="collapse">
											<h4 class="text-center">EMPLOYEE EXPERIENCE DETAILS</h4>
											<div class="row">
												<div class="col">
													<label for="name">Company Name</label> <input type="text"
														id="companyname" placeholder="Enter Company Name"
														class="form-control"
														name="employeeExperienceInfoBeans[<%=k%>].employeeExPKBean.companyName">
												</div>

											</div>
											<div class="row">
												<div class="col">
													<label for="Joining Date">Technology</label> <input
														type="text" class="form-control" id="Technology"
														placeholder="Enter Technology"
														name="employeeExperienceInfoBeans[<%=k%>].technology">
												</div>

												<div class="col">
													<label for="Leaving Date">Year Of Experience</label> <input
														type="text" class="form-control" id="yop"
														placeholder="Enter Year Of Experience"
														name="employeeExperienceInfoBeans[<%=k%>].experienceYear">
												</div>

												<div class="col">
													<br>
													<button type="reset"
														class="form-control btn btn-outline-secondary">reset</button>
												</div>

											</div>
											<%
											k++;
											}
											%>
											
											
											<!-- <hr>
											EMPLOYEE EXPERIENCE INFORMATION <input type="button"
												data-toggle="collapse" data-target="#empExperienceInfo1"
												value="+" />

										</div>
										<hr>
										<div id="empExperienceInfo1" class="collapse">
											<h4 class="text-center">EMPLOYEE EXPERIENCE DETAILS</h4>
											<div class="row">
												<div class="col">
													<label for="name">Company Name</label> <input type="text"
														id="companyname" placeholder="Enter Company Name"
														class="form-control"
														name="employeeExperienceInfoBeans[1].employeeExPKBean.companyName">
												</div>

											</div>
											<div class="row">
												<div class="col">
													<label for="Joining Date">Technology</label> <input
														type="text" class="form-control" id="Technology"
														placeholder="Enter Technology"
														name="employeeExperienceInfoBeans[1].technology">
												</div>

												<div class="col">
													<label for="Leaving Date">Year Of Experience</label> <input
														type="text" class="form-control" id="yop"
														placeholder="Enter Year Of Experience"
														name="employeeExperienceInfoBeans[1].experienceYear">
												</div>
											</div>

											<div class="row">
												<div class="col">
													<br>
													<button type="submit"
														class="form-control btn btn-outline-success">
														Submit</button>
												</div>

												<div class="col">
													<br>
													<button type="reset"
														class="form-control btn btn-outline-secondary">reset</button>
												</div> -->

											</div>
										</div>
								</form>
							</div>
						</div>
					</div>
				</td>
			</tr>
		</table>
	</center>
</body>



</html>