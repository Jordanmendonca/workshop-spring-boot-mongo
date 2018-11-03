package com.jordanmendonca.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordanmendonca.workshopmongo.domain.User;
import com.jordanmendonca.workshopmongo.dto.UserDTO;
import com.jordanmendonca.workshopmongo.repository.UserRepository;
import com.jordanmendonca.workshopmongo.services.exception.ObjectNotFoundException;


@Service // O Serviço Acesso o Repositorio 
public class UserService {    

	@Autowired
	private UserRepository repo; // Repositorio 
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
		
	}
	
}
