package com.assessmentjava;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assessmentjava.model.Editora;
import com.assessmentjava.model.Livros;
import com.assessmentjava.ropository.EditoraRepository;
import com.assessmentjava.ropository.LivroRepository;

@SpringBootApplication
public class AssessmentLivrariaApiApplication implements CommandLineRunner {

	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private EditoraRepository editoraReository;
	
	public static void main(String[] args) {
		SpringApplication.run(AssessmentLivrariaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Editora editora1 = new Editora(null,"Editora 1");
		Editora editora2 = new Editora(null,"Editora 2");
		
		Livros livro1 = new Livros(null,"titulo1","genero1",editora1);
		Livros livro2 = new Livros(null,"titulo2","genero2",editora2);
		Livros livro3 = new Livros(null,"titulo3","genero3",editora1);
		Livros livro4 = new Livros(null,"titulo4","genero4",editora2);
		
		editora1.getLivros().addAll(Arrays.asList(livro1,livro3));
		editora2.getLivros().addAll(Arrays.asList(livro2,livro4));
		
		editoraReository.save(editora1);
		editoraReository.save(editora2);
		
		livroRepository.save(livro1);
		livroRepository.save(livro2);
		livroRepository.save(livro3);
		livroRepository.save(livro4);
		
		
		
	}

}
