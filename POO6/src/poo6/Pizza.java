package poo6;

public class Pizza extends Pedido {
	
	private String sabor;

	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		if (sabor.length() > 0)
			this.sabor = sabor;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nSabor: ");
		builder.append(sabor);
		return builder.toString();
	}
}
