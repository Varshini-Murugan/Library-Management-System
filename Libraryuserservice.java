package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Libraryuserentity;

public interface Libraryuserservice {
	
	public List<Libraryuserentity>findAll();
	
	public Libraryuserentity newuser(Libraryuserentity user);

	

}