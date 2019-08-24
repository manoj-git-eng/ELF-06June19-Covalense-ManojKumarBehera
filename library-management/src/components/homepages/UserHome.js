import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import  './AdminHome.css';


import Axios from 'axios';
import DNavbar from '../navbar/dummynav'
import {withRouter} from 'react-router-dom'
export class UserHome extends Component {
    constructor(props){
        super(props)

       this.state=JSON.parse(sessionStorage.getItem('user'))
        }
        
        render() {
            return (
                <div>
<DNavbar/><hr/><hr/><hr/><hr/>
<center><h1>User Home Page</h1></center>
<hr/>            
                <div className="d-flex justify-content-center h-100">

                <div className="card-body">
                <div className="cards">

        <div  className="data-display">USER ID: {this.state.userId} </div>
        <div  className="data-display">Name:  {this.state.name}</div>

        <div  className="data-display">Email Id:  {this.state.email}</div>
        <div  className="data-display">Address 1: {this.state.add1}</div>
        <div  className="data-display">Address 2:  {this.state.add2}
        </div>
        <div  className="data-display">Phone:  {this.state.phnum}</div>
        <div  className="data-display">Gender: {this.state.gender}</div>
        <div  className="data-display">USER TYPE:  {this.state.usertype}</div>
        </div>
    </div>
    </div>
                </div>

            )
        }
    }
           
    
    
    export default withRouter(UserHome)
