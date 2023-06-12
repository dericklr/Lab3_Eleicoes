package eleicoes;

import java.util.Comparator;
import java.util.List;

public class Eleicoes {
	private List<Candidatos> candidatos;
	
	public Eleicoes(List<Candidatos> candidatos) {
		this.candidatos=candidatos;
	}
	
	public List<Candidatos> getCandidato(){
		return candidatos;
	}
		
	
	public Candidatos candidatoMaisJovem() {
		Comparator<Candidatos> comparator=Comparator.comparing(Candidatos::getIdade);
		return candidatos.stream().min(comparator).get();
		
	}
	
	public Candidatos candidatoMaisVelho() {
		Comparator<Candidatos> comparator=Comparator.comparing(Candidatos::getIdade);
		return candidatos.stream().max(comparator).get();
	}
	
	public Candidatos candidatoMaisVotado() {
		Comparator<Candidatos> comparator=Comparator.comparing(Candidatos::getNumVotos);
		return candidatos.stream().max(comparator).get();
	}
	
	public Candidatos candidatoMenosVotado() {
		Comparator<Candidatos> comparator=Comparator.comparing(Candidatos::getNumVotos);
		return candidatos.stream().min(comparator).get();
		
	}
	
	  public int totalVotos() {
		int totalVotos= candidatos.stream().mapToInt(Candidatos::getNumVotos).sum();
		return totalVotos;
	}
	
	public double mediaVotos() {
		double media=candidatos.stream().mapToInt(Candidatos::getNumVotos).average().orElse(0);
		return media;
		
	}
	
	
}
