package Teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import eleicoes.Eleicoes;
import eleicoes.Candidatos;

import java.util.List;
import java.util.ArrayList;


class EleicaoTeste {
	static List<Candidatos> candidatos;
	static Eleicoes e;
	static Candidatos c1,c2,c3;
	
	@BeforeAll
	 static void setup() {
		candidatos=new ArrayList<>();
		Candidatos c1= new Candidatos("Candidato 1", "Partido A",35,1500);
		Candidatos c2= new Candidatos("Candidato 2", "Partido B",71,1700);
		Candidatos c3= new Candidatos("Candidato 3", "Partido C",52,1200);
		e= new Eleicoes(candidatos);
		candidatos.add(c1);
		candidatos.add(c2);
		candidatos.add(c3);

		
	}

	@Test
	 void testCandidatoMaisJovem() {
		assertEquals(candidatos.get(0), e.candidatoMaisJovem());
	
}
	@Test
	 void testCandidatoMaisVelho() {
		assertEquals(candidatos.get(1), e.candidatoMaisVelho());
	
}
	@Test
	 void testCandidatoMaisVotado() {
		assertEquals(candidatos.get(1), e.candidatoMaisVotado());
	
}
	@Test
	 void testCandidatoMenosVotado() {
		assertEquals(candidatos.get(2), e.candidatoMenosVotado());
	
}
	@Test
	public void testTotalVotos() {
		assertEquals(4400, e.totalVotos());
	}
	
	@Test
	 void testMediaVotos() {
		assertEquals(1466.6666666666667,e.mediaVotos());
	}
}