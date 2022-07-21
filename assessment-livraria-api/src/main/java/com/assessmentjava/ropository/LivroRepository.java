package com.assessmentjava.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessmentjava.model.Livros;

@Repository
public interface LivroRepository extends JpaRepository<Livros, Long> {
	
	
}
