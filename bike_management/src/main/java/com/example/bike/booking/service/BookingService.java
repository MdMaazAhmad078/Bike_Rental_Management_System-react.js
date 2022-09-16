package com.example.bike.booking.service;

import java.util.List;

import com.example.bike.booking.bean.BookingBean;

public interface BookingService {
	public void createBooking(BookingBean bookingBean);
	public BookingBean getBookingById(int id);
	public List<BookingBean> getListOfBookingList();
	public void deleteBookingById(int id);
	

}
