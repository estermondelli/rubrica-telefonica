package it.randstand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.randstand.model.Contatto;

@Repository
public interface RubricaRepository extends JpaRepository<Contatto, Long>{
	
}
