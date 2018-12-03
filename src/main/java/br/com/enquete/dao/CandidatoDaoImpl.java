package br.com.enquete.dao;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.enquete.domain.Candidato;

@Repository
public class CandidatoDaoImpl implements CandidatoDao{
	
	private static List<Candidato> candidatos;
	
	public CandidatoDaoImpl() {
		createCandidadosList();
	}
	
	private List<Candidato> createCandidadosList() {
		if (candidatos == null) {
			candidatos = new LinkedList<Candidato>();
			candidatos.add(new Candidato(System.currentTimeMillis() + 1L, "Daniel Nathan", 20));
			candidatos.add(new Candidato(System.currentTimeMillis() + 2L, "Joao pedro", 35));
			candidatos.add(new Candidato(System.currentTimeMillis() + 3L, "Bruna Maria", 40));
		}
		return candidatos;
	}
	
	
	public void salvar(Candidato candidato) {
		candidato.setId(System.currentTimeMillis());
		candidatos.add(candidato);

	}

	public void editar(Candidato candidato) {
		candidatos.stream()
		.filter((u) -> u.getId().equals(candidato.getId()))
		.forEach((u) -> {
			u.setNome(candidato.getNome());
			u.setNumero(candidato.getNumero());
		});
	}

	public Candidato getId(Long id) {
		return candidatos.stream()
				.filter((u) -> u.getId().equals(id))
				.collect(Collectors.toList()).get(0);
	}

	public List<Candidato> getTodos() {
		// 
		return candidatos;
	}

	public void excluir(Long id) {
		candidatos.removeIf((u) -> u.getId().equals(id));
	}
	
	public void recebeVoto(Candidato candidato) {
		candidatos.stream()
			.filter((u) -> u.getId().equals(candidato.getId()))
			.forEach((u) -> {
				u.setNumeroDeVotos(candidato.getNumeroDeVotos() + 1);
			});
	}

}
