package model;

public class MoradorID {
	
	public String nmrApt;
	public String nomeMorador;
	public String modelo;
	public String cor;
	public int nmrPlaca;
	
	@Override
	public String toString() {
		return nmrApt + nomeMorador + modelo + cor + nmrPlaca;
	}

	@Override
	public int hashCode() {
		String l = nmrApt.substring(0,1).toLowerCase();
		char numero = l.charAt(0);
		int nmr = numero;
		return nmr;
	}

}