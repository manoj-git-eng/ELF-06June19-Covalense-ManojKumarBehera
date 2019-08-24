import React, { Component } from 'react'
import  './Login.css';

import Axios from 'axios';
import HomePage from '../homePage/HomePage'
import {withRouter} from 'react-router-dom'
export class Login extends Component {
    constructor(props){
       
        super(props)
          this.state={
                    id:'',
                    password:''
          }
          this.pRef=React.createRef();
          this.error="Login Failed !!!!!"
        }
        onSubmit(event){
            //let accountData=this.state;
            event.preventDefault();
            Axios.post('http://localhost/emp-erest/login/login',null,
            {
            params:{
                id:this.state.id,
                password:this.state.password
            }
        }).then((response)=>{
                console.log('response',response)
                if(response.data.statuscode===201){
                    sessionStorage.setItem('user',JSON.stringify(response.data.bean[0]))
                    console.log('response',response.data.statuscode)
                    this.props.history.push('/HomePage')
                }else{
                    this.pRef.current.style.visibility="visible"
                }   
            }).catch((error)=>{
                console.log('error object',error)
            })
        }
        render() {
            return (
                <div className="container">
                    <Navbar/>
                    <br></br>
                    <p  ref={this.pRef} align='center' style={{color:'red',visibility:'hidden'}}><h3>{this.error}</h3></p>
                    <div className="d-flex justify-content-center h-100">
                        <div className="card">
                            <div className="card-header">
                                <h3>Sign In</h3>
                            </div>
                            <div className="card-body">
                                <form>
                                    <div className="input-group form-group">
                                        <div className="input-group-prepend">
                                            <span className="input-group-text"><i className="fas fa-user"></i></span>
                                        </div>
                                        <input type="text" className="form-control" value={this.state.id} placeholder="userID" onChange={(event)=>{this.setState({id:event.target.value})}}/>
                                        
                                    </div>
                                    <div className="input-group form-group">
                                        <div className="input-group-prepend">
                                        <span className="input-group-text"><i className="fas fa-key"></i></span>
                                        </div>
                                        <input type="password" className="form-control" placeholder="password"/>
                                    </div>
                                    <div className="form-group">
                                        <input type="submit" value="Login" onClick={this.onSubmit.bind(this)} className="btn float-right login_btn"/>
                                    </div>
                                </form>
                                </div>
                          
                            <div className="card-footer">
                                <div className="d-flex justify-content-center links">
                                    Don't have an account?<a href="/createaccount">Sign Up</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
              
            )
        }
    }
           
    
    
    export default withRouter(Login)
