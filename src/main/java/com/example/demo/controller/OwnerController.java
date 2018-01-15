package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.UserDao;
import com.example.demo.model.OwnerInfo;
import com.example.demo.repository.OwnerInfoRepository;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	
	@Autowired
	private OwnerInfoRepository ownerInfoRepository;
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/show")
	public @ResponseBody List<OwnerInfo> getAllOwnerInfo(){
		 List<OwnerInfo> ownerInfoList = new ArrayList<OwnerInfo>();
		 //ownerInfoList = (List<OwnerInfo>) ownerInfoRepository.findAll();
		 ownerInfoList = userDao.findAllUser();
		 for(OwnerInfo ownerInfo : ownerInfoList) {
			 System.out.println("id is "+ownerInfo.getId()+", owner is "+ ownerInfo.getOwner());
		 }
		 return ownerInfoList;
		
	}
	
}
