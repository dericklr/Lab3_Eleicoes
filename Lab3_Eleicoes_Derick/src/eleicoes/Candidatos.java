package eleicoes;

public  class Candidatos {
	private String nome, partido;
	private int idade, numVotos;
	
	public Candidatos(String nome, String partido, int idade, int numVotos) {
		this.nome=nome;
		this.partido=partido;
		this.idade=idade;
		this.numVotos=numVotos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumVotos() {
		return numVotos;
	}

	public void setNumVotos(int numVotos) {
		this.numVotos = numVotos;
	}
	
	
}
