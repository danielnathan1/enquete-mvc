package br.com.enquete.domain;

public class Enquete {
	
	private int totalVotos;

	public Enquete() {
		super();
	}
	public Enquete(int totalVotos) {
		super();
		this.totalVotos = totalVotos;
	}

	public int getTotalVotos() {
		return totalVotos;
	}

	public void setTotalVotos(int totalVotos) {
		this.totalVotos = totalVotos;
	}

}
