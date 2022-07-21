package com.assessmentjava.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livros implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titutlo;
	private String genero;

	@ManyToOne
	@JoinColumn(name = "editora_id")
	private Editora editora;

	public Livros() {

	}

	public Livros(Long id, String titutlo, String genero, Editora editora) {
		super();
		this.id = id;
		this.titutlo = titutlo;
		this.genero = genero;
		this.editora = editora;
	}

	public Livros(Long id, String titutlo, String genero) {
		super();
		this.id = id;
		this.titutlo = titutlo;
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitutlo() {
		return titutlo;
	}

	public void setTitutlo(String titutlo) {
		this.titutlo = titutlo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
