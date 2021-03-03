package br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto;

import java.math.BigDecimal;

public class DadosLivro {

	public final String titulo;
	public final BigDecimal valor;
	public final int id;

	public DadosLivro(String titulo, BigDecimal valor, int id) {
		this.titulo = titulo;
		this.valor = valor;
		this.id = id;
	}

}
