package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Libraryuserentity;

public interface  Userrepo extends JpaRepository<Libraryuserentity,Integer>{

}
