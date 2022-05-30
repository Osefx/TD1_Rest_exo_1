package com.inti.TD1_Rest_exo_1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Etudiant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private @NonNull String nom;
	@Column(nullable = false)
	private @NonNull String prenom;
	private String email;
	private String telephone;
	private double anneeEtude;
	
	public Etudiant(@NonNull String nom, @NonNull String prenom, String email, String telephone, double anneeEtude) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.anneeEtude = anneeEtude;
	}
	
	
}

