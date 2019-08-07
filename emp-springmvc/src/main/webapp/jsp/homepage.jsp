<%@page import="com.covalense.emp.dao.*"%>
<%@page import="com.covalense.emp.beans.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang='en'>

<head>

<meta charset='UTF-8'>
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<meta http-equiv='X-UA-Compatible' content='ie=edge'>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<title>Homepage</title>
</head>

<body class='container-fluid'>
	<header>
		<div class='row' style='background: gray;'>
			<div class='col-sm-1' style='margin-top: 10px;'>
				<a href="/loginmvc"> <img class='rounded'
					alt='Bootstrap Image Preview'
					style='height: 60px; width: 80px; margin-bottom: 10px;'
					src='https://cdn.pixabay.com/photo/2017/02/23/13/05/profile-2092113_960_720.png' /></a>
			</div>

			<div class='col-sm-10' style='margin-top: 10px;'>
				<div class='form-group'>
					<label class='control-label' for='searchInput'></label>
					<div class='col-md-12'>
						<div class='search input-group' data-initialize='search'
							role='search' id='search'>
							<form action="./validator/validate/employee/search">
							<input type='text' name="search" class='form-control'
								aria-label='Sizing example input'
								aria-describedby='inputGroup-sizing-default'> <span
								class='input-group-btn'>
								<button class='btn btn-default' type='submit'>
									<span class='glyphicon glyphicon-search'></span> <span
										class='sr-only'>Search</span>
								</button>
								<!-- <input hidden type="text" name="url" value="search"> -->
								</form>
							</span>
						</div>
					</div>
				</div>
			</div>
			<div class='col-md-1' style='margin-top: 10px;'>

				<button type='button' style="width: 80px; height: 60px;"
					class='btn btn-success btn-inline' id='btn'>
					<a href="./logout">logout</a>
				</button>
			</div>
		</div>
	</header>
	<section style='margin-top: 10px;'>

		<div class="accordion" id="accordionExample">
			<div class="card">
				<div class="card-header" id="headingOne">
					<h2 class="mb-0">
						<button class="btn btn-link" type="button" data-toggle="collapse"
							data-target="#collapseOne" aria-expanded="true"
							aria-controls="collapseOne">
							<h4 style="width: 1300px; margin: 0 auto;">Employee Detail</h4>
						</button>
					</h2>
				</div>

				<div id="collapseOne" class="collapse show"
					aria-labelledby="headingOne" data-parent="#accordionExample">
					<div class="card-body">
					<% EmployeeInfoBean bean=(EmployeeInfoBean)request.getAttribute("bean"); %>

						<table class="table table-hover">
							<thead>
								<tr>
									<th scope="col">#</th>
									<th scope="col">Employee</th>
									<th scope="col">Details</th>
								</tr>
							</thead>
							<tbody style="font: 56px;">
								<tr>
									<th scope="row">1</th>
									<td>ID</td>
									<td>${bean.id}</td>
								</tr>
								<tr>
									<th scope="row">2</th>
									<td>NAME</td>
									<td>${bean.name}</td>
								</tr>
								<tr>
									<th scope="row">3</th>
									<td>AGE</td>
									<td>${bean.age}</td>
								</tr>
								<tr>
									<th scope="row">4</th>
									<td>GENDER</td>
									<td>${bean.gender}</td>
								</tr>
								<tr>
									<th scope="row">5</th>
									<td>SALARY</td>
									<td>${bean.salary}</td>
								</tr>
								<tr>
									<th scope="row">6</th>
									<td>PHONE</td>
									<td>${bean.phnum}</td>
								</tr>
								<tr>
									<th scope="row">7</th>
									<td>JOINING_DATE</td>
									<td>${bean.joiningDate}</td>
								</tr>
								<tr>
									<th scope="row">8</th>
									<td>ACCCOUNT_NUMBER</td>
									<td>${bean.accountNumber}</td>
								</tr>
								<tr>
									<th scope="row">9</th>
									<td>EMAIL</td>
									<td>${bean.email}</td>
								</tr>
								<tr>
									<th scope="row">10</th>
									<td>DESIGNATION</td>
									<td>${bean.designation}</td>
								</tr>
								<tr>
									<th scope="row">11</th>
									<td>DOB</td>
									<td>${bean.dateOfBirth}</td>
								</tr>
								<tr>
									<th scope="row">12</th>
									<td>DEPT_NO</td>
									<td>${bean.departmentId}</td>
								</tr>
								<tr>
									<th scope="row">13</th>
									<td>MGR_ID</td>
									<td>${bean.managerId}</td>
								</tr>
							</tbody>
						</table>



					</div>
				</div>
			</div>
		</div>
		<div class="accordion" id="accordionExample">
			<div class="card">
				<div class="card-header" id="headingOne">
					<h2 class="mb-0">
						<button class="btn btn-link" type="button" data-toggle="collapse"
							data-target="#collapseOne" aria-expanded="true"
							aria-controls="collapseOne">
							<h4 style="width: 1300px; margin: 0 auto;">Employee Detail</h4>
						</button>
					</h2>
				</div>

				<div id="collapseOne" class="collapse show"
					aria-labelledby="headingOne" data-parent="#accordionExample">
					<div class="card-body">
						<table class="table table-hover">
							<thead>
								<tr>
									<th scope="col">#</th>
									<th scope="col">Employee</th>
									<th scope="col">Details</th>
								</tr>
							</thead>
							<tbody style="font: 56px;">
								<table class="table">
									<thead>
										<tr>
											<th scope="col">#</th>
											<th scope="col">EmployeeOther</th>
											<th scope="col">Details</th>
										</tr>
									</thead>
									<tbody style="font: 56px;">
										<tr scope="row">
											<th>PAN</th>
											<td>${otherInfoBean.pan}</td>
										</tr>
										<tr scope="row">
											<th>ADHAR</th>
											<td>${ otherInfoBean.adhar}</td>
										</tr>
										<tr scope="row">
											<th>Passport Number</th>
											<td>${ otherInfoBean.passport}</td>
										</tr>
										<tr scope="row">
											<th>Emergency Contact Name</th>
											<td>${ otherInfoBean.emergencyContactPerson}</td>
										</tr>
										<tr scope="row">
											<th>Emergency Contact Number</th>
											<td>${ otherInfoBean.emergencyContactNumber}</td>
										</tr>
										<%-- <tr scope="row">
											<th>Physically Challenged</th>
											<td>${ otherInfoBean.ischallenged}</td>
										</tr>
										<tr scope="row">
											<th>Married</th>
											<td>${ otherInfoBean.isMarried}</td>
										</tr>
 --%>										<tr scope="row">
											<th>Spouse Name</th>
											<td>${ otherInfoBean.spouseName}</td>
										</tr>
										<tr scope="row">
											<th>Father Name</th>
											<td>${ otherInfoBean.fatherName}</td>
										</tr>
										<tr scope="row">
											<th>Mother Name</th>
											<td>${ otherInfoBean.motherName}</td>
										</tr>
										<tr scope="row">
											<th>Nationality</th>
											<td>${ otherInfoBean.nationality}</td>
										</tr>
										<tr scope="row">
											<th>Relegion</th>
											<td>${ otherInfoBean.religion}</td>
										</tr>
									</tbody>
								</table>
								</div>
								</div>
								</div>
								</div>
	</section>


	<footer
		style='background: gray; text-align: center;'>
		&copy;copyright at HomePage </footer>
</body>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script>
	function logout() {
		window.location.href = 'getForm?msg=loggedout Successful';
	}
</script>

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</html>