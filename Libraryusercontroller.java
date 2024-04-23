package com.example.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Libraryuserentity;
import com.example.demo.Service.Libraryuserservice;

@RestController
public class Libraryusercontroller {
	
	@Autowired
	private Libraryuserservice userservice; 
	
	@PostMapping("/newuser")
	public Libraryuserentity adduser(@RequestBody Libraryuserentity user){
		Libraryuserentity newuser=userservice.newuser(user);
		return newuser;
	}
	
	@GetMapping("/getuser")
	public Libraryuserentity getuser() {
		return (Libraryuserentity) userservice.findAll();
	}
}