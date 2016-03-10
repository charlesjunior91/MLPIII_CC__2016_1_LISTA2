package br.unipe.mlpIII.veiculo.modelo;

public class Veiculo_passeio extends Veiculo {
	private boolean possuiAr;
	private int quantiPortas;

	public void VeiculoDePasseio() {
	}

	public boolean isPossuiArC() {
		return possuiAr;
	}

	public void setPossuiArC(boolean possuiAr) {
		this.possuiAr = possuiAr;
	}

	public int getQuantPortas() {
		return quantiPortas;
	}

	public void setQuantPortas(int quantiPortas) {
		this.quantiPortas = quantiPortas;
	}

	public String toString() {
		return "VeiculoDePasseio [" + super.toString() + ", possuiAr=" + possuiAr + ", quantidadePortas=" + quantiPortas
				+ "]";
	}

}