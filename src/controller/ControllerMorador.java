package controller;

import model.MoradorID;
import br.edu.fateczl.lista.listaObj.*;

public class ControllerMorador implements IMorador {

	Lista[] vetPalavra;

	public ControllerMorador() {
		vetPalavra = new Lista[1000];
		for (int i = 0; i < 1000; i++) {
			vetPalavra[i] = new Lista();
		}
	}

	@Override
	public void adiciona(MoradorID p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetPalavra[hash];
		if (l.isEmpty()) {
			l.addFirst(p);
		} else {
			l.addLast(p);
		}

	}

	@Override
	public MoradorID busca(MoradorID p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(MoradorID p) throws Exception {
		// TODO Auto-generated method stub

	}

}
