package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Librarybookentity;
import com.example.demo.Service.Librarybookservice;

@RestController
public class Librarybookcontroller {
	
	@Autowired
	private Librarybookservice bookservice;
	
	@PostMapping("/addbook")
	public Librarybookentity bookadd(@RequestBody Librarybookentity book) {
	Librarybookentity bookresult =bookservice.addbook(book);
	return bookresult;
 }
	@GetMapping("/getbook")
	public List<Librarybookentity> allbooks(){
		List<Librarybookentity> result=bookservice.allbooks();
		return result;
	}
	
	@DeleteMapping("/deletebook")
	public List<Librarybookentity>deletedresult(@PathVariable Integer id)
	{
		List<Librarybookentity>deleteresult=bookservice.deletebook(id);
		return deleteresult;

}
}