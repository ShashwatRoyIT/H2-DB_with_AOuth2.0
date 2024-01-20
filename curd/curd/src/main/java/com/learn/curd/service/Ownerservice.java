package com.learn.curd.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.curd.model.Owner;
import com.learn.curd.repository.Ownerrepository;

@Service
public class Ownerservice {
	
	@Autowired
	Ownerrepository ownerrepo;

	public boolean add(Owner owner) {

		try {
			ownerrepo.save(owner);
			System.out.println("save tho hua  "+ owner.getId()+" "+owner.getOwnerAddress()+ " "+ owner.getOwnerName());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public ArrayList<Owner> getOwner() {

		try {
			return (ArrayList<Owner>)ownerrepo.findAll();
			 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
