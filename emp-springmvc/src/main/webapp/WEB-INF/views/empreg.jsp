<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Registration Page!!</title>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
<style>
  table{
background: rgba(26, 216, 191, 0.507);
border-block: inherit;
  }
  </style>
</head>

<body style="background:silver"> <center> 
<table cellpadding="50px">
<tr>
<td>
  <p class="h3" style="margin-left: 40%"><center><h1>EMPLOYEE INFORMATION</h1></center> </p>
  <hr>
  <form action="./submit" method="post">
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">ID</label>
        <input type="text" name="id" class="form-control" placeholder="ID">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">ACCOUNT NUMBER</label>
        <input type="text" name="accountnumber" class="form-control" placeholder="ACCOUNT NUMBER">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">NAME</label>
        <input type="text" name="name" class="form-control" placeholder="NAME">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">EMAIL ID</label>
        <input type="text" name="email" class="form-control" placeholder="EMAIL ID">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">AGE</label>
        <input type="text" name="age" class="form-control" placeholder="AGE">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">DESIGNATION</label>
        <input type="text" name="designation" class="form-control" placeholder="DESIGNATION">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="inputGender">GENDER</label>
        <select id="inputGender" name="gender" class="form-control">
          <option selected>--select one--</option>
          <option value="male">MALE</option>
          <option value="female">FEMALE</option>
          <option value="other">OTHERS</option>
        </select>
      </div>
      <div class="col">
        <label for="exampleInputEmail1">DATE OF BIRTH</label>
        <input type="date" name="dob" class="form-control" placeholder="dd-mm-yyyy">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">SALARY</label>
        <input type="text" name="salary" class="form-control" placeholder="SALARY">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">DEPAETMENT ID</label>
        <input type="text" name="deptid" class="form-control" placeholder="DEPAETMENT ID">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">PHONE NUMBER</label>
        <input type="text" name="phone" class="form-control" placeholder="PHONE NUMBER">
      </div>
      <div class="col">
        <label for="exampleInputEmail1">MANAGER ID</label>
        <input type="text" name="mgrid" class="form-control" placeholder="MANAGER ID">
      </div>
    </div>
    <div class="row">

      <div class="col-6">
        <label for="exampleInputEmail1">JOINING DATE</label>
        <input type="date" name="joiningdate" class="form-control" placeholder="JOINING DATE">
      </div>

      <div class="col-6">
        <label for="exampleInputEmail1">PASSWORD</label>
        <input type="password" name="password" class="form-control" placeholder="INPUT PASSWORD">
      </div>

 

    </div>
  
  <br><br><br>
  
  
  <!-- for employee other info bean -->
  
  
  
  
  
  <p class="h3" style="margin-left: 40%"><center><h1>EMPLOYEE OTHER INFORMATION</h1></center> </p>
  <hr>

    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">ID</label>
        <input type="text" class="form-control" placeholder="Please Enter ID">
      </div>
      <div class="col">
        <label for="exampleInputemergenum">Emergency Contact Number</label>
        <input type="text" class="form-control" placeholder="Please Enter Emergency Contact Number">
      </div>
      <div class="col">
        <label for="exampleInputmotname">Mother Name</label>
        <input type="text" class="form-control" placeholder="Please Enter Mother Name">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="exampleInputPan">Pan Number</label>
        <input type="text" class="form-control" placeholder="Please Enter Pan Number">
      </div>
      <div class="col">
        <label for="exampleInputemergeName">Emergency Contact Number</label>
        <input type="text" class="form-control" placeholder="Please Enter Emergency Contact Name">
      </div>
      <div class="col">
        <label for="exampleInputspouse">Spouse Name</label>
        <input type="text" class="form-control" placeholder="Please Enter Spouse Name">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="inputStatus">Marital Status</label>
        <select id="inputStatus" class="form-control">
          <option selected>Married</option>
          <option value="married">Married</option>
          <option value="unmarried">Unmarried</option>
          <option value="divorcee">Divorcee</option>
        </select>
      </div>
      <div class="col">
        <label for="inputnationality">Nationality</label>
        <select id="inputnationality" class="form-control">
          <option selected>---Select One---</option>
          <option value="indian">Indian</option>
          <option value="other">Other</option>
        </select>
      </div>
      <div class="col">
        <label for="exampleInputpassport">Passport Number</label>
        <input type="text" class="form-control" placeholder="Please Enter Passport Number">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="inputbloodgrp">Blood Group</label>
        <select id="inputbloodgrp" class="form-control">
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
        <label for="inputreligion">Religion</label>
        <select id="inputreligion" class="form-control">
          <option selected>---Select One---</option>
          <option value="hindu">Hindu</option>
          <option value="christian">Christian</option>
          <option value="muslim">Muslim</option>
        </select>
      </div>
      <div class="col">
        <label for="exampleInputaadhar">Aadhar Number</label>
        <input type="text" class="form-control" placeholder="Please Enter Aadhar Number">
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="inputphysicallych">Physically Challnged</label>
        <select id="inputphysicallych" class="form-control">
          <option selected>---Select One---</option>
          <option value="yes">Yes</option>
          <option value="no">No</option>
        </select>
      </div>
      <br>
      <div class="col">
        <label for="exampleInputfather">Father Number</label>
        <input type="text" class="form-control" placeholder="Please Enter Father Number">
      </div>
      <div class="col-3">
        <br>
       
        <button type="submit" class="form-control form-control btn btn-outline-secondary"> Submit</button>

      </div>
      <div class="col-3">
        <br>
        <button type="reset" class="form-control form-control btn btn-outline-success">reset</button>
      </div>
    </div>


  </form>
  
  
  
</td></tr></table></center>
</body>
<!-- <script>
				  function submit() {
				   alert('Submitted All Information!!!');
				    window.location.href='./submit'; }
				  </script> -->



</html>