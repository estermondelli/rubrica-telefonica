package it.randstand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.randstand.model.Contatto;
import it.randstand.service.RubricaService;

@CrossOrigin("*")
@RestController
public class RubricaController {
	
	@Autowired
	RubricaService rubricaService;
	
	@RequestMapping("/aggiungi")
	@ResponseBody
	public List<Contatto> aggiungi(@RequestBody Contatto contatto){
		return rubricaService.aggiungiContatto(contatto);
	}
	@RequestMapping("/rimuovi")
	@ResponseBody
	public List<Contatto> rimuovi(@RequestBody Contatto contatto){
		return rubricaService.rimuoviContatto(contatto);
	}
	
	@RequestMapping("/mostra")
	@ResponseBody
	public List<Contatto> mostra(){
		return rubricaService.mostraContatti();
	}
	
	@RequestMapping("/conta")
	@ResponseBody
	public long conta(){
		return rubricaService.conta();
	}
}
