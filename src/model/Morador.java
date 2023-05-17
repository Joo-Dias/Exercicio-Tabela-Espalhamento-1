package model;

public class Morador {
	
	public String apartamento;
	public String nome;
	public String modeloCarro;
	public String corCarro;
	public String placaCarro;
	
	
	@Override
	public int hashCode() {
		String andar = apartamento.substring(0, 1);
		char numeroAndar = andar.charAt(0);
		return numeroAndar;
	}
}