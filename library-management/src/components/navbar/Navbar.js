import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import  './Navbar.css';
import Axios from 'axios';
import React, { Component } from 'react';
import {withRouter} from 'react-router-dom'


class Navbar extends Component {
  openUser(event){
    event.preventDefault();
    this.props.history.push('/search')
    this.props.history.push('/defaulthome')
    this.props.history.push('/login')
    this.props.history.push('/upcoming')
    this.props.history.push('/contact')
    this.props.history.push('/about')
  }
  constructor(props){
     
      super(props)
        this.state={ }
      }
     
        render() {
    return(

      <Route>
      <nav class="navbar navbar-expand-sm  fixed-top navbar-light bg-primary ">
      <Link to="/defaulthome" class="navbar-brand" href="/"  >
<h1>LMS</h1>
</Link>
<div class="container">
<div class="collapse navbar-collapse" id="collapsibleNavbar">
<ul class="navbar-nav ml-auto">
<Link to="/defaulthome" class="nav-item dropdown">
<button class="dropbtn">Home</button>
</Link>
<li class="nav-item dropdown">
<button class="dropbtn">Find Books</button>
<div class="dropdown-content">
<Link to="/search" class="dropdown-item" >Find by Name</Link>
<Link to="/search" class="dropdown-item">Find by Id</Link>
<Link to="/search" class="dropdown-item" >Find by Author</Link>
</div>
</li>
<Link to="/upcoming" class="nav-item dropdown">
<button class="dropbtn">Upcoming Books</button>
</Link>

<li class="nav-item dropdown">
<button class="dropbtn">Login As</button>
<div class="dropdown-content">
<Link class="dropdown-item" to="/login" >Admin</Link>
<Link class="dropdown-item" to="/login" >Librarian</Link>
<Link class="dropdown-item" to="/login" >User</Link>
</div>
</li>
<Link to="/contact" class="nav-item dropdown">
<button class="dropbtn">Contact</button>
</Link>
<Link to="/about" class="nav-item dropdown">
<button class="dropbtn">About us</button>
</Link>
</ul>
</div>
</div>
</nav>
</Route>
    );
}
}
export default withRouter(Navbar)