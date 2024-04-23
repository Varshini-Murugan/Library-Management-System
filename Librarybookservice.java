package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Librarybookentity;

public interface Librarybookservice {
	
	public Librarybookentity addbook(Librarybookentity book);
	
    public List<Librarybookentity> allbooks();
    
    public Optional<Librarybookentity> onebook(Integer id);
    
  	public List<Librarybookentity> deletebook(Integer id);

  	


	
}
	
	