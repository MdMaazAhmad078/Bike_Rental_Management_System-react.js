import React, { Component } from "react";
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";
import { Container, Row, Col, Button } from "reactstrap";
import axios from 'axios';
import { confirmAlert } from 'react-confirm-alert'; // Import
import 'react-confirm-alert/src/react-confirm-alert.css';

export default class Booking_List extends Component {
  constructor(props) {
    super(props);
    this.state = { 
      GetlistofBooking: [],
      flag:false,
     }

  }
  onConfirm(bookingId){
    confirmAlert({
      title: 'Confirm to delete',
      message: 'Are you sure to do this.',
      buttons: [
        {
          label: 'Yes',
          onClick: () => this.onDelete(bookingId)
        },
        {
          label: 'No',
          // onClick: () => alert('Click No')
        }
      ]
    });
  }
    onDelete(bookingId)
    {
      console.log("reservationId  +================ ",bookingId );
      // let studentId=this.state.details.studentId;
      axios.delete(`http://127.0.0.1:8081/Controller/DeleteBooking/`+bookingId)
      .then(response=>{
        if(response.status === 200){
          this.setState({
            flag:true,
          })
        }
        // this.props.history.push('/Ad_Section_List');
      })
      .catch(err =>console.log(err));
  
    
    }
  getListOfBookingMethod = () =>{
    axios.get("http://127.0.0.1:8081/Controller/GetListOfBooking")

    .then(response => {
      console.log('response', response.data)
      if(response.status===200)
      {
        console.log('in if condition')
        this.setState({
          GetlistofBooking: response.data
      })

      }
    else{
      this.setState({
        GetlistofBooking: []
    })
    }

      
    })
  }
  componentDidMount() {
    this.getListOfBookingMethod();
   }
    render() {
        
      const {GetlistofBooking} = this.state;
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
                Header: 'Delivey Date',
                accessor: 'checkOut',
            },
            {
                Header: 'Cancellation',
                accessor: 'Cancellation',
                Cell: (props) => ( <Button
                     
                    className="button-design"
                    variant="contained"
                      onClick={() => this.onConfirm(props.original.bookingId)} 
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
             <Container  fluid={true}  >
             <Row style={{marginLeft:"1px"}}>
                     
                     <b
                       style={{ color: "#0d007e", cursor: "pointer" }}
                     >
                       <h3 style={{marginBottom:"-0.5%"}}>Total Booking</h3>
                     </b>
                   
                 </Row>
                 <br></br>
                
       
                 <ReactTable
                   className="-striped -highlight tblwid"
                   data={GetlistofBooking}
                   columns={columns}
                   filterable
                  
                  
                  
                 />
             </Container>
        </React.Fragment>
      );
    }
  }