package br.unipe.mlpIII.locadora.modelo;

public class Fita_infantil extends Fitas {

	public void setPreco(double preco) {
		this.setPreco(preco - ((preco * 40) / 100));
	}
}