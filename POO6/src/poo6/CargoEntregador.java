package poo6;

public class CargoEntregador {
	
	private String numPlacaMoto;
	
	
	public CargoEntregador() {
		
	}
	
	public CargoEntregador(String numPlacaMoto) {
		setNumPlacaMoto(numPlacaMoto);
	}
	
	
	public String getNumPlacaMoto() {
		return numPlacaMoto;
	}

	public void setNumPlacaMoto(String numPlacaMoto) {
		if (numPlacaMoto.length() > 0)
			this.numPlacaMoto = numPlacaMoto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nPlaca da moto: ");
		builder.append(numPlacaMoto);
		return builder.toString();
	}
	
}
