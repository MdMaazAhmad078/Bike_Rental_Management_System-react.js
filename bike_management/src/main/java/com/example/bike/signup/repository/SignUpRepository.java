package com.example.bike.signup.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bike.signup.entity.SignUpEntity;

public interface SignUpRepository  extends CrudRepository<SignUpEntity, Integer> {

}
