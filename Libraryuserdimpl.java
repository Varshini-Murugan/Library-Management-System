package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Libraryuserentity;
import com.example.demo.Repository.Userrepo;

@Service
public class Libraryuserdimpl implements Libraryuserservice {
	
	@Autowired 
	private Userrepo userrepo;

	@Override
	public List<Libraryuserentity> findAll() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}
	@Override
	public Libraryuserentity newuser(Libraryuserentity user) {
	  return userrepo.save(user);
	}
	
	

}
