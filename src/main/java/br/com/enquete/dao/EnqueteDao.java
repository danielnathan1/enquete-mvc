package br.com.enquete.dao;

public interface EnqueteDao {
	void recebeVoto(int voto);
	
	int getTotalVotos();
}
