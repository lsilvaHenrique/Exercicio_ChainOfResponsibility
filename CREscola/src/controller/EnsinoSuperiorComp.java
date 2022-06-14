package controller;

import model.Candidato;

public class EnsinoSuperiorComp implements IPontos {

	@Override
	public int calculaPontos(Candidato c) {
		int pontoAdicional = 0;
		if (c.isEnsinoMedioPublico() == true) {
			pontoAdicional = pontoAdicional + 10;
		}
		
		return c.getPontosProva() + pontoAdicional;  
	}

	@Override
	public void proximoCandidato(Candidato c) {
		c.setPontosProva(calculaPontos(c));
		
		RegistroEntC rec = new RegistroEntC();
		rec.proximoCandidato(c);
	}

}
