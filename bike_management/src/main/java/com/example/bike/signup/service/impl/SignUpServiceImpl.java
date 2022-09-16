package com.example.bike.signup.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bike.signup.bean.SignUpBean;
import com.example.bike.signup.entity.SignUpEntity;
import com.example.bike.signup.repository.SignUpRepository;
import com.example.bike.signup.service.SignUpService;
@Service
public class SignUpServiceImpl implements SignUpService{

	@Autowired
	private SignUpRepository signupRepository;
	
	
	@Override
	public void createSignUp(SignUpBean  signupBean)
	{
		SignUpEntity  signupEntity = new SignUpEntity();
		if( signupBean != null)
		BeanUtils.copyProperties( signupBean,  signupEntity);
		signupRepository.save( signupEntity);

		
		
	}
	
	@Override
	public void deleteSignUpById(int id)
	{
		if(id!=0)
		{
			signupRepository.deleteById(id);
		}
	}

	
	
	@Override
	public SignUpBean getSignUpById(int id) {
		SignUpBean  signupBean = new SignUpBean();
		Optional<SignUpEntity>  signupEntity =  signupRepository.findById(id);
	
		if( signupEntity != null && !"".equals( signupEntity))
		BeanUtils.copyProperties( signupEntity.get(),  signupBean);
		return  signupBean;
	}
	
	@Override
	public List<SignUpBean> getListOfSignUpList() {
		List<SignUpEntity> listOfsignupEntity = (List<SignUpEntity>)  signupRepository.findAll();
		List<SignUpBean> listOfsignupBean = null;
		if(listOfsignupEntity!=null && !listOfsignupEntity.isEmpty()) {
			listOfsignupBean = new ArrayList();
			for(SignUpEntity  signupEntity :listOfsignupEntity) {
				SignUpBean  signupBean = new SignUpBean();
				BeanUtils.copyProperties( signupEntity,  signupBean);
				listOfsignupBean.add( signupBean);
			}
		}
		return listOfsignupBean;
	}



}
