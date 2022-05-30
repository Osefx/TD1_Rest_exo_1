package com.inti.TD1_Rest_exo_1.controller;

import java.util.List;

import com.inti.TD1_Rest_exo_1.model.Etudiant;
import com.inti.TD1_Rest_exo_1.repository.EtudiantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantController 
{

	@Autowired
	EtudiantRepository etudiantRepository;
	
	@GetMapping("/test")
	public String test()
	{
		return "Hello World !!!!!";
	}
	
	@GetMapping("/afficherEtudiant")
	public ResponseEntity<List<Etudiant>> getAllEtudiant()
	{
		return new ResponseEntity<List<Etudiant>>(etudiantRepository.findAll(), HttpStatus.OK);
	}
	
//	@PostMapping("/saveEtudiant")
//	public String saveEtudiant()
//	{
//		Etudiant e = new Etudiant("Cinci", "Hasan", "mail@mail.fr", "566985", 5);
//		etudiantRepository.save(e);
//		return "etudiant enregistré";
//	}
	
	@PostMapping("/saveEtudiantAutreManiere")
	public ResponseEntity<Etudiant> saveEtudiant1(@RequestBody Etudiant e)
	{
		
		return new ResponseEntity<Etudiant>(etudiantRepository.save(e), HttpStatus.CREATED);
	}
	
}
