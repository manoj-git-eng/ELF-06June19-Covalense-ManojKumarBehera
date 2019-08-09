<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page session="false" %>

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
table{
	background: rgb(113, 219, 170);
	height: 200px;
	width: 900px;
}
</style>
</head>
<body style="background: rgb(133, 150, 151)">
	<center><table><tr><td>
	${msg}

	
	<h1>Employee Registration.</h1>

	<div class="container">
	
		EMPLOYEE INFORMATION

			<input type="button" data-toggle="collapse"
								
								data-target="#empInfo" value="+" />
                <hr>
                
                


		<!--  <button data-toggle="collapse" data-target="#empOtherInfo">Employee
			Other Information</button>  -->
		<div id="empInfo" class="collapse">
			<div class="container">
				<p class="h3" style="text-align: center;">EMPLOYEE INFORMATION</p>
				<hr>
				<form action="./create" method="POST">
					<div class="row">
						<div class="col">
							<label for="Employee Id">ID</label> <input type="number"
								class="form-control" onkeyup="add()" id="id" name="id"
								placeholder="ID">
						</div>
						<div class="col">
							<label for="Account Number">ACCOUNT NUMBER</label> <input
								type="number" class="form-control" name="accountNumber"
								placeholder="ACCOUNT NUMBER">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="Emp Name">NAME</label> <input type="text"
								class="form-control" name="name" placeholder="NAME">
						</div>
						<div class="col">
							<label for="Email">EMAIL ID</label> <input type="email"
								class="form-control" name="email" placeholder="EMAIL ID">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="password">Password</label> <input type="password"
								class="form-control" name="password" placeholder="Password">
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
								class="form-control" name="age" placeholder="AGE">
						</div>
						<div class="col">
							<label for="Designation">DESIGNATION</label> <input type="text"
								class="form-control" name="designation"
								placeholder="DESIGNATION">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="inputGender">Gender</label> <select
								class="form-control" name="gender">
								<option selected>--select one--</option>
								<option value="male">male</option>
								<option value="female">female</option>
								<option value="other">other</option>
							</select>
						</div>
						<div class="col">
							<label for="DOB">Date of Birth</label> <input type="date"
								class="form-control" name="dateOfBirth" placeholder="yyyy-mm-dd">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="Salary">SALARY</label> <input type="number"
								class="form-control" name="salary" placeholder="SALARY">
						</div>
						<div class="col">
							<label for="DeptId">DEPAETMENT ID</label> <input type="number"
								class="form-control" name="deptId" placeholder="DEPAETMENT ID">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="Phone">PHONE NUMBER</label> <input type="tel"
								class="form-control" name="phnum" placeholder="PHONE NUMBER">
						</div>
						<div class="col">
							<label for="Manager">MANAGER ID</label> <input type="number"
								class="form-control" name="mngrId" placeholder="MANAGER ID">
						</div>
					</div>
					<div class="row">

						<div class="col-6">
							<label for="Joining Date">JOINING DATE</label> <input type="date"
								class="form-control" name="joiningDate"
								placeholder="JOINING DATE">
						</div>
						
						<div class="col-3">
							<br>
							<button type="reset"
								class="form-control btn btn-outline-secondary">reset</button>
            </div>
            
            

          </div>
          <hr>
          EMPLOYEE OTHER INFORMATION
          <input type="button" data-toggle="collapse"
              data-target="#empOtherInfo" value="+" />
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
									placeholder="Please Enter Emergency Contact Number">
							</div>
							<div class="col">
								<label for="exampleInputmotname">Mother Name</label> <input
									type="text" class="form-control" id="mothername" name="employeeOtherInfoBean.mname"
									placeholder="Please Enter Mother Name">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputPan">Pan Number</label> <input
									type="text" class="form-control" name="employeeOtherInfoBean.pan"
									placeholder="Please Enter Pan Number">
							</div>
							
							<div class="col">
								<label for="exampleInputspouse">Spouse Name</label> <input
									type="text" class="form-control" name="employeeOtherInfoBean.sname"
									placeholder="Please Enter Spouse Name">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputStatus">Marrital Status</label> <select
									name="employeeOtherInfoBean.ismarried" class="form-control">
									<option>Select</option>
									<option value="true">Married</option>
									<option value="false">Unmarried</option>

								</select>
							</div>
							<div class="col">
								<label for="inputnationality">Nationality</label> <select
									name="employeeOtherInfoBean.nationality" class="form-control">
									<option >Select</option>
									<option value="indian">Indian</option>
									<option value="other">Other</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputpassport">Passport Number</label> <input
									type="text" class="form-control" name="employeeOtherInfoBean.passport"
									placeholder="Please Enter Passport Number">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputbloodgrp">Blood Group</label> <select
									name="employeeOtherInfoBean.blood" class="form-control">
									<option selected>---Select One---</option>
									<option value="AB+">AB+</option>
									<option value="AB-">AB-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="o+">o+</option>
									<option value="o-">o-</option>
								</select>
							</div>
							<div class="col">
								<label for="inputreligion">Religion</label> <select
									name="employeeOtherInfoBean.religion" class="form-control">
									<option selected>---Select One---</option>
									<option value="hindu">Hindu</option>
									<option value="christian">Christian</option>
									<option value="muslim">Muslim</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputaadhar">Aadhar Number</label> <input
									type="text" class="form-control" name="employeeOtherInfoBean.aadhar"
									placeholder="Please Enter Aadhar Number">
							</div>
						</div>
						<div class="row">
							<div class="col-4">
								<label for="inputphysicallych">Physically Challenged</label> <select
									name="employeeOtherInfoBean.ischallenged" class="form-control">
									<option selected>---Select One---</option>
									<option value="true">Yes</option>
									<option value="false">No</option>
								</select>
							</div>
							<div class="col-4">
								<label for="exampleInputfather">Father Name</label> <input
									type="text" class="form-control" name="employeeOtherInfoBean.fname"
									placeholder="Please Enter Father Number">
							</div>

							
							<div class="col-2">
								<br>
								<button type="reset"
									class="form-control btn btn-outline-secondary">reset</button>
							</div>
              </div>
              
              <hr>
              EMPLOYEE ADDRESS INFORMATION
              <input type="button" data-toggle="collapse"
                  data-target="#empAddressInfo" value="+" />
                              <hr>

                            <div id="empAddressInfo" class="collapse">
                            <p class="h3" style="text-align: center;">EMPLOYEE ADDRESS INFORMATION</p>
  <hr>
  <p class="h5" style="text-align: center;">EMPLOYEE PERMANENT ADDRESS </p>
                            <div class="row">
      
      <div class="col">
        <label for="city">City</label>
        <input type="text" class="form-control" id="city" placeholder="Enter City" name="addressInfoBean[0].city">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="address type">Address Type</label>
        <input type="text" class="form-control" id="addresstype" placeholder="Enter Address Type" name="addressInfoBean[0].addressPKBean.addresssType">
      </div>
      <div class="col">
        <label for="state">State</label>
        <input type="text" class="form-control" id="state" placeholder="Enter State" name="addressInfoBean[0].state">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="address1">Address1 </label>
        <input type="text" class="form-control" id="address1" placeholder="Enter Address 1" name="addressInfoBean[0].address1">
      </div>
      <div class="col">
        <label for="country">Country </label>
        <input type="text" class="form-control" id="country" placeholder="Enter Country" name="addressInfoBean[0].country">
      </div>
    </div>
    
    <div class="row">
      <div class="col">
       <label for="address2">Address 2 </label>
        <input type="text" class="form-control" id="address2" placeholder="Enter Address 2" name="addressInfoBean[0].address2">
      </div>
      <div class="col">
        <label for="pin">Pincode</label>
        <input type="number" class="form-control" id="pincode" placeholder="Enter Pincode" name="addressInfoBean[0].pincode">
      </div>
    </div>
   
    <div class="row">

      <div class="col-6">
        <label for="landmark">Landmark</label>
        <input type="text" class="form-control" id="landmark" placeholder="Enter Landmark" name="addressInfoBean[0].landmark">
      </div>
      
      
      <div class="col-2">
        <br>
        <button type="reset" class="form-control btn btn-outline-secondary">reset</button>
      </div>

    </div>
    <hr>
              EMPLOYEE TEMPORARY ADDRESS INFORMATION
              <input type="button" data-toggle="collapse"
                  data-target="#empTempararyAddressInfo" value="+" />
                              <hr>
    </div>
    
    <hr>
    <div id="empTempararyAddressInfo" class="collapse">
    <p class="h5" style="text-align: center;">EMPLOYEE TEMPARARY ADDRESS </p>
                              <div class="row">
        
        <div class="col">
          <label for="city">City</label>
          <input type="text" class="form-control" id="city" placeholder="Enter City" name="addressInfoBean[1].city">
        </div>
      </div>
      <div class="row">
        <div class="col">
          <label for="address type">Address Type</label>
          <input type="text" class="form-control" id="addresstype" placeholder="Enter Address Type" name="addressInfoBean[1].addressPKBean.addresssType">
        </div>
        <div class="col">
          <label for="state">State</label>
          <input type="text" class="form-control" id="state" placeholder="Enter State" name="addressInfoBean[1].state">
        </div>
      </div>
      <div class="row">
        <div class="col">
          <label for="address1">Address1 </label>
          <input type="text" class="form-control" id="address1" placeholder="Enter Address 1" name="addressInfoBean[1].address1">
        </div>
        <div class="col">
          <label for="country">Country </label>
          <input type="text" class="form-control" id="country" placeholder="Enter Country" name="addressInfoBean[1].country">
        </div>
      </div>
      
      <div class="row">
        <div class="col">
         <label for="address2">Address 2 </label>
          <input type="text" class="form-control" id="address2" placeholder="Enter Address 2" name="addressInfoBean[1].address2">
        </div>
        <div class="col">
          <label for="pin">Pincode</label>
          <input type="number" class="form-control" id="pincode" placeholder="Enter Pincode" name="addressInfoBean[1].pincode">
        </div>
      </div>
     
      <div class="row">
  
        <div class="col-6">
          <label for="landmark">Landmark</label>
          <input type="text" class="form-control" id="landmark" placeholder="Enter Landmark" name="addressInfoBean[1].landmark">
        </div>
        
        <div class="col-3">
          <br>
          <button type="reset" class="form-control btn btn-outline-secondary">reset</button>
        </div>
  
      </div>
      <hr>
              EMPLOYEE EDUCATION INFORMATION
              <input type="button" data-toggle="collapse"
                  data-target="#empEducationInfo" value="+" />
                              <hr>
      </div>
      
      <hr>
      <div id="empEducationInfo" class="collapse">
    <p class="h3" style="text-align: center;">EMPLOYEE EDUCATION INFORMATION</p>
    
    <div class="row">
            <div class="col">
                    <label for="Education">Education Type</label>
                    <input type="text" id="educationtype" placeholder="Enter Education Type" class="form-control" autofocus name="educationDetailsInfoBeans[0].educationDetailsPKBean.educationType">
            </div>
            
        </div>    
        <div class="row">
                <div class="col">
                        <label for="branch" class="col-sm-3 control-label">Branch</label>
                        <input type="branch" id="branch" placeholder="Enter Branch" class="form-control" name="educationDetailsInfoBeans[0].branch">
                </div>
                <div class="col">
                        <label for="college" class="col-sm-3 control-label">College Name</label>
                        <input type="text" id="collge" placeholder="Enter College Name" class="form-control" name="educationDetailsInfoBeans[0].college">
                </div>
            </div>    
            <div class="row">
                    <div class="col">
                            <label for="yop" >Year of Passing</label>
                            
                                <input type="date" id="yop" class="form-control" name="educationDetailsInfoBeans[0].passout">
                            
                    </div>
                    
               
                
                       
                    

        <div class="col">
            <br>
            <button type="reset" class="form-control btn btn-outline-secondary">reset</button>
        </div>

    </div>
    <hr>
              EMPLOYEE EDUCATION INFORMATION
              <input type="button" data-toggle="collapse"
                  data-target="#empEducationInfo2" value="+" />
                              <hr>
      </div>

      <hr>
      <div id="empEducationInfo2" class="collapse">
    <p class="h3" style="text-align: center;">EMPLOYEE EDUCATION INFORMATION</p>
    <div class="row">
            <div class="col">
                    <label for="Education">Education Type</label>
                    <input type="text" id="educationtype" placeholder="Enter Education Type" class="form-control" autofocus name="educationDetailsInfoBeans[1].educationDetailsPKBean.educationType">
            </div>
            
        </div>    
        <div class="row">
                <div class="col">
                        <label for="branch" class="col-sm-3 control-label">Branch</label>
                        <input type="branch" id="branch" placeholder="Enter Branch" class="form-control" name="educationDetailsInfoBeans[1].branch">
                </div>
                <div class="col">
                        <label for="college" class="col-sm-3 control-label">College Name</label>
                        <input type="text" id="collge" placeholder="Enter College Name" class="form-control" name="educationDetailsInfoBeans[1].college">
                </div>
            </div>    
            <div class="row">
                    <div class="col">
                            <label for="yop" >Year of Passing</label>
                            
                                <input type="date" id="yop" class="form-control" name="educationDetailsInfoBeans[1].passout">
                            
                    </div>
                    
               
                    
                            <div class="col">
                                <br>
                                <button type="reset" class="form-control btn btn-outline-secondary">reset</button>
                            </div>
                    
                        </div>  
                        <hr>
                        EMPLOYEE EXPERIENCE INFORMATION
                        <input type="button" data-toggle="collapse"
                            data-target="#empExperienceInfo" value="+" />
                                        <hr> 
    </div>   
   
            <hr>
      <div id="empExperienceInfo" class="collapse">
            <h4 class="text-center">EMPLOYEE EXPERIENCE DETAILS</h4>
            <div class="row">
                    <div class="col">
                            <label for="name">Company Name</label>
                            <input type="text" id="companyname" placeholder="Enter Company Name" class="form-control" name="employeeExperienceInfoBeans[0].employeeExPKBean.companyName">
                    </div>
                    
                </div>
                    <div class="row">
                        <div class="col">
                        <label for="Joining Date">Technology</label>
                        <input type="text" class="form-control" id="Technology" placeholder="Enter Technology" name="employeeExperienceInfoBeans[0].technology">
                    </div>
    
                    <div class="col">
                            <label for="Leaving Date">Year Of Experience</label>
                            <input type="text" class="form-control" id="yop" placeholder="Enter Year Of Experience" name="employeeExperienceInfoBeans[0].experienceYear">
                    </div>
                
                    <div class="col">
                        <br>
                        <button type="reset" class="form-control btn btn-outline-secondary">reset</button>
                    </div>

                </div>
                <hr>
                        EMPLOYEE EXPERIENCE INFORMATION
                        <input type="button" data-toggle="collapse"
                            data-target="#empExperienceInfo1" value="+" />
                                         
      </div>  
      <hr>
      <div id="empExperienceInfo1" class="collapse">
            <h4 class="text-center">EMPLOYEE EXPERIENCE DETAILS</h4>
            <div class="row">
                <div class="col">
                        <label for="name">Company Name</label>
                        <input type="text" id="companyname" placeholder="Enter Company Name" class="form-control" name="employeeExperienceInfoBeans[1].employeeExPKBean.companyName">
                </div>
                
            </div>
            <div class="row">
                <div class="col">
                <label for="Joining Date">Technology</label>
                <input type="text" class="form-control" id="Technology" placeholder="Enter Technology" name="employeeExperienceInfoBeans[1].technology">
            </div>

            <div class="col">
                    <label for="Leaving Date">Year Of Experience</label>
                    <input type="text" class="form-control" id="yop" placeholder="Enter Year Of Experience" name="employeeExperienceInfoBeans[1].experienceYear">
            </div>
            </div>
               
                <div class="row">
                    <div class="col">
                        <br>
                        <button type="submit" class="form-control btn btn-outline-success"> Submit</button>
                    </div>

                    <div class="col">
                        <br>
                        <button type="reset" class="form-control btn btn-outline-secondary">reset</button>
                    </div>

                </div>
      </div>   
    			</form>
			</div>
		</div>
	</div>
</td></tr></table></center>
</body>



</html>