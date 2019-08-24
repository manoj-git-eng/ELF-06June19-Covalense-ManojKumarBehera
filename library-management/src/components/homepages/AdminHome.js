import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import  './AdminHome.css';


import Axios from 'axios';
import DNavbar from '../navbar/dummynav'
import {withRouter} from 'react-router-dom'
export class AdminHome extends Component {
    constructor(props){
        super(props);
  
        this.state = { }
  
    }
  
    postLoginData(event) {
        event.preventDefault();
        //let accountData = this.state;
        const {userId,password,userType} = this.state;
        const loginData = {userId,password,userType};
      console.log(loginData)
        if(this.validateLogin(loginData)){
            //Call the API using Axios and Validate the Employee Login
            Axios.post('http://localhost:8001/get',null,{
                params:{
                  userId:this.state.userId,
                
                }
            }).then((response)=>{
                console.log(response.data);
                console.log(response.data.statusCode)
               // this.props.history.push('/Navbar');
                if(loginData.userType=="Admin"){
                    this.props.history.push('/AdminHome');
                } else if(loginData.userType=="Librarian") {
                  this.props.history.push('/LibHome');
               } else if(loginData.userType=="User") {
                                  this.props.history.push('/UserHome');
                                } else{
                                  this.props.history.push('/');
                                }
            }).catch((error)=>{
                console.log('Error',error);
            });
        }
    }
  
    validateLogin(loginData){
        let validationSuccess = false;
  
        if(loginData.userId.trim()==="" || loginData.userId.trim()===null){
            alert('Please enter User Id');
            document.getElementById("userId").focus();
            return validationSuccess;
        } else if(loginData.password.trim()==="" || loginData.password.trim()===null){
            alert('Please enter Password');
            document.getElementById("password").focus();
            return validationSuccess;
        } else{
            validationSuccess = true;
        }
  
        return validationSuccess;
    }
        render() {
            return (
 
<div>
<DNavbar/><hr/><hr/><hr/><hr/>
<center><h1>Admin Home Page</h1></center>
<hr/>
<form onSubmit={this.onSubmit}>
<div class="container">
	<div class="row">
		<h2>Search users</h2>
        <div class="search">
<input type="number" value={this.state.userId} class="form-control input-sm" maxlength="64" placeholder="User ID" />
 <button type="submit" class="btn btn-primary btn-sm">Search</button>
</div>
	</div>
    
</div>
</form>
<hr/>
<div class="container">
	<div class="row">
		<h2>View all users</h2>
        <div class="search">

 <button type="submit" class="btn btn-primary btn-sm">Click</button>
</div>
	</div>
  
</div>
<hr/>
<div class="container">
	<div class="row">
		<h2>Add users</h2>
        <div class="search">
            <Link to="/add"><button type="submit" class="btn btn-primary btn-sm">Add</button></Link>
 
</div>
	</div>
  
</div>
<hr/>
<div class="container">
	<div class="row">
		<h2>Remove users</h2>
        <div class="search">
        <input type="text" class="form-control input-sm" maxlength="64" placeholder="Enter User ID" />
 <button type="submit" class="btn btn-primary btn-sm">Remove</button>
</div>
	</div>
  
</div>
<hr/>
<div class="container">
	<div class="row">
		<h2>Update users</h2>
        <div class="search">
 <button type="submit" class="btn btn-primary btn-sm">Update</button>
</div>
	</div>
  
</div>


    </div>

            )
        }
    }
           
    
    
    export default withRouter(AdminHome)
