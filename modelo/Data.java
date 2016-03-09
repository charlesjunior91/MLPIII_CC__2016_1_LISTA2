package br.unipe.mlpIII.data.modelo;

import java.util.Calendar;

public class Data {
	private static int dia;
	private static int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {

		if ((ano & 3) == 0 && ((ano % 25) != 0 || (ano & 15) == 0)) {
			if (((mes == 2) && (dia > 29)) || ((mes >= 1 && mes <= 12) && (dia > 31))) {
				System.err.println("Data inválida.");
			} else {
			}

		} else {
			System.err.println("Data inválida.");
		}
	}

	public Data() {
		this(getDia(), getMes(), Calendar.YEAR);
	}

	public String toString() {
		return getDia() + "/" + getMes() + "/" + getAno();
	}

	public static int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		Data.dia = dia;
	}

	public static int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		Data.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
