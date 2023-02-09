package com.example.demo.dao;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Projet;

public interface UtilisateurDao extends MongoRepository<Projet,String>{
	
	
    //public List<Projet> findByRef(String refHotel);


}
