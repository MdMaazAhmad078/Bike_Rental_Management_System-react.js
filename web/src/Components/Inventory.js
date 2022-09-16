import React, { Component } from "react";
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";
import { Container, Row, Col, Button } from "reactstrap";
import MenuItem from '@material-ui/core/MenuItem';
import Box from '@material-ui/core/Box';
import TextField from '@material-ui/core/TextField';
import axios from 'axios';
import { confirmAlert } from 'react-confirm-alert'; // Import

export default class Booking_List extends Component {
    constructor(props) {
        super(props);
        this.state = { 
          GetListOfInventory: [],
          flag:false,
         }
    
      }
    getListOfInventoryMethod = () =>{
        axios.get("http://127.0.0.1:8081/Controller/GetListOfInventory")
    
        .then(response => {
          console.log('response', response.data)
          if(response.status===200)
          {
            console.log('in if condition')
            this.setState({
              GetListOfInventory: response.data
          })
    
          }
        else{
          this.setState({
            GetListOfInventory: []
        })
        }
    
          
        })
      }
      componentDidMount() {
        this.getListOfInventoryMethod();
       }

       AddBikeHandler(user) {
        console.log("Add Bike");
        if (user === "Add_Bike") {
          this.props.history.push({
            pathname: "./Add_Bike",
          });
        }
      }
      onConfirm(inventoryId){
        confirmAlert({
          title: 'Confirm to delete',
          message: 'Are you sure to do this.',
          buttons: [
            {
              label: 'Yes',
              onClick: () => this.onDelete(inventoryId)
            },
            {
              label: 'No',
              // onClick: () => alert('Click No')
            }
          ]
        });
      }
        onDelete(inventoryId)
        {
          console.log("inventoryId  +================ ",inventoryId );
          // let studentId=this.state.details.studentId;
          axios.delete(`http://127.0.0.1:8081/Controller/DeleteInventory/`+inventoryId)
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
      
    render() {
        const {GetListOfInventory} = this.state


        const columns =[
            {
                Header: 'S.No',
                accessor: 'SNo',
                Cell: (props) => <span className="number">{props.index + 1}</span>,
                filterable: false,
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
              Header: 'Bike Model',
              accessor: 'bikeModel',
          },
            {
                Header: 'Type',
                accessor: 'bikeType',
            },
            {
              Header: 'Status',
              accessor: 'status',
          },
            {
                Header: 'Price Per Day',
                accessor: 'price',
            },
            {
              Header: 'Delete',
              accessor: 'Delete',
              Cell: (props) => ( <Button
                   
                  className="button-design"
                  variant="contained"
                    onClick={() => this.onConfirm(props.original.inventoryId)} 
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
                       <h2 style={{marginBottom:"-0.5%"}}>Inventory</h2>
                     </b>

                     <Button
              className="button-design"
              variant="contained"
              onClick={() => this.AddBikeHandler("Add_Bike")}
              style={{
                marginTop: "-1.4%",
                marginRight: "2%",
                marginLeft: "10px",
                float: "right",
                backgroundColor: "#305de2",
                color: "white",
                padding: "11px 27px 9px",
              }}
            >
              Add Bike
            </Button>
           
                     
                 </Row>
                 <br></br>
                
       
                 <ReactTable
                   className="-striped -highlight tblwid"
                   data={GetListOfInventory}
                   columns={columns}
                   filterable
                  
                  
                  
                 />
             </Container>
        </React.Fragment>
      );
    }
  }