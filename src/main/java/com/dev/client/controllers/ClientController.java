package com.dev.client.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.client.entities.Client;
import com.dev.client.repositories.ClientRepository;

@RestController
@RequestMapping(value = "/users")
public class ClientController {
	
	@Autowired
	private ClientRepository repository;
	
	@GetMapping
	public List<Client> findAll() {
		return repository.findAll();
	}
	
	
	@GetMapping(value = "/{id}")
	public Client findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Client insert(@RequestBody Client client) {
		return repository.save(client);
	}
}
