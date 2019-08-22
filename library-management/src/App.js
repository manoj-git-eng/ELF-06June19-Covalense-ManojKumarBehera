import React from 'react';
import DefaultHome from './components/defaulthome/defaulthome'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Login from './components/login/login'
import Search from './components/search/search'
import CreateAccount from './components/createaccount/createaccount'
import { Upcoming } from './components/Upcoming/upcoming';
import { Contact } from './components/contact/contact';
import { About } from './components/About/about';



function App() {
  return (
    <div>
     
    <Router>
    <Route exact path='/' component={DefaultHome}></Route>
    <Route path='/login' component={Login}></Route>
    <Route path='/createAccount' component={CreateAccount}></Route>
    <Route path='/search' component={Search}></Route>
    <Route path='/defaulthome' component={DefaultHome}></Route>
    <Route path='/upcoming' component={Upcoming}></Route>
    <Route path='/contact' component={Contact}></Route>
    <Route path='/about' component={About}></Route>


            </Router>
    
    </div>
  );
}

export default App;
