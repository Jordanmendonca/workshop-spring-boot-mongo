package com.jordanmendonca.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordanmendonca.workshopmongo.domain.User;
import com.jordanmendonca.workshopmongo.repository.UserRepository;

@Service // O Serviço Acesso o Repositorio 
public class UserService {    

	@Autowired
	private UserRepository repo; // Repositorio 
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
}
