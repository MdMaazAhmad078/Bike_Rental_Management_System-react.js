import React,{ Component }  from 'react';
import './Signup.css';
import axios from "axios";

export default class Signup extends Component {
    constructor(props) {
        super(props);
    
        this.state = {
          name: '',
          username: '',
          password: '',
          email: "",
          phoneNumber: "",
      
        };
    
      }
      handleChange = (event) => {
        this.setState({
          [event.target.name]: event.target.value,
        }); 
      };
    Signuphandler(user) {
        console.log("Login");
        if (user === "Login") { 
          this.props.history.push({
            pathname: "./",
          });
        }
      }

      handleSubmit = () => {
        // e.preventDefault()
        console.log("submit handler", this.state);
    
        console.log(this.state);
        axios
          .post("http://127.0.0.1:8081/Controller/CreateSignUp", this.state)
          .then((response) => {
            console.log("response", response);
            if (response.status === 200) {
              this.props.history.push({
                pathname: "./",
              });
            }
          })
    
          .catch((error) => {
            console.log("error", error);
          });
      };


      render() {
    return(
        <>
             <div className="container-L">
             <p>The Safe Way Is The Best Way</p>
      <div className="forms-container">
        <div className="signin-signup">
          <form action="#" className="sign-in-form">
            <h2 className="title-L">Sign up</h2>
            <div className="input-field">
              <i className="fas fa-user"></i>
              <input type="text" placeholder="Name" onChange={this.handleChange} value={this.state.name} name="name"/>
            </div>
            <div className="input-field">
              <i className="fas fa-user"></i>
              <input type="number" placeholder="Phone Number" onChange={this.handleChange} value={this.state.phoneNumber} name="phoneNumber"/>
            </div>
            <div className="input-field">
              <i className="fas fa-user"></i>
              <input type="text" placeholder="E-mail" onChange={this.handleChange} value={this.state.email} name="email"/>
            </div><div className="input-field">
              <i className="fas fa-user"></i>
              <input type="text" placeholder="Username" onChange={this.handleChange} value={this.state.username} name="username"/>
            </div>
            <div className="input-field">
              <i className="fas fa-lock"></i>
              <input type="password" placeholder="Password" onChange={this.handleChange} value={this.state.password} name="password"/>
            </div>
          
            <div className="btn-login">
            <input type="submit" value="Submit" className="btn solid"  onClick={this.handleSubmit}/>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="submit" value="Log-In" className="btn solid"  onClick={() => this.Signuphandler("Login")}/>
            </div>
           
          </form>
          </div>
        </div>

        <div className="panels-container">
        <div className="panel left-panel">
          <div className="content">
          <h1 className="font-h1">BIKE RENTAL MANAGEMENT SYSTEM</h1>
            <h3>The Safe Way Is The Best Way</h3>
            
           
          </div>
         
        </div>
       
      </div>
      </div>

        </>
    );
}
}
