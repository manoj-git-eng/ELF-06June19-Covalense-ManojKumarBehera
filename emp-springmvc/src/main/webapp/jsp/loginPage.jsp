<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Management Portal login page!!!!!!!</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body style="background: rgb(3, 163, 255);">
${emp}
${logout}
<center>


	<div class="container "
		style="margin: 5% 20% 0 15%; border-radius: 200px; background: grey;">
		<div class="row justify-content-md-center">
			<div class="col-sm-5">
				<legend style="text-align: center;">Employee Login</legend>
				<form onSubmit="return checkPassword(this)" method="post" action="./homepage">
					<div class="form-group">
						<label for="exampleInputEmail1">Employee ID</label> 
						<input type="empid" class="form-control" id="empid" name="id"
							aria-describedby="empidHelp" placeholder="Enter empid"
							required="required">
					</div>
					<div class="form-group">
						<label for="InputPassword">Password</label> <input type="password"
							class="form-control" name="password" id="InputPassword"
							placeholder="Enter Password" required="required">
					</div>
					
					<div class="text-center col-sm-12">
					<button type="reset" class="btn btn-primary">
							<small>Reset</small>
						</button>
						<button type="submit" class="btn btn-primary">
							<small>Login</small>
						</button>
						
					</div>
					<div class="text-center col-sm-12"
					style="margin-top: 10px; margin-bottom: 10px;">
					<a href="./create"
						style="text-align: center; margin: 10px;" class="btn btn-primary"
						type="button"><small>Create Account</small></a> <a
						href="forgotpassword.jsp" class="btn btn-primary"
						style="text-align: center; margin: 10px;" type="button"><small>Forgot
							password</small></a>
				</div>


				</form>
				

			</div>
		</div>
	</div>

</center>
</body>


</html>