package com.example.bike.booking.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bike.booing.entity.BookingEntity;
import com.example.bike.booking.bean.BookingBean;
import com.example.bike.booking.repository.BookingRepository;
import com.example.bike.booking.service.BookingService;
import com.example.bike.customer.bean.customerBean;
import com.example.bike.customer.entity.customerEntity;
import com.example.bike.customer.repository.customerRepository;
import com.example.bike.inventory.bean.inventoryBean;
import com.example.bike.inventory.entity.inventoryEntity;
import com.example.bike.inventory.repository.inventoryRepository;
import com.example.bike.inventory.service.inventoryService;
@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private inventoryRepository inventoryRepository;
	
	
	@Autowired
	inventoryService inventoryservice;
	
	@Autowired
	customerRepository customerrepository;
	
	@Override
	public void createBooking(BookingBean bookingbean)
	{
		BookingEntity bookingEntity= null;
		customerEntity customerdata = new customerEntity() ;
		inventoryEntity inventorydata = inventoryRepository.findByBikeNumber(bookingbean.getBikeNumber()); 
		if(bookingbean!=null)
		{
			inventoryBean inventorybean = inventoryservice.getInventoryById(inventorydata.getInventoryId());
			bookingbean.setBikeName(inventorybean.getBikeName());
			bookingEntity = new BookingEntity();
			BeanUtils.copyProperties(bookingbean, bookingEntity);
			customerdata.setAadharNumber(bookingbean.getAddharNumber());
			customerdata.setAge(bookingbean.getAge());
			customerdata.setFirstName(bookingbean.getFirstName());
			customerdata.setLastName(bookingbean.getLastName());
			customerdata.setCheckIn(bookingbean.getCheckIn());
			customerdata.setCheckOut(bookingbean.getCheckOut());
			customerdata.setInventoryId(bookingbean.getInventoryId());
			customerdata.setBikeNumber(inventorybean.getBikeNumber());
			customerdata.setPhoneNumber(bookingbean.getPhoneNumber());
			customerdata.setEmail(bookingbean.getEmail());
			bookingRepository.save(bookingEntity);
			customerrepository.save(customerdata);
			
		}
		
		
	}
	
	@Override
	public void deleteBookingById(int id)
	{
		if(id!=0)
		{
			bookingRepository.deleteById(id);
		}
	}
	
	@Override
	public BookingBean getBookingById(int id) {
		BookingBean bookingbean = new BookingBean();
		Optional<BookingEntity> bookingEntity = bookingRepository.findById(id);
	
		if(bookingEntity != null && !"".equals(bookingEntity))
		BeanUtils.copyProperties(bookingEntity.get(), bookingbean);
		return bookingbean;
	}
	
	@Override
	public List<BookingBean> getListOfBookingList() {
		List<BookingEntity> listOfBookingEntity = (List<BookingEntity>) bookingRepository.findAll();
		List<BookingBean> listOfBookingBean = null;
		if(listOfBookingEntity!=null && !listOfBookingEntity.isEmpty()) {
			listOfBookingBean = new ArrayList();
			for(BookingEntity bookingEntity :listOfBookingEntity) {
				BookingBean bookingbean = new BookingBean();
				BeanUtils.copyProperties(bookingEntity, bookingbean);
				listOfBookingBean.add(bookingbean);
			}
		}
		return listOfBookingBean;
	}



}
