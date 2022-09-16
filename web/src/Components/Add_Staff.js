import React, { Component } from "react";
import { Button, Form, Label, Input } from "reactstrap";
import { Container, Row, Col, FormGroup } from "reactstrap";
import Box from '@material-ui/core/Box';
import TextField from '@material-ui/core/TextField';
import MenuItem from '@material-ui/core/MenuItem';
import axios from 'axios';

export default class Add_Staff extends Component {
  constructor(props) {
    super(props);
    this.state = {
      age: "",
      lastName: "",
      firstName: "",
      addharNumber: "",
      panNumber: "",
      email: "",
      phoneNumber: "",
      permanentAddress: "",
      secondaryAddress: "",
      city: "",
      state: "",
      pinCode: "",
      errmsg: "",
      dateOfBirth: "",
      employeeId: "",
      role: "",
      motherName: "",
      fatherName: ""
    };
  };
  handleChange = (event) => {
    this.setState({
      [event.target.name]: event.target.value,
    });
  };
  StaffListHandler(user) {
    console.log("Staff List");
    if (user === "Staff") {
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
      .post("http://127.0.0.1:8081/Controller/CreateStaff", this.state)
      .then((response) => {
        console.log("response", response);
        if (response.status === 200) {
          this.props.history.push({
            pathname: "./Staff",
          });
        }
      })
      .catch((error) => {
        console.log("error", error);
      });
  };
  render() {
    const gender = [
      {
        value: 'Male',
        label: 'Male',
      },
      {
        value: 'Female',
        label: 'Female',
      },
    ];
    return (
      <div >

        <Form className="bigformbg">
          <h2> Enter Staff Detail's</h2>

          <br />

          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '25ch' },
            }}
            noValidate
            autoComplete="off"
          >

            <TextField
              id="filled"
              label="First Name:"
              variant="filled"
              value={this.state.firstName}
              name="firstName"
              onChange={this.handleChange} />

            &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;

            <TextField
              id="filled"
              label="Last Name:"
              variant="filled"
              value={this.state.lastName}
              name="lastName"
              onChange={this.handleChange} />

          </Box>
          <br />
          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '25ch' },
            }}
            noValidate
            autoComplete="off"
          >

            <TextField
              id="filled"
              label="Father Name:"
              variant="filled"
              value={this.state.fatherName}
              name="fatherName"
              onChange={this.handleChange} />

            &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;

            <TextField
              id="filled"
              label="Mother Name:"
              variant="filled"
              value={this.state.motherName}
              name="motherName"
              onChange={this.handleChange} />

          </Box>
          <br />
          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '25ch' },
            }}
            noValidate
            autoComplete="off"

          >

            <TextField id="filled"
              label="Age:"
              variant="filled"
              value={this.state.age}
              name="age"
              onChange={this.handleChange} />
            &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;

            <TextField
              id="filled"
              select
              variant="filled"
              label="Gender"
              value={this.state.gender}
              name="gender"
              onChange={this.handleChange}


            >
              {gender.map((option) => (
                <MenuItem key={option.value} value={option.value}>
                  {option.label}
                </MenuItem>
              ))}
            </TextField>

          </Box>
          <br />
          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '25ch' },
            }}
            noValidate
            autoComplete="off"

          >

            <TextField
              id="filled"
              label="Salary:"
              variant="filled"
              value={this.state.salary}
              name="salary"
              onChange={this.handleChange} />
            &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;

            <TextField
              id="filled"
              variant="filled"
              label="Role"
              value={this.state.role}
              name="role"
              onChange={this.handleChange}
            >
            </TextField>

          </Box>
          <br />
          <Col xs="3">
            <Label style={{ marginRight: "27%" }}>DOB<span style={{ color: "red" }}>*</span></Label><br />

            <TextField
              id="filled"
              label=""
              variant="filled"
              style={{ borderRadius: "10px", marginRight: "18%" }}
              type="date"
              value={this.state.dateOfBirth}
              name="dateOfBirth"
              onChange={this.handleChange}

            /><br />

          </Col>
          <br />
          <Label style={{ marginRight: "27%" }}>ID:</Label>

          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '55ch' },
            }}
            noValidate
            autoComplete="off"
            style={{ marginRight: "" }}
          >

            <TextField
              id="filled"
              label="Addhar Number:"
              variant="filled"
              name="addharNumber"
              value={this.state.addharNumber}
              onChange={this.handleChange} />

            <br /> <br />

            <TextField id="filled"
              label="Pan No(Optional)*:"
              variant="filled"
              value={this.state.panNumber}
              onChange={this.handleChange}
              name="panNumber" ></TextField>

            <br /> <br />

          </Box>
          <br />
          <Label style={{ marginRight: "22.5%" }}>Employee Id:</Label>
          <br />
          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '55ch' },
            }}
            noValidate
            autoComplete="off"
            style={{ marginRight: "" }}
          >
            <TextField
              id="filled"
              label=""
              variant="filled"
              name="employeeId"
              value={this.state.employeeId}
              onChange={this.handleChange} />

          </Box>

          <br />
          <Label style={{ marginRight: "27%" }}>Email:</Label>

          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '55ch' },
            }}
            noValidate
            autoComplete="off"
            style={{ marginRight: "" }}
          >

            <TextField
              id="filled"
              label=""
              variant="filled"
              name="email"
              value={this.state.email}
              onChange={this.handleChange} />


          </Box>
          <br />
          <Label style={{ marginRight: "22.5%" }}>Phone Number:</Label>
          <br />
          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '55ch' },
            }}
            noValidate
            autoComplete="off"
            style={{ marginRight: "" }}
          >
            <TextField
              id="filled"
              label=""
              variant="filled"
              name="phoneNumber"
              value={this.state.phoneNumber}
              onChange={this.handleChange} />
          </Box>
          <br />
          <Label style={{ marginRight: "26%" }}>Address:</Label>

          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '55ch' },
            }}
            noValidate
            autoComplete="off"
            style={{ marginRight: "" }}
          >

            <TextField
              id="filled"
              label="Permanent Address:"
              variant="filled"
              name="permanentAddress"
              value={this.state.permanentAddress}
              onChange={this.handleChange}
            />
            <br /> <br />
            <TextField
              id="filled"
              label="Secondary Address :"
              variant="filled"
              name="secondaryAddress"
              value={this.state.secondaryAddress}
              onChange={this.handleChange}
            />
            <br /> <br />

          </Box>

          <Box
            component="form"
            sx={{
              '& > :not(style)': { m: 1, width: '25ch' },
            }}
            noValidate
            autoComplete="off"
          >
            <TextField
              id="filled"
              label="City:"
              variant="filled"
              value={this.state.city}
              name="city"
              onChange={this.handleChange}
              style={{ marginRight: "1.8%" }} />

            &nbsp;  &nbsp;
            <TextField
              id="filled"
              label="State:"
              variant="filled"
              value={this.state.state}
              name="state"
              onChange={this.handleChange}
            />
            <br /><br />
            <TextField
              id="filled"
              label="Pin Code:"
              variant="filled"
              name="pinCode"
              value={this.state.pinCode}
              onChange={this.handleChange}
              style={{ marginRight: "16%" }} />
          </Box>
          <br />

          <br />
          <Button
            variant="contained"
            style={{ backgroundColor: "#305de2", color: "white", padding: "11px 27px 9px", border: "none" }}
            onClick={this.handleSubmit}

          //   onClick={() => this.handleSubmit("Submit")}
          >

            SUBMIT
          </Button>
        </Form>
      </div>
    );
  }
}

