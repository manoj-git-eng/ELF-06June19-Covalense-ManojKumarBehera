import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import  './Navbar.css';
import Axios from 'axios';
import React, { Component } from 'react';
import {withRouter} from 'react-router-dom'


class DNavbar extends Component {
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
<button class="dropbtn">Log out</button>
</Link>
</ul>
</div>
</div>
</nav>
</Route>
    );
}
}
export default withRouter(DNavbar)