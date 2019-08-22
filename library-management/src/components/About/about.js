import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import  './about.css';
import {withRouter} from 'react-router-dom'
import Navbar from '../navbar/Navbar';
export class About extends Component {

    constructor(props){
       
        super(props)
          this.state={
          }
        }
      
             
        
        render() {
            return (
              <div>
              <Navbar/><hr/><hr/>
              <section class="Material-contact-section section-padding section-dark">
      <div class="container">
          <div class="row">
              <div class="col-md-12 wow animated fadeInLeft" data-wow-delay=".2s">
                  <h1 class="section-title">Library Management System</h1>
              </div>
          </div>
          <div class="row">
              <div class="col-md-6 mt-3 contact-widget-section2 wow animated fadeInLeft" data-wow-delay=".2s">
                <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using Content.</p>

                <div class="find-widget">
                 Company:  <a href="https://hostriver.ro">LMS</a>
                </div>
                <div class="find-widget">
                 Address: <a href="#">4435 Berkshire Circle Knoxville</a>
                </div>
                <div class="find-widget">
                  Phone:  <a href="#">+ 91 7381717433</a>
                </div>
                
                <div class="find-widget">
                  Website:  <a href="https://uny.ro">www.lms.com</a>
                </div>
                <div class="find-widget">
                   Program: <a href="#">Mon to Sat: 09:30 AM - 10.30 PM</a>
                </div>
              </div>
        </div>
        </div>
        </section>
        </div>
            )
        }
    }
           
    
    
    export default withRouter(About)
