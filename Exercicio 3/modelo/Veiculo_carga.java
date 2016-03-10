package br.unipe.mlpIII.veiculo.modelo;

public class Veiculo_carga extends Veiculo {
	private double capacidadeCarga;

	public Veiculo_carga() {
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public String toString() {
		return "VeiculoDeCarga [" + super.toString() + ", capacidadeCarga=" + capacidadeCarga + "]";
	}

}