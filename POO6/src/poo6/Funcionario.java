package poo6;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
	
	private int registro;
	private String dataAdmissao;
	
	List<CargoEntregador> lentregador = new ArrayList<CargoEntregador>();
	
	
	public boolean addPlaca(CargoEntregador entregador) {
		return lentregador.add(entregador);
	}
	
	
	public int getRegistro() {
		return registro;
	}
	
	public void setRegistro(int registro) {
		if (registro > 0)
			this.registro = registro;
	}
	
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(String dataAdmissao) {
		if (dataAdmissao.length() > 0)
			this.dataAdmissao = dataAdmissao;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n- Funcionário -");
		builder.append(super.toString());
		builder.append("\nRegistro: ");
		builder.append(registro);
		builder.append("\nData de admissão: ");
		builder.append(dataAdmissao);
		for (CargoEntregador entregador : lentregador) {
			builder.append(entregador.toString());
		}
		return builder.toString();
	}
	
}
