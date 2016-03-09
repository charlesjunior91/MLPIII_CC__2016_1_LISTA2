package br.unipe.mlpIII.locadora.modelo;

public class Fitas {
	private String titulo;
	private double preco;
	private CategoriaFilme categoria;
	private Autor autor;

	public Fitas() {
	}

	public void Fita(String titulo, double preco, CategoriaFilme categoria, Autor autor) {
		this.titulo = titulo;
		this.preco = preco;
		this.categoria = categoria;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public CategoriaFilme getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaFilme categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor nomedoAutor, Autor autor) {
		this.autor = autor;
	}

	public String toString() {
		return "Fita [titulo=" + titulo + ", preco=" + preco + ", categoria=" + categoria + ", autor=" + autor + "]";
	}

}