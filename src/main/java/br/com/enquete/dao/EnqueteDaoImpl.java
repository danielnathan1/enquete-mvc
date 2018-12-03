package br.com.enquete.dao;

import org.springframework.stereotype.Repository;

import br.com.enquete.domain.Enquete;

@Repository
public class EnqueteDaoImpl implements EnqueteDao {
	
	Enquete enquete = new Enquete(0);
	
	@Override
	public void recebeVoto(int voto) {
		enquete.setTotalVotos(enquete.getTotalVotos() + voto);
		
	}

	@Override
	public int getTotalVotos() {
		return enquete.getTotalVotos();
	}

}
