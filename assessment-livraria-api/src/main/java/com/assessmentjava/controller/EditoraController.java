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

import com.assessmentjava.model.Editora;
import com.assessmentjava.ropository.EditoraRepository;

@RestController
@RequestMapping(value = "/editora")
public class EditoraController {
	
	@Autowired
	private EditoraRepository editoraRepsitory;
	
	@GetMapping
	public ResponseEntity<List<Editora>> findAll() {
		List<Editora> list = editoraRepsitory.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Editora> findById(@PathVariable Long id) {
		Editora editora = editoraRepsitory.findById(id).get();
		return ResponseEntity.ok().body(editora);
	}
	
	@PostMapping
	public Editora editora(@RequestBody Editora editora) {
		return editoraRepsitory.save(editora);
	}
}
