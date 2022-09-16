package com.example.bike.booking.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bike.booing.entity.BookingEntity;

public interface BookingRepository  extends CrudRepository<BookingEntity, Integer> {

}
