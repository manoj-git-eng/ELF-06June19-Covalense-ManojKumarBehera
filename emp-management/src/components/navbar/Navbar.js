import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import HomePage from '../homePage/HomePage';
/* import info from '../createAccount/info'; */
import Login from '../login/Login'
/* import Search from '../search/search'; */
import Axios from 'axios';
import React, { Component } from 'react';
import {withRouter} from 'react-router-dom'


class Navbar extends Component {
  constructor(props){
     
      super(props)
        this.state={
                  id:'',
                  password:''
        }
      }
      logout() {
        Axios.get('http://localhost/emp-erest/login/logout')
        .then((response)=>{
            console.log(response.data.message)
           if(response.data.message === 'Success') {
           
               this.props.history.push('/')
           }
        }).catch((error)=>{
            console.log(error)
        })
    }
        render() {
    return(

        <Router>
          <nav  className="navbar navbar-expand-lg navbar-light bg-light">
  <a  className="navbar-brand" href="#">Navbar</a>
  <button  className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span  className="navbar-toggler-icon"></span>
  </button>

  <div  className="collapse navbar-collapse" id="navbarSupportedContent">
    <ul  className="navbar-nav mr-auto">
      <li  className="nav-item active">
        <Link  className="nav-link" to="../CreateEmp/Employee/info">Edit <span  className="sr-only">(current)</span></Link>
      </li>
      <li  className="nav-item">
        <Link  className="nav-link" to="./HomePage/HomePage">Profile</Link>
      </li>
           
    </ul>
    <form  className="form-inline my-2 my-lg-0">
      <input  className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"/>
      <Link  className="btn btn-outline-success my-2 my-sm-0" type="submit" to="../Search/Search">Search</Link>

  </form>
  <li  className="nav-item">
        <Link  className="btn btn-outline-success my-2 my-sm-0" onClick={this.logout.bind(this)} >Logout</Link>
      </li>
  </div>
  </nav>
       
   
  <Route exact path='/' component={Login}></Route>

{/* <Route path='/CreateEmp/Employee/info' component={info}></Route> */}
<Route path='/homePage/HomePage' component={HomePage}></Route>
{/* <Route path='/Search/Search' component={Search}></Route> */}


        </Router>
    );
}
}
export default withRouter(Navbar)