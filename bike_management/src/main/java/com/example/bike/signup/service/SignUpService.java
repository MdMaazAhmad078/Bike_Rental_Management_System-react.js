package com.example.bike.signup.service;

import java.util.List;

import com.example.bike.signup.bean.SignUpBean;

public interface SignUpService {
	public void createSignUp(SignUpBean signupBean);
	public SignUpBean getSignUpById(int id);
	public List<SignUpBean> getListOfSignUpList();
	public void deleteSignUpById(int id);
	
}
