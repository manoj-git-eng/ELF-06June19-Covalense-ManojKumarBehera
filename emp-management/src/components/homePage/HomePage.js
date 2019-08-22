import React, { Component } from 'react';
import Navbar from '../navbar/Navbar';
import Axios from 'axios';
import {withRouter} from 'react-router-dom'
import './HomePage.css'
export class HomePage extends Component {
    constructor(props){
        super(props)

       this.state=JSON.parse(sessionStorage.getItem('user'))
        }
        
        render() {
            return (
                <div>
                <Navbar/>              
                <div className="d-flex justify-content-center h-100">

                <div className="card-body">
                <div className="cards">

        <div  className="data-display">ID: {this.state.id} </div>
        <div  className="data-display">Name:  {this.state.name}</div>
        <div  className="data-display">Account Number:
        {this.state.accountNumber}</div>
        <div  className="data-display">Email Id:  {this.state.email}</div>
        <div  className="data-display">Age: {this.state.age}</div>
        <div  className="data-display">Designation:  {this.state.designation}
        </div>
        <div  className="data-display">Department Id:
        {this.state.departmentId}</div>
        <div  className="data-display">Manager Id:  {this.state.id}</div>
        <div  className="data-display">Phone:  {this.state.phnum}</div>
        <div  className="data-display">Gender: {this.state.gender}</div>
        <div  className="data-display">Date of birth: {this.state.dateOfBirth}</div>
        <div  className="data-display">Date of Joining:
        {this.state.joiningDate}</div>
        <div  className="data-display">Salary:  {this.state.salary}</div>
        </div>
    </div>
    </div>
                </div>
            )
        }
    }
           
    
    
    export default withRouter(HomePage)