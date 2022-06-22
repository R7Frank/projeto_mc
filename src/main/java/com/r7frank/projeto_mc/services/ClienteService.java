package com.r7frank.projeto_mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r7frank.projeto_mc.domain.Cliente;
import com.r7frank.projeto_mc.repositories.ClienteRepository;
import com.r7frank.projeto_mc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				+ ", Tipo: " + Cliente.class.getName()));
	}
	
}
