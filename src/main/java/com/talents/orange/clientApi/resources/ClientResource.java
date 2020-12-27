package com.talents.orange.clientApi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talents.orange.clientApi.models.Client;
import com.talents.orange.clientApi.repository.ClientRepository;


@RestController
@RequestMapping(value="/api")
public class ClientResource {
	
	@Autowired
	ClientRepository clientRepository;
	
	@GetMapping("/clients")
	public List<Client> listaClients(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/clients/{id}")
	public Client listClientUnico(@PathVariable(value="id") long id){
		return clientRepository.findById(id);
	}
	
	@PostMapping("/client")
	public Client salvaClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
}
