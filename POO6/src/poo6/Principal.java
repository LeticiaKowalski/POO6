package poo6;

public class Principal {

	public static void main(String[] args) {
		
		CargoEntregador ce1 = new CargoEntregador("BRA - 20E4");
		CargoEntregador ce2 = new CargoEntregador("BRA - 2039");
		
		Funcionario f = new Funcionario();
		f.setNome("Roberto");
		f.setRegistro(123);
		f.setDataAdmissao("01/02/2021");
		f.addPlaca(ce1);
		System.out.println(f);
		
		f.setNome("José");
		f.setRegistro(456);
		f.setDataAdmissao("20/01/2021");
		f.addPlaca(ce2);
		System.out.println(f);
		
		
		Pizza p = new Pizza();
		p.setNome("Maria");
		p.setNumTelefone("2020-2002");
		p.setRua("Avenida Oscar Barcelos");
		p.setNumComanda(14);
		p.setTamanho("P");
		p.setSabor("Marguerita");
		System.out.println(p);
		
		

	}


}
