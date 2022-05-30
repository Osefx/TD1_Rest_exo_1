package com.inti.TD1_Rest_exo_1.repository;

import com.inti.TD1_Rest_exo_1.model.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

}
