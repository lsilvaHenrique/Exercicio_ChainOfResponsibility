package controller;

import model.Candidato;

public class ExperienciaArea implements IPontos {

	@Override
	public int calculaPontos(Candidato c) {
		int pontoAdicional = 0;
		pontoAdicional = c.getAnosExperiencia() * 2; 
			return c.getPontosProva() + pontoAdicional;  
	}

	@Override
	public void proximoCandidato(Candidato c) {
		c.setPontosProva(calculaPontos(c));
	}

}
