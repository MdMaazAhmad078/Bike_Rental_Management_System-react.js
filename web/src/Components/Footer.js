import React, { Component } from "react";

export default class Footer extends Component {
  render() {
    return (
      <div className="footer">
        <p
          style={{
            padding: "20px",
            backgroundColor: "#F3F1F5",
            fontSize: "12px",
          }}
        >
          All Rights Reserved. BIKE RENTAL MANAGEMENT SYSTEM © 2022 | JAY RENTAL © V1.0.0
          <br />
          contact@JAY.com
        </p>
      </div>
    );
  }
}
