package com.zubaray.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.zubaray.app.models.personaModels;

@Repository
public interface IPersona extends CrudRepository<personaModels, Integer> {

}
