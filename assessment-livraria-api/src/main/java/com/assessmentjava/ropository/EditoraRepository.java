package com.assessmentjava.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessmentjava.model.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {
	
	
}
