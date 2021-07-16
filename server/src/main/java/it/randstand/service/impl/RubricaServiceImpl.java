package it.randstand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.randstand.model.Contatto;
import it.randstand.repository.RubricaRepository;
import it.randstand.service.RubricaService;

@Service
public class RubricaServiceImpl implements RubricaService {
	
	@Autowired
	RubricaRepository rubricaRepository;

	@Override
	public List<Contatto> aggiungiContatto(Contatto contatto) {
		if(contatto != null) {
			rubricaRepository.save(contatto);
		}
		return rubricaRepository.findAll();
	}

	@Override
	public List<Contatto> rimuoviContatto(Contatto contatto) {
		if(contatto != null) {
			rubricaRepository.delete(contatto);
		}
		return rubricaRepository.findAll();
	}

	@Override
	public List<Contatto> mostraContatti() {
		return rubricaRepository.findAll();
	}

	@Override
	public long conta() {
		return rubricaRepository.count();
	}
	
	

}
