package com.learn.curd.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.curd.model.Owner;
import com.learn.curd.service.Ownerservice;

@RestController
public class Ownercontroller {
	
	@Autowired
	Ownerservice ownerservice;
	
	@GetMapping("/")
	public String home(){
		
//		System.out.println("came here"+ owner.getOwnerAddress()+" "+ owner.getOwnerName());
		
		return "Hello Home";				
		
	}
	
	
	@PostMapping("/postowners")
	public boolean addOwner(@RequestBody Owner owner){
		
//		System.out.println("came here"+ owner.getOwnerAddress()+" "+ owner.getOwnerName());
		
		return ownerservice.add(owner);				
		
	}
	
	@GetMapping("/getowners")
	public ArrayList<Owner> getOwner(){
		
//		System.out.println("came here"+ owner.getOwnerAddress()+" "+ owner.getOwnerName());
		
		return ownerservice.getOwner();				
		
	}			
	 
}
