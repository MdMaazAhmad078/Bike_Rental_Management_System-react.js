import React, { Component } from "react";
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";
import { Container, Row, Col, Button } from "reactstrap";
import axios from 'axios';

export default class Guest extends Component {
    constructor(props) {
        super(props);
        this.state = { 
          GetlistofGuest: [],
          flag:false,
         }
    
      }
      getListOfGuestMethod = () =>{
        axios.get("http://127.0.0.1:8081/Controller/GetListOfBooking")
    
        .then(response => {
          console.log('response', response.data)
          if(response.status===200)
          {
            console.log('in if condition')
            this.setState({
              GetlistofGuest: response.data
          })
    
          }
        else{
          this.setState({
            GetlistofGuest: []
        })
        }
    
          
        })
      }
      componentDidMount() {
        this.getListOfGuestMethod();
       }
    render() {
        
        const {GetlistofGuest} = this.state;
        const columns =[
            {
                Header: 'S.No',
                accessor: 'SNo',
                Cell: (props) => <span className="number">{props.index + 1}</span>,
                filterable: false,
            },
            {
                Header: 'First Name',
                accessor: 'firstName',
            },
            {
                Header: 'Last Nmae',
                accessor: 'lastName',
            },
            {
                Header: 'Age',
                accessor: 'age',
            },
            {
                Header: 'Phone Number',
                accessor: 'phoneNumber',
            },
            {
                Header: 'Addhar No',
                accessor: 'addharNumber',
            },
            {
              Header: 'License No',
              accessor: 'licenceNumber',
          },
          {
            Header: 'Bike Name',
            accessor: 'bikeName',
        },
            {
                Header: 'Bike No',
                accessor: 'bikeNumber',
            },
            {
                Header: 'Booking Date',
                accessor: 'checkIn',
            },
            {
                Header: 'Submitting Date',
                accessor: 'checkOut',
            },
        ];
      return (
        <React.Fragment>
             <Container  fluid={true}  >
             <Row style={{marginLeft:"1px"}}>
                     
                     <b
                       style={{ color: "#0d007e", cursor: "pointer" }}
                     >
                       <h3 style={{marginBottom:"-0.5%"}}>Customer Detail's</h3>
                     </b>
                   
                 </Row>
                 <br></br>
                
       
                 <ReactTable
                   className="-striped -highlight tblwid"
                   data={GetlistofGuest}
                   columns={columns}
                   filterable
                  
                  
                  
                 />
             </Container>
        </React.Fragment>
      );
    }
  }