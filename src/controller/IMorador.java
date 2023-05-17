package controller;

import model.Morador;

public interface IMorador {
	
	public void cadastrarMorador(Morador dado) throws Exception;
	public Morador busca(Morador dado) throws Exception;
	public void excluirMorador(Morador apartamento) throws Exception;
	public void listarMorador(String andar) throws Exception;
	
}
