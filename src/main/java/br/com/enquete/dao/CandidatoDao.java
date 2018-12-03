package br.com.enquete.dao;

import java.util.List;

import br.com.enquete.domain.Candidato;

public interface CandidatoDao {
	
	void salvar(Candidato candidato);
	
	void editar(Candidato candidato);
	
	void recebeVoto(Candidato candidato);
	
	void excluir(Long id);
	
	Candidato getId(Long id);
	
	List<Candidato> getTodos();

}
