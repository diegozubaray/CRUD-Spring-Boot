package com.zubaray.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zubaray.app.models.personaModels;
import com.zubaray.app.repository.IPersona;

@Service
public class personaService implements IPersonaService {
	@Autowired
	private IPersona data;

	@Override
	public List<personaModels> listar() {
		return (List<personaModels>) data.findAll();
	}

	@Override
	public Optional<personaModels> listarId(int id) {

		return data.findById(id);
	}

	@Override
	public int save(personaModels p) {
		int res = 0;
		personaModels persona = data.save(p);
		if (!persona.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
