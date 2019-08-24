import React from 'react';
import DefaultHome from './components/defaulthome/defaulthome'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Login from './components/login/login'
import Search from './components/search/search'
import { Upcoming } from './components/Upcoming/upcoming';
import { Contact } from './components/contact/contact';
import { About } from './components/About/about';
import AdminHome from './components/homepages/AdminHome';
import LibHome from './components/homepages/LibHome';
import Add from './components/AddUser/adduser';
import { UserHome } from './components/homepages/UserHome';




function App() {
  return (
    <div>
     
    <Router>
    <Route exact path='/' component={DefaultHome}></Route>
    <Route path='/login' component={Login}></Route>
    <Route path='/search' component={Search}></Route>
    <Route path='/defaulthome' component={DefaultHome}></Route>
    <Route path='/upcoming' component={Upcoming}></Route>
    <Route path='/contact' component={Contact}></Route>
    <Route path='/about' component={About}></Route>
    <Route  path='/AdminHome' component={AdminHome} />
    <Route  path='/LibHome' component={LibHome} />
    <Route  path='/UserHome' component={UserHome} />
    <Route  path='/add' component={Add} />



            </Router>
    
    </div>
  );
}

export default App;
