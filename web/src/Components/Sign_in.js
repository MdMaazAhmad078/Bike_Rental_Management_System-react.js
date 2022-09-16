import React, { Component } from "react";
import { Container, Row, Col, Button, Form, } from "reactstrap";

export default class Sign_in extends Component{
    render(){
        
            const myStyle={
                backgroundImage: 
         "url('https://media.geeksforgeeks.org/wp-content/uploads/rk.png')",
                height:'10vh',
                marginTop:'-70px',
                fontSize:'50px',
                backgroundSize: 'cover',
                backgroundRepeat: 'no-repeat',
            };
        return(
            <div style={myStyle}> 
            <div >
                
                <header className="App-header">
           
           
            <Form>
                <h3>Sign In</h3>
                <div>
                <lable Style={{color:"black"}}>Username:</lable>
                <input type="text" placeholder="Enter Username"/>
                </div>
               
            </Form>
            </header>
            </div>
            
            </div>
        );
    }

}