package br.unipe.mlpIII.locadora.modelo;

public class Fita_lancamento extends Fitas {

	public void setPreco(double preco) {
		this.setPreco(preco + ((preco * 20) / 100));
	}
}