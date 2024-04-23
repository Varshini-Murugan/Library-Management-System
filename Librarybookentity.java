package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Librarybookentity{
 

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String tittle;
	private String author;
	private boolean borrowed;
	@ManyToOne
	@JoinColumn(name="user_id")
	private Libraryuserentity borrowedBy;
	
	public Libraryuserentity getBorrowedBy() {
		return borrowedBy;
	}
	public void setBorrowedBy(Libraryuserentity borrowedBy) {
		this.borrowedBy = borrowedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	
}
