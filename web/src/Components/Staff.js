import React, { Component } from "react";
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";
import { Container, Row, Col, Button } from "reactstrap";
import axios from 'axios';
import { confirmAlert } from 'react-confirm-alert';

export default class Staff extends Component {
  AddStaffHandler(user) {
    console.log("Add_Staff")
    if (user === "Add_Staff") {
      this.props.history.push({
        pathname: "./Add_Staff",
      });
    }
  }
  constructor(props) {
    super(props);
    this.state = {
      GetListOfEmployee: [],
      flag: false,
    }
  }
  onConfirm(employeeId) {
    confirmAlert({
      title: 'Confirm to delete',
      message: 'Are you sure to do this.',
      buttons: [
        {
          label: 'Yes',
          onClick: () => this.onDelete(employeeId)
        },
        {
          label: 'No',
          // onClick: () => alert('Click No')
        }
      ]
    });
  }
  onDelete(employeeId) {
    console.log("reservationId  +================ ", employeeId);
    // let studentId=this.state.details.studentId;
    axios.delete(`http://127.0.0.1:8081/Controller/DeleteEmployee/` + employeeId)
      .then(response => {
        if (response.status === 200) {
          this.props.history.push({
            pathname: "./Add_Staff",
          });
          this.setState({
            flag: true,
          })
        }
        // this.props.history.push('/Ad_Section_List');
      })
      .catch(err => console.log(err));

  }
  getListOfStaffMethod = () => {
    axios.get("http://127.0.0.1:8081/Controller/ GetListOfEmployee")

      .then(response => {
        console.log('response', response.data)
        if (response.status === 200) {
          console.log('in if condition')
          this.setState({
            GetListOfEmployee: response.data
          })

        }
        else {
          this.setState({
            GetListOfEmployee: []
          })
        }


      })
  }
  componentDidMount() {
    this.getListOfStaffMethod();
  }
  render() {
    const { GetListOfEmployee } = this.state;
    const columns = [
      {
        Header: 'S.No',
        accessor: 'SNo',
        Cell: (props) => <span className="number">{props.index + 1}</span>,
        filterable: false,
      },
      {
        Header: 'Staff Id',
        accessor: 'staffId',

      },
      {
        Header: 'First Name',
        accessor: 'firstName',
      },
      {
        Header: 'Last Name',
        accessor: 'lastName',
      },
      {
        Header: 'Age',
        accessor: 'age',
      },
      {
        Header: 'Addhar No',
        accessor: 'addharNumber',
      },
      {
        Header: 'Pan No',
        accessor: 'panNumber',
      },
      {
        Header: 'Phone Number',
        accessor: 'phoneNumber',
      },
      {
        Header: 'Date Of Birth',
        accessor: 'dateOfBirth',
      },
      {
        Header: 'Gender',
        accessor: 'gender',
      },
      {
        Header: 'E-Mail',
        accessor: 'email',
      },
      {
        Header: 'Salary',
        accessor: 'salary',
      },
      {
        Header: 'Role',
        accessor: 'role',
      },
      {
        Header: 'Join',
        accessor: 'dateOfJoin',
      },
      {
        Header: 'Delete',
        accessor: 'Delete',
        Cell: (props) => ( <Button
             
            className="button-design"
            variant="contained"
              onClick={() => this.onConfirm(props.original.employeeId)} 
            style={{
              marginTop: "-1.4%",
              marginRight: "2%",
              marginLeft: "10px",
              padding:"6px 15px 5px",
              backgroundColor:"red",color:"white",border:"none"
            }}
          >
           Delete
          </Button>
            //  onClick={() => this.onConfirm(props.original.idSection)} 
             )
    },


    ];
    return (
      <React.Fragment>
        <Container fluid={true}  >
          <Row style={{ marginLeft: "1px" }}>
            <Col>
              <b
                style={{ color: "#0d007e", cursor: "pointer" }}
              >
                <h3 style={{ marginBottom: "-0.5%" }}>Employee Detail's</h3>
              </b>
              <Button

                className="button-design"
                variant="contained"
                onClick={() => this.AddStaffHandler("Add_Staff")}
                style={{
                  marginTop: "-1.4%",
                  marginRight: "2%",
                  marginLeft: "10px",
                  float: "right",
                  backgroundColor: "#305de2", color: "white", padding: "11px 27px 9px",
                }}
              >
                Add New Staff
              </Button>
            </Col>
          </Row>
          <br></br>


          <ReactTable
            className="-striped -highlight tblwid"
            data={GetListOfEmployee}
            columns={columns}
            filterable



          />
        </Container>
      </React.Fragment>
    );
  }
}