package br.com.enquete.domain;

public class Candidato {
	
	private Long id;
	
	private String nome;
	
	private int numero;
	
	private int numeroDeVotos;
	
	public Candidato() {
		super();
	}
	
	public Candidato(Long id, String nome, int numero) {
		super();
		this.id = id;
		this.nome = nome;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroDeVotos() {
		return numeroDeVotos;
	}

	public void setNumeroDeVotos(int numeroDeVotos) {
		this.numeroDeVotos = numeroDeVotos;
	}
}
