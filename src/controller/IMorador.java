package controller;

import model.MoradorID;

public interface IMorador {
	
	public void adiciona(MoradorID dado) throws Exception;
	public MoradorID busca(MoradorID dado) throws Exception;
	public void remove(MoradorID dado) throws Exception;
	// public void lista(String letra) throws Exception;
	
}
