import React, { Component } from 'react'
import { Link } from 'react-router-dom';
import  './search.css';
import {withRouter} from 'react-router-dom'
import Navbar from '../navbar/Navbar';
export class Search extends Component {


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
     
        
        <form action="" method="post">
            <div class="preview text-center">
                <br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br>
                <div id="cover">
  <form method="get" action="">
    <div class="tb">
      <div class="td"><input type="text" placeholder="Search" required/></div>
      <div class="td" id="s-cover">
        <button type="submit">
          <div id="s-circle"></div>
          <span></span>
        </button>
      </div>
    </div>
  </form>
</div>
           </div>
        </form>
    </div> 
	
</div>

            
            )
        }
    }
           
    
    
    export default withRouter(Search)
