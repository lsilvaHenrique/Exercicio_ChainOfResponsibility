package view;

import controller.EnsinoMedioComp;
import model.Candidato;

public class Principal {

	public static void main(String[] args) {
		Candidato c = new Candidato();
		c.setId(1);
		c.setNome("fulano");
		c.setPontosProva(70);
		c.setEnsinoMedioPublico(true);
		c.setEnsinoSuperiorCompleto(true);
		c.setAnosRegistroEntidadeClasse(5);
		c.setAnosExperiencia(5);
		
		EnsinoMedioComp emc = new EnsinoMedioComp();
		emc.proximoCandidato(c);
		
		System.out.println(c);
		
	}

}
