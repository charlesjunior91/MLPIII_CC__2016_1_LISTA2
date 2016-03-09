package br.unipe.mlpIII.locadora.ui;

import br.unipe.mlpIII.locadora.modelo.Autor;
import br.unipe.mlpIII.locadora.modelo.CategoriaFilme;
import br.unipe.mlpIII.locadora.modelo.Fita_infantil;
import br.unipe.mlpIII.locadora.modelo.Fita_lancamento;

public class Main {

	public static void main(String[] args) {
		Fita_infantil filmeInfantil = new Fita_infantil();
		Fita_lancamento filmeLancamento = new Fita_lancamento();
		Autor autorDeTodos = new Autor("Camila");

		filmeInfantil.setTitulo("Filha de Deus");
		filmeInfantil.setAutor(autorDeTodos, autorDeTodos);
		filmeInfantil.setCategoria(CategoriaFilme.Drama);
		filmeInfantil.setPreco(25);

		filmeLancamento.setTitulo("Furia de titãs");
		filmeLancamento.setAutor(autorDeTodos, autorDeTodos);
		filmeLancamento.setCategoria(CategoriaFilme.Acao);
		filmeLancamento.setPreco(50);

		System.out.println(filmeInfantil);
		System.out.println(filmeLancamento);
	}

}