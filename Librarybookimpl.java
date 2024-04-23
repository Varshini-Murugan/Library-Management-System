package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Librarybookentity;
import com.example.demo.Repository.Bookrepo;


@Service
public class Librarybookimpl implements Librarybookservice{
	
	@Autowired
	private Bookrepo bookrepo;

	@Override
	public Librarybookentity addbook(Librarybookentity book) {
		// TODO Auto-generated method stub
		return bookrepo.save(book);
	}

	@Override
	public List<Librarybookentity> allbooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

	@Override
	public Optional<Librarybookentity> onebook(Integer id) {
		// TODO Auto-generated method stub
		return bookrepo.findById(id);
	}

	@Override
	public List<Librarybookentity> deletebook(Integer id) {
		// TODO Auto-generated method stub
		 bookrepo.deleteById(id);
		 List<Librarybookentity> deletedata=bookrepo.findAll();
		 return deletedata;	
	}
}

	
	
	
	

