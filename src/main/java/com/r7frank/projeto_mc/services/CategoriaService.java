package com.r7frank.projeto_mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r7frank.projeto_mc.domain.Categoria;
import com.r7frank.projeto_mc.repositories.CategoriaRepository;
import com.r7frank.projeto_mc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				+ ", Tipo: " + Categoria.class.getName()));
	}
	
}
