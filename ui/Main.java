package br.unipe.mlpIII.data.ui;

import br.unipe.mlpIII.data.modelo.Data;

public class Main {
	public static void main(String[] args) {
		Data d = new Data();
		d.setDia(8);
		d.setMes(88);
		d.setAno(-1);
		System.out.println(d);
	}
}