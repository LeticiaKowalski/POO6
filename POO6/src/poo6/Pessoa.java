package poo6;

public class Pessoa {
	
	private String nome;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nNome: ");
		builder.append(nome);
		return builder.toString();
	}
}
