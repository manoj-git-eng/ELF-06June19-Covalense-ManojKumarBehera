import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import  './AdminHome.css';


import Axios from 'axios';
import Login from '../login/login'
import Navbar from '../navbar/Navbar'
import {withRouter} from 'react-router-dom'
export class AdminHome extends Component {
    openUser(event){
        event.preventDefault();
        this.props.history.push('/search')
        this.props.history.push('/defaulthome')
        this.props.history.push('/login')


    }
    constructor(props){
       
        super(props)
          this.state={
          }
        }
      
             
        
        render() {
            return (
                <div>
                <Navbar/>
                <div class="container">


<div class="mt-1"></div>
<section class="latest py-5" id="latest">
  
      <div class="row pb-5 text-center">
          <div class="col-md-12">
            <hr/>
             <h1>Admin Home Page</h1>
          </div>
      </div>
      <div class="container">
      <div class="row">
        <div class="search">
 <button type="submit" class="btn btn-primary btn-sm">View All Users</button>
</div>
	</div>
  <br/><br/>
	<div class="row">
        <div class="search">
<input type="text" class="form-control input-sm" maxlength="64" placeholder="Enter User Id" />
 <button type="submit" class="btn btn-primary btn-sm">Search User</button>
</div>
	</div>
  <br/><br/>
  <div class="row">
        <div class="search">
 <button type="submit" class="btn btn-primary btn-sm">Add User</button>
</div>
	</div>
  <br/><br/>
  <div class="row">
        <div class="search">
<input type="text" class="form-control input-sm" maxlength="64" placeholder="Enter User Id" />
 <button type="submit" class="btn btn-primary btn-sm">Update User</button>
</div>
	</div>
  <br/><br/>
  <div class="row">
        <div class="search">
<input type="text" class="form-control input-sm" maxlength="64" placeholder="Enter User Id" />
 <button type="submit" class="btn btn-primary btn-sm">Delete User</button>
</div>
	</div>
  <br/><br/>
</div>
     
  
</section>
</div>
                </div>



            )
        }
    }
           
    
    
    export default withRouter(AdminHome)
