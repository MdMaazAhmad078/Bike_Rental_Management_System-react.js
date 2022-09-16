import "./App.css";
// import Login from './Components/Login';
import Footer from "./Components/Footer";
import React, { useState } from 'react';
import Header from "./Components/Header";
import Home from "./Components/Home";
import Customer from "./Components/Customer";
import Inventory from "./Components/Inventory";
import Booking from "./Components/Booking";
import Booking_List from "./Components/Booking_List";
import Staff from "./Components/Staff";
import Contact from "./Components/Contact";
import Add_Staff from "./Components/Add_Staff";
import Add_Bike from "./Components/Add_Bike";
import Login from "./Components/Login";
import Signup from "./Components/Signup";
import { BrowserRouter as Router } from "react-router-dom";
import { Suspense } from "react";
import { BrowserRouter } from "react-router-dom";
import { Route, Link } from "react-router-dom";

function App() {
  const [login, setLogin] =useState(true);
  if (login===false){
      return (
          <Suspense fallback={null}>
          <Router>
              <div>
             
                  <Route path="/" exact component={Login} />
                  <Route path="/Signup" exact component={Signup} />
  
              </div>
  
          </Router>
          
          </Suspense>
  
      );

  }
  else
  {
      return (
          <Suspense fallback={null}>
          <Router>
              <div>
              
              <Route path="/" exact component={Login} />
              <Route path="/Signup" exact component={Signup} />
              <Header/>
              
     
      <Route  path="/Home" exact component={Home} />
      <Route  path='/Customer' component={Customer} />
      <Route  path='/Inventory' component={Inventory} />
      <Route  path='/Staff' component={Staff} />
      <Route  path='/Contact' component={Contact} />
      <Route  path='/Add_Staff' component={Add_Staff} />
      <Route  path='/Add_Bike' component={Add_Bike} />
       <Route  path='/Booking' component={Booking} />
       <Route  path='/Booking_List' component={Booking_List} />
           
              
              
                 
  
              </div>
  
          </Router>
          <Footer />
          </Suspense>
  
      );
  }
 
}

//   return (
//     <div className="App">
      
//       <BrowserRouter>
//       <div>
//       <Header/>
//       <Route path="/" exact component={Login}/>
//       <Route  path="/Home" exact component={Home} />
//       <Route  path='/Customer' component={Customer} />
//       <Route  path='/Inventory' component={Inventory} />
//       <Route  path='/Staff' component={Staff} />
//       <Route  path='/Contact' component={Contact} />
//       <Route  path='/Add_Staff' component={Add_Staff} />
//       <Route  path='/Add_Bike' component={Add_Bike} />
//        <Route  path='/Booking' component={Booking} />
//        <Route  path='/Booking_List' component={Booking_List} />
//       </div>
      

        

       
//       </BrowserRouter>
//       <Footer />
//     </div>
//   );
// }


export default App;
