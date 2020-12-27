package com.talents.orange.clientApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talents.orange.clientApi.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
	Client findById(long id);

}
