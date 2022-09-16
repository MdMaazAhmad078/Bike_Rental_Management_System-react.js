import React, { Component } from "react";
import { Button, Form, Label, Input } from "reactstrap";
import { Container, Row, Col, FormGroup } from "reactstrap";
import Box from '@material-ui/core/Box';
import TextField from '@material-ui/core/TextField';
import MenuItem from '@material-ui/core/MenuItem';
import axios from 'axios';

export default class Add_Bike extends Component {
    constructor(props) {
        super(props);
        this.state = {
            bikeName: "",
            bikeNumber: "",
            bikeModel: "",
            brand: "",
            cc: "",
            price:"",
            year: "",
            status: "",
            insurance: "",
            bikeType: "",
            errmsg: "",
            kilometerUsed: ""
        };
    };
    handleChange = (event) => {
        this.setState({
            [event.target.name]: event.target.value,
        });
    };
    handleSubmit = () => {
        // e.preventDefault()
        console.log("submit handler", this.state);
        console.log(this.state);
        axios
            .post("http://127.0.0.1:8081/Controller/CreateInventory", this.state)
            .then((response) => {
                console.log("response", response);
                if (response.status === 200) {
                    this.props.history.push({
                        pathname: "./Inventory",
                    });
                }
            })
            .catch((error) => {
                console.log("error", error);
            });
    };
    render() {
        const status = [
            {
                value: 'Avalaible',
                label: 'Avalaible',
            },
            {
                value: 'Not Avalaible',
                label: 'Not Avalaible',
            },
        ];
        const biketype = [
            {
                value: 'Standard',
                label: 'Standard',
            },
            {
                value: 'Cruiser',
                label: 'Cruiser',
            },
            {
                value: 'Touring',
                label: 'Touring',
            },
            {
                value: 'Sports',
                label: 'Sports',
            },
            {
                value: 'Off-Road',
                label: 'Off-Road',
            },
        ];
        const insurance = [
            {
                value: 'Yes',
                label: 'Yes',
            },
            {
                value: 'No',
                label: 'No',
            },
        ];
        return (
            <div >

                <Form className="bigformbg">
                    <h2> Enter Bike Detail's</h2>

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
                            label="Bike Name:"
                            variant="filled"
                            value={this.state.bikeName}
                            name="bikeName"
                            onChange={this.handleChange} />

                        &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;

                        <TextField
                            id="filled"
                            label="Bike Number:"
                            variant="filled"
                            value={this.state.bikeNumber}
                            name="bikeNumber"
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
                            label="Model:"
                            variant="filled"
                            value={this.state.bikeModel}
                            name="bikeModel"
                            onChange={this.handleChange} />

                        &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;

                        <TextField
                            id="filled"
                            label="Brand:"
                            variant="filled"
                            value={this.state.brand}
                            name="brand"
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
                            label="Cubic Capacity:"
                            variant="filled"
                            value={this.state.cc}
                            name="cc"
                            onChange={this.handleChange} />
                        &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;
                        <TextField
                            id="filled"
                            select
                            variant="filled"
                            label="Status"
                            value={this.state.status}
                            name="status"
                            onChange={this.handleChange}
                        >
                            {status.map((option) => (
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
                            select
                            variant="filled"
                            label="Insurance"
                            value={this.state.insurance}
                            name="insurance"
                            onChange={this.handleChange}


                        >
                            {insurance.map((option) => (
                                <MenuItem key={option.value} value={option.value}>
                                    {option.label}
                                </MenuItem>
                            ))}
                        </TextField>
                        &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;

                        <TextField
                            id="filled"
                            variant="filled"
                            label="Year"
                            value={this.state.year}
                            name="year"
                            onChange={this.handleChange}
                        >
                        </TextField>
                    </Box>
                    <br/>
                    <TextField
                            id="filled"
                            variant="filled"
                            label="Price"
                            value={this.state.price}
                            name="price"
                            onChange={this.handleChange}
                        >
                        </TextField>
                    <br />
                    <Label style={{ marginRight: "25%" }}>Bike Type:</Label>
                    <Box
                        component="form"
                        sx={{
                            "& > :not(style)": { m: 1, width: "55ch" },
                        }}
                        noValidate
                        autoComplete="off"
                    >
                        <TextField
                            id="filled"
                            select
                            variant="filled"
                            label=""
                            value={this.state.biketype}
                            name="bikeType"
                            onChange={this.handleChange}


                        >
                            {biketype.map((option) => (
                                <MenuItem key={option.value} value={option.value}>
                                    {option.label}
                                </MenuItem>
                            ))}
                        </TextField>
                    </Box>
                    <br />

                    <Label style={{ marginRight: "23%" }}>Kilometer Used:</Label>
                    <Box
                        component="form"
                        sx={{
                            "& > :not(style)": { m: 1, width: "55ch" },
                        }}
                        noValidate
                        autoComplete="off"
                    >
                        <TextField
                            id="filled"
                            variant="filled"
                            label=""
                            value={this.state.kilometerUsed}
                            name="kilometerUsed"
                            onChange={this.handleChange}


                        >

                        </TextField>
                    </Box>

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

