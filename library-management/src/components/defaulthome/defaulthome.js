import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import  './defaulthome.css';


import Axios from 'axios';
import Login from '../login/login'
import Navbar from '../navbar/Navbar'
import {withRouter} from 'react-router-dom'
export class DefaultHome extends Component {
    constructor(props){
       
        super(props)
          this.state={
          }
        }
      
             
        
        render() {
            return (
                <div>
                <Navbar/>


<div class="mt-1"></div>
<section class="latest py-5" id="latest">
    
        <div class="row pb-5 text-center">
            <div class="col-md-12">
               <h2>Latest Books</h2>
               <p>"Nothing is more impotent than an unread library."</p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
               <h2>A library is the delivery room for the birth of ideas, a place where history comes to life. Norman Cousins</h2>
               <p class="py-3">Why buy a book when you can join a library.</p>
               <button type="button" class="btn btn-outline-danger mb-5">Find Out More About us</button>

            </div>
            <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book1</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book2</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book3</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book4</h4>
               </a> 
              </div>
              <br></br>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book5</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book6</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book7</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book8</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book9</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book10</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book11</h4>
               </a> 
              </div>
              <div class="col-md-4" style={{paddingTop:'1rem'}}>
              <a href="/" >
                  <img class="no-mp" alt="no image found" src="https://cdn.pixabay.com/photo/2017/08/07/03/25/books-2599279__340.jpg"/>
                  <hr></hr>
                  <h4>Book12</h4>
               </a> 
              </div>
        </div>
    
</section>
</div>
            
            )
        }
    }
           
    
    
    export default withRouter(DefaultHome)
