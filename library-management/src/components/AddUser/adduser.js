import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import  './adduser.css';


import Axios from 'axios';
import DNavbar from '../navbar/dummynav'
import {withRouter} from 'react-router-dom'
export class Add extends Component {
  
    constructor(props){
       
        super(props)
          this.state={
          }
        }
      
             
        
        render() {
            return (
 
<div>
<DNavbar/><hr/><hr/><hr/>
<hr/>
<table>
    <tr>
        <td>

        <Link to="/AdminHome">Back</Link>
<p><center><h1>USER INFORMATIONS</h1></center> </p>
  <hr/>
  <form>
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1"> User ID</label>
        <input type="text" name="userId" class="form-control" placeholder="ID"/>
      </div>
      <div class="col">
        <label for="exampleInputEmail1">NAME</label>
        <input type="text" class="form-control" placeholder="NAME"/>
      </div>
      <div class="col">
        <label for="exampleInputEmail1">EMAIL ID</label>
        <input type="text" class="form-control" placeholder="EMAIL ID"/>
      </div>
      <div class="col">
        <label for="exampleInputEmail1">ADDRESS-1</label>
        <input type="address" class="form-control" placeholder="ADDRESS 1"/>
      </div>
      <div class="col">
        <label for="exampleInputEmail1">ADDRESS-2</label>
        <input type="address" class="form-control" placeholder="ADDRESS 2"/>
      </div>
    </div>
      <div class="col">
        <label for="exampleInputEmail1">Security Question-1</label>
        <p>What is your favorite colour?</p>
        <input type="text" class="form-control" placeholder="colour"/>
      </div>
      <div class="col">
        <label for="exampleInputEmail1">Security Question-2</label>
        <p>What is your pet name?</p>
        <input type="text" class="form-control" placeholder="pet name"/>
    </div>
    <div class="row">
      <div class="col">
        <label for="inputGender">USER TYPE</label>
        <select id="inputGender" class="form-control">
          <option selected>--select one--</option>
          <option value="male">Admin</option>
          <option value="female">Librarian</option>
          <option value="other">Normal User</option>
        </select>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <label for="exampleInputEmail1">PHONE NUMBER</label>
        <input type="text" class="form-control" placeholder="PHONE NUMBER"/>
      </div>
    </div>
    <div class="row">

      <div class="col-6">
        <label for="exampleInputEmail1">PASSWORD</label>
        <input type="password" class="form-control" placeholder="INPUT PASSWORD"/>
      </div>

      <div class="col-3">
        <br/>
        <input type="submit" class="btn btn-primary" value="Submit"/>

      </div>
      <div class="col-3">
      <input type="reset" class="btn btn-primary" value="Reset"/>
      </div>

    </div>
  </form>
  </td>
    </tr>
</table>
    </div>

            )
        }
    }
           
    
    
    export default withRouter(Add)
