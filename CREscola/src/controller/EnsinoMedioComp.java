package controller;

import model.Candidato;

public class EnsinoMedioComp implements IPontos {

	@Override
	public int calculaPontos(Candidato c) {
		int pontoAdicional = 0;
		if (c.isEnsinoMedioPublico() == true) {
			pontoAdicional = pontoAdicional + 5;
		}
		
		return c.getPontosProva() + pontoAdicional;  
	}

	@Override
	public void proximoCandidato(Candidato c) {
		c.setPontosProva(calculaPontos(c));
		
		EnsinoSuperiorComp esc = new EnsinoSuperiorComp();
		esc.proximoCandidato(c);
	}

}
