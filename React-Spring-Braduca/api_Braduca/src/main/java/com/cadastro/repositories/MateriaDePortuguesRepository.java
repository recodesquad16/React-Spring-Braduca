package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.model.entity.MateriaDePortugues;

@Repository
public interface MateriaDePortuguesRepository extends JpaRepository<MateriaDePortugues, Long> {

	
	
}
