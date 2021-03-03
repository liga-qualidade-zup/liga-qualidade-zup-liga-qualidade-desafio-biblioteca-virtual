package br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto;

public class DadosExemplar {

	public final TipoExemplar tipo;
	public final int idLivro;
	public final int idExemplar;

	public DadosExemplar(TipoExemplar tipo, int idLivro, int idExemplar) {
		this.tipo = tipo;
		this.idLivro = idLivro;
		this.idExemplar = idExemplar;
	}

}
