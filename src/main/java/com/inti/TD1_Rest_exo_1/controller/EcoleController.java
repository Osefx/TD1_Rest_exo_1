package com.inti.TD1_Rest_exo_1.controller;

import java.util.List;

import com.inti.TD1_Rest_exo_1.model.Ecole;
import com.inti.TD1_Rest_exo_1.repository.EcoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcoleController 
{

	@Autowired
	EcoleRepository ecoleRepository;
	
	@GetMapping("/afficherEcole")
	public ResponseEntity<List<Ecole>> getAllEcole()
	{
		return new ResponseEntity<List<Ecole>>(ecoleRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/saveEcoleAutreManiere")
	public ResponseEntity<Ecole> saveEcole1(@RequestBody Ecole e)
	{
		
		return new ResponseEntity<Ecole>(ecoleRepository.save(e), HttpStatus.CREATED);
	}
	
	@PutMapping("/updateEcole/{id}")
	public String updateEcole(@RequestBody Ecole e, @PathVariable int id)
	{
		ecoleRepository.getReferenceById(id);
		
		ecoleRepository.save(e);
		return "ecole mis à jour";
	}
	
	@DeleteMapping("/deleteEcole")
	public String deleteEcole(@RequestParam("id") int id)
	{
		ecoleRepository.deleteById(id);
		return "Ecole supprimé";
	}
}
