package com.example.bike.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bike.booking.bean.BookingBean;
import com.example.bike.booking.service.BookingService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	
	@PostMapping(value="/CreateBooking")
	public void createBooking(@RequestBody BookingBean bookingBean)
	{
		bookingService.createBooking(bookingBean);
	}
	
	@DeleteMapping(value="/DeleteBooking/{id}")
	public void deleteBookingbyId(@PathVariable("id") int id) {
		bookingService.deleteBookingById(id);
	}
	
	@PostMapping(value="GetBookingByID/{id}")
	public BookingBean getBookingbyId(@PathVariable("id") int id)
	{
		return bookingService.getBookingById(id);
	}
	
	@GetMapping(value="GetListOfBooking")
	public List<BookingBean> getListOfBookingList()
	{
		return bookingService.getListOfBookingList();
	}
	
	


}
