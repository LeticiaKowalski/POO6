package poo6;

public class Cliente extends Pessoa {
	
	private String numTelefone;
	private String rua;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String numTelefone, String rua) {
		setNumTelefone(numTelefone);
		setRua(rua);
	}
	
	
	public String getNumTelefone() {
		return numTelefone;
	}
	
	public void setNumTelefone(String numTelefone) {
		if (numTelefone.length() > 0)
			this.numTelefone = numTelefone;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		if (rua.length() > 0)
			this.rua = rua;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n- Cliente -");
		builder.append(super.toString());
		builder.append("\nNúmero de telefone: ");
		builder.append(numTelefone);
		builder.append("\nRua: ");
		builder.append(rua);
		return builder.toString();
	}
	
}
