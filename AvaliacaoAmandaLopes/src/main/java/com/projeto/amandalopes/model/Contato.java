package com.projeto.amandalopes.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq_contato", sequenceName = "seq_contato", allocationSize = 1, initialValue = 1)
public class Contato implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_contato")

	private Long id;
	private String nome;
	private String telefone;
	private String semail;
	private String adicionais;



}
