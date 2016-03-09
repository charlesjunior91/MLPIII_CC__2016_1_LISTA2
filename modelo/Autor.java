package br.unipe.mlpIII.locadora.modelo;

public class Autor extends Fitas {
	private String nomedoAutor;

	public Autor() {
	}

	public Autor(String nomedoAutor) {
		this.nomedoAutor = nomedoAutor;
	}

	public String getNomedoAutor() {
		return nomedoAutor;
	}

	public void setNomedoAutor(String nomedoAutor) {
		this.nomedoAutor = nomedoAutor;
	}

	public String toString() {
		return "Autor [nomedoAutor=" + nomedoAutor + "]";
	}
}