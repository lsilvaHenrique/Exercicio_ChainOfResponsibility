package controller;

import model.Candidato;

public class RegistroEntC implements IPontos {

	@Override
	public int calculaPontos(Candidato c) {
		int pontoAdicional = 0;
		pontoAdicional = c.getAnosRegistroEntidadeClasse(); 
		return c.getPontosProva() + pontoAdicional;  
	}

	@Override
	public void proximoCandidato(Candidato c) {
		c.setPontosProva(calculaPontos(c));
		
		ExperienciaArea ea = new ExperienciaArea();
		ea.proximoCandidato(c);
	}

}

