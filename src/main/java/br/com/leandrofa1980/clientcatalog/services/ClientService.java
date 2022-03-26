package br.com.leandrofa1980.clientcatalog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandrofa1980.clientcatalog.dto.ClientDTO;
import br.com.leandrofa1980.clientcatalog.entities.Client;
import br.com.leandrofa1980.clientcatalog.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		
		return list.stream()
				.map(x -> new ClientDTO(x))
				.collect(Collectors.toList());		
	}
	
}
