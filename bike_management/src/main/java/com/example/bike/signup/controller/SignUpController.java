package com.example.bike.signup.controller;

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

import com.example.bike.signup.bean.SignUpBean;
import com.example.bike.signup.service.SignUpService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class SignUpController {

	@Autowired
	SignUpService signupService;
	
	
	@PostMapping(value="/CreateSignUp")
	public void createSignUp(@RequestBody SignUpBean signupBean)
	{
		signupService.createSignUp(signupBean);
	
	}
	@DeleteMapping(value="/DeleteSignUp/{id}")
	public void deleteSignUpbyId(@PathVariable("id") int id) {
		signupService.deleteSignUpById(id);
	}
	
	@PostMapping(value="GetSihnUpByID/{id}")
	public SignUpBean getSignUpbyId(@PathVariable("id") int id)
	{
		return signupService.getSignUpById(id);
	}
	
	@GetMapping(value="GetListOfSignUp")
	public List<SignUpBean> getListOfSignUpList()
	{
		return signupService.getListOfSignUpList();
	}


}
