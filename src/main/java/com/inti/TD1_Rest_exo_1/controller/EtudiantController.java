package com.inti.TD1_Rest_exo_1.controller;

import java.util.List;

import com.inti.TD1_Rest_exo_1.model.Etudiant;
import com.inti.TD1_Rest_exo_1.repository.EtudiantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
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
	public List<Etudiant> getAllEtudiant()
	{
		return etudiantRepository.findAll();
	}
	
	@PostMapping("/saveEtudiant")
	public String saveEtudiant()
	{
		Etudiant e = new Etudiant("Cinci", "Hasan", "mail@mail.fr", "566985", 5);
		etudiantRepository.save(e);
		return "etudiant enregistré";
	}
}
