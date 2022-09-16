import React, { Component } from "react";
import ReactRoundedImage from "react-rounded-image";
import guest from "../Assests/guest.png";
import room from "../Assests/room.png";
import booking from "../Assests/booking.png";
import rent from "../Assests/rental.png";
import staff from "../Assests/staff.jpg";
import logout from "../Assests/logout.png";
import bikeicon from "../Assests/bikeicon.jpg";
import contact from "../Assests/contact.png";
import { withRouter } from 'react-router-dom';
import Home from '@material-ui/icons/Home';
import { Container, Row, Col, FormGroup } from "reactstrap";

class Header extends Component {
  HomeHandler(user) {
    console.log("Home")
    if (user === "Home") {
      this.props.history.push({
        pathname: "/Home",

      });
    }
  }
  AddBikeHandler(user) {
    console.log("Add Bike")
    if (user === "Add_Bike") {
      this.props.history.push({
        pathname: "/Add_Bike",

      });
    }
  }
  LogoutHandler(user) {
    console.log("Logout")
    if (user === "Logout") {
      this.props.history.push({
        pathname: "/",

      });
    }
  }
  ContactHandler(user) {
    console.log("Contact")
    if (user === "Contact") {
      this.props.history.push({
        pathname: "/Contact",

      });
    }
  }
  BookingHandler(user) {
    console.log("book")
    if (user === "Booking") {
      this.props.history.push({
        pathname: "/Booking",

      });
    }
  }
  BookingListHandler(user) {
    console.log("booking List")
    if (user === "Booking_List") {
      this.props.history.push({
        pathname: "/Booking_List",

      });
    }
  }
  CustomerHandler(user) {
    console.log("Customer")
    if (user === "Customer") {
      this.props.history.push({
        pathname: "/Customer",

      });
    }
  }
  StaffHandler(user) {
    console.log("Staff")
    if (user === "Staff") {
      this.props.history.push({
        pathname: "/Staff",

      });
    }
  }
  InventoryHandler(user) {
    console.log("Inventory")
    if (user === "Inventory") {
      this.props.history.push({
        pathname: "/Inventory",

      });
    }
  }
  render() {


    return (
      <React.Fragment>
        <div
          className="container"
          style={{
            color: "white",
            background: "#020716",

            fontSize: "12px",
            padding: "5px",
            justifyContent: "center",
            alignItems: "center",
            textAlign: "center",
          }}
        >
          <a
            onClick={() => this.HomeHandler("Home")}
            style={{
              color: "white",
              cursor: "pointer",
              fontFamily: "sans-serif",
            }}
          >
            BIKE RENTAL MANAGEMENT SYSTEM
          </a>
        </div>
        <Row>
          <div
            className="container"
            style={{
              height: "85px",
              color: "white",

              background: "#2C3E50",
              textAlign: "center",
            }}
          >
            &nbsp;
            <Col>
              <div style={{
                display: "flex",
                marginTop: "-13px",
                alignItems: "center",

              }}>
                <div
                  style={{
                    display: "flex",
                    marginTop: "14px",
                    alignItems: "center",
                  }}
                  onClick={() => this.HomeHandler("Home")}

                >


                  <a
                    onClick={() => this.HomeHandler("Home")}
                    style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
                  >
                    <Home style={{ fontSize: 34 }} />
                  </a>
                </div>
              </div>
              &nbsp;&nbsp;
              &nbsp;&nbsp;
            </Col>

          </div>
          <Col>
            <div
              style={{
                display: "flex",
                marginTop: "-82px",
                alignItems: "center",

                justifyContent: "center",
              }}
            >

              <div
                style={{
                  marginInline: "3px",
                  cursor: "pointer",
                }}
                onClick={() => this.CustomerHandler("Customer")}
              >
                <ReactRoundedImage
                  imageWidth="52"
                  imageHeight="52"
                  roundedSize="10"
                  borderRadius="10"
                  hoverColor="#DD1144"
                  image={guest}
                />
                <a
                  onClick={() => this.CustomerHandler("Customer")}
                  style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
                >
                  CUSTOMER
                </a>
              </div>
              &nbsp;&nbsp;
              &nbsp;&nbsp;
              <div
                style={{ marginInline: "3px", cursor: "pointer"}}
                onClick={() => this.AddBikeHandler("Add_Bike")}
              >
                <ReactRoundedImage
                  imageWidth="52"
                  imageHeight="52"
                  roundedSize="10"
                  borderRadius="10"
                  hoverColor="#DD1144"
                  image={bikeicon}
                />
                <a
                  onClick={() => this.AddBikeHandler("Add_Bike")}
                  style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
                >
                  ADD BIKE
                </a>
              </div>
              &nbsp;&nbsp;
              &nbsp;&nbsp;
              <div
                style={{ marginInline: "3px", cursor: "pointer" }}
                onClick={() => this.InventoryHandler("Inventory")}
              >
                <ReactRoundedImage
                  imageWidth="52"
                  imageHeight="52"
                  roundedSize="10"
                  borderRadius="10"
                  hoverColor="#DD1144"
                  image={room}
                />
                <a
                  onClick={() => this.RoomHandler("Inventory")}
                  style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
                >
                  INVENTORY
                </a>
              </div>
              &nbsp;&nbsp;
              &nbsp;&nbsp;
              <div
                style={{ marginInline: "3px", cursor: "pointer" }}
                onClick={() => this.BookingHandler("Booking")}

              >
                <ReactRoundedImage
                  imageWidth="52"
                  imageHeight="52"
                  roundedSize="10"
                  borderRadius="10"
                  hoverColor="#DD1144"
                  image={booking}
                />
                <a
                  onClick={() => this.BookingHandler("Booking")}
                  style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
                >
                  RENTAL
                </a>
              </div>
              &nbsp;&nbsp;
              &nbsp;&nbsp;
              <div
                style={{ marginInline: "3px", cursor: "pointer" }}
                onClick={() => this.StaffHandler("Staff")}
              >
                <ReactRoundedImage
                  imageWidth="52"
                  imageHeight="52"
                  roundedSize="10"
                  borderRadius="10"
                  hoverColor="#DD1144"
                  image={staff}
                />
                <a
                  onClick={() => this.StaffHandler("Staff")}
                  style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
                >
                  EMPLOYEE
                </a>
              </div>
              &nbsp;&nbsp;
              &nbsp;&nbsp;
              <div
                style={{ marginInline: "3px", cursor: "pointer" }}
                onClick={() => this.BookingListHandler("Booking_List")}

              >
              
                <ReactRoundedImage
                  imageWidth="52"
                  imageHeight="52"
                  roundedSize="10"
                  borderRadius="10"
                  hoverColor="#DD1144"
                  image={rent}
                />
                <a
                  onClick={() => this.BookingListHandler("Booking_List")}
                  style={{ fontSize: "13px", color: "white", cursor: "pointer" }}
                >
                  RENTAL DETAIL
                </a>
              </div>
             
             
              

            </div>
          </Col>
          <Col style={{marginTop:"-4.6%",marginLeft:"88%"}}>
          <div
                style={{ marginInline: "3px", cursor: "pointer",marginLeft:"50px" }}
                onClick={() => this.LogoutHandler("Logout")}
              >
                <ReactRoundedImage
                  imageWidth="52"
                  imageHeight="52"
                  roundedSize="10"
                  borderRadius="10"
                  hoverColor="#DD1144"
                  image={logout}
                />
                <a
                  onClick={() => this.LogoutHandler("Logout")}
                  style={{ fontSize: "13px", color: "white", cursor: "pointer" ,marginLeft:"0%"}}
                >
                  LOGOUT
                </a>
              </div>
          </Col>
          <Col style={{marginTop:"-4.9%",marginLeft:"92%"}}>
          <div
                style={{ marginInline: "3px", cursor: "pointer",marginLeft:"50px" }}
                onClick={() => this.ContactHandler("Contact")}
              >
                <ReactRoundedImage
                  imageWidth="52"
                  imageHeight="52"
                  roundedSize="10"
                  borderRadius="10"
                  hoverColor="#DD1144"
                  image={contact}
                />
                <a
                  onClick={() => this.ContactHandler("Contact")}
                  style={{ fontSize: "13px", color: "white", cursor: "pointer" ,marginLeft:"-3%"}}
                >
                  CONTACT
                </a>
              </div>
          </Col>
                

        </Row>
      </React.Fragment>
    );
  }
}

export default withRouter(Header);
