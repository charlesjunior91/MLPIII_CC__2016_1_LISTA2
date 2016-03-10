package br.unipe.mlpIII.veiculo.ui;

import br.unipe.mlpIII.veiculo.modelo.Pessoa;
import br.unipe.mlpIII.veiculo.modelo.Veiculo_carga;
import br.unipe.mlpIII.veiculo.modelo.Veiculo_passeio;

public class Main {

	public static void main(String[] args) {
		Veiculo_carga veiculo = new Veiculo_carga();
		Veiculo_passeio veiculo2 = new Veiculo_passeio();
		Pessoa p1 = new Pessoa();

		p1.setNome("");
		p1.setCpf(10101);

		veiculo.setAno(2016);
		veiculo.setCapacidadeCarga(5000);
		veiculo.setKmInicial(0000);
		veiculo.setKmFinal(10000);
		veiculo.setChassi("CC58AS577A0S130MDAS0312L");
		veiculo.setMarca("EVOQUE");
		veiculo.setPlaca("CCI-2016");
		veiculo.setModelo("LAND ROVER");
		veiculo.setValorKmRodado(500);
		veiculo.setDono(p1);
		veiculo.calculalValorLocacao();

		System.out.println(veiculo);
		System.out.println(veiculo2);
	}
}