import React, { Component } from "react";
import "./Home.css"
// import { Card, Button } from 'react-bootstrap'; 
import Card from "./Card";
import Banner from './Banner';
import a from "../Assests/2.jpg";
import b from "../Assests/3.jpg";
import c from "../Assests/4.jpg";
import d from "../Assests/5.jpg";
import e from "../Assests/6.jpg";
import f from "../Assests/7.jpg";


export default class Home extends Component {
  render() {
    return (
                <div className="home">
               <br/>
                    <Banner />
                   
                    <div className='home_section'>
            <Card
                src={a}
                title="Online Experiences"
                description="Unique activities we can do together, led by a world of hosts."
            />
            <Card
                src={b}
                title="Unique ride"
                description="Speed that are more than just a place to travel."
            />
            <Card
                src={c}
                title="Entire beast"
                description="It lead you in heaven ."
            />
            </div>
            <div className='home_section'>
            <Card
                src={d}
                title="The colourful journey"
                description="Enjoy the ride between the places"
                
            />
            <Card
                src={e}
                title="The shadow chaser "
                description="Feel the thrill"
                
            />
            <Card
                src={f}
                title="boundryless"
                description="no boundry between places"
                
            />
                    
                    </div>
                </div>
      
            );
  }
}

