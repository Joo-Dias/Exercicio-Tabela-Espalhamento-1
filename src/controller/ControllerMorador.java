package controller;

import model.Morador;
import br.edu.fateczl.lista.listaObj.*;

public class ControllerMorador implements IMorador {

	Lista[] andaresAp;

	public ControllerMorador() {
		andaresAp = new Lista[1000];
		for (int i = 0; i < 10; i++) {
			andaresAp[i] = new Lista();
		}
	}

	@Override
	public void cadastrarMorador(Morador morador) throws Exception {
		int hash = morador.hashCode();
		Lista ap = andaresAp[hash];
		if(ap.isEmpty()) {
			ap.addFirst(morador);
		} else {
			ap.addLast(morador);
		}
	}
	
	@Override
	public Morador busca(Morador m) throws Exception {
		int hash = m.hashCode();
		Lista ap = andaresAp[hash];
		int tamanho = ap.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Morador m1 = (Morador) ap.get(i);
			if (m1.apartamento.equals(m.apartamento)) {
				return m1;
			}
		}
		return null;
	}

	@Override
	public void excluirMorador(Morador apartamento) throws Exception {
		int hash = apartamento.hashCode();
		Lista ap = andaresAp[hash];
		int tamanho = ap.size();
		for (int i = 0; i < tamanho; i++) {
			Morador m1 = (Morador) ap.get(i);
			if (m1.apartamento.equals(apartamento.apartamento)) {
				ap.remove(i);
				break;
			}
		}
		
	}

	@Override
	public void listarMorador(String andar) throws Exception {
		int hash = hashCode(andar);
		Lista ap = andaresAp[hash];
		int tamanho = ap.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Morador m = (Morador) ap.get(i);
			System.out.println(m.toString());
		}
	}

	private int hashCode(String a) {
		a = a.substring(0, 1).toLowerCase();
		char andar = a.charAt(0);
		return andar;
	}

}
