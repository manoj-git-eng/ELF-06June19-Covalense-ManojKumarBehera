import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import  './upcoming.css';
import {withRouter} from 'react-router-dom'
import Navbar from '../navbar/Navbar';
export class Upcoming extends Component {


    constructor(props){
       
        super(props)
          this.state={
          }
        }
      
             
        
        render() {
            return (
              <div>
              <Navbar/>
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
            )
        }
    }
           
    
    
    export default withRouter(Upcoming)
