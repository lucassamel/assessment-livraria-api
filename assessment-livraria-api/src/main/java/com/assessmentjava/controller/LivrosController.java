package com.assessmentjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessmentjava.model.Livros;
import com.assessmentjava.ropository.LivroRepository;

@RestController
@RequestMapping(value = "/livros")
public class LivrosController {
	
	@Autowired
	private LivroRepository livroRepsitory;
	
	@GetMapping
	public ResponseEntity<List<Livros>> findAll() {
		List<Livros> list = livroRepsitory.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Livros> findById(@PathVariable Long id) {
		Livros livro = livroRepsitory.findById(id).get();
		return ResponseEntity.ok().body(livro);
	}
	
	@PostMapping
	public Livros livros(@RequestBody Livros livros) {
		return livroRepsitory.save(livros);
	}
}
