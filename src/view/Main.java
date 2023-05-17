package view;

import controller.ControllerMorador;
import model.Morador;

public class Main {

	public static void main(String[]args) {
		Morador m1 = new Morador();
		m1.apartamento = "101";
		m1.nome = "João";
		m1.modeloCarro = "Ferrari";
		m1.corCarro = "Vermelho";
		m1.placaCarro = "123";
		
		Morador m2 = new Morador();
		m2.apartamento = "201";
		m2.nome = "Fulano";
		m2.modeloCarro = "Audi";
		m2.corCarro = "Preto";
		m2.placaCarro = "321";
		
		Morador m3 = new Morador();
		m3.apartamento = "301";
		m3.nome = "Dicrano";
		m3.modeloCarro = "BMW";
		m3.corCarro = "Azul";
		m3.placaCarro = "456";
		
		ControllerMorador ContM = new ControllerMorador();
		try {
			ContM.cadastrarMorador(m1);
			ContM.cadastrarMorador(m2);
			ContM.cadastrarMorador(m3);
			
			Morador m = new Morador();
			m.apartamento = "101";
			m = ContM.busca(m);
			System.out.println(m);
			System.out.println("=====================================");
			
			ContM.listarMorador("1");
			ContM.listarMorador("2");
			
			ContM.excluirMorador(m1);
			ContM.listarMorador("1");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
