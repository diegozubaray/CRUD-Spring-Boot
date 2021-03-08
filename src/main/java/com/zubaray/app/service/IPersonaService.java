package com.zubaray.app.service;

import java.util.List;
import java.util.Optional;

import com.zubaray.app.models.personaModels;


public interface IPersonaService {
	
	public List<personaModels>listar();
	public Optional<personaModels>listarId(int id);
	public int save(personaModels p);
	public void delete(int id);

}
