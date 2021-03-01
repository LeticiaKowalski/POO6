package poo6;

public class Pedido extends Cliente {
	
	private int numComanda;
	private String tamanho;
	
	
	public int getNumComanda() {
		return numComanda;
	}
	
	public void setNumComanda(int numComanda) {
		if (numComanda > 0)
			this.numComanda = numComanda;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		if (tamanho.length() > 0)
			this.tamanho = tamanho;
	}
	
	public void pedido(Pizza pizza) {
		System.out.println(pizza.toString());
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\n* Pedido * ");
		builder.append("\nNúmero da comanda: ");
		builder.append(numComanda);
		builder.append("\nTamanho da pizza: ");
		builder.append(tamanho);
		return builder.toString();
	}
	
}
