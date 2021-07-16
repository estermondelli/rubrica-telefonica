package it.randstand.service;

import java.util.List;

import it.randstand.model.Contatto;

public interface RubricaService {
	
	 List<Contatto>aggiungiContatto(Contatto contatto);
	 List<Contatto>rimuoviContatto(Contatto contatto);
	 List<Contatto>mostraContatti();
	 long conta();
	 
}
