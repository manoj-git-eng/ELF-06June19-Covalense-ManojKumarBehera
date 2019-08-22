import React from 'react';
import Login from './components/login/Login'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import HomePage from './components/homePage/HomePage'

function App() {
  return (
    <div>
     
    <Router>
    <Route exact path='/' component={Login}></Route>
    <Route path='/HomePage' component={HomePage}></Route>
            </Router>
    
    </div>
  );
}

export default App;
