package br.com.zup.edu.ligaqualidade.desafiobiblioteca;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoExemplar;

public class PedidoEmprestimo {

	public final int idLivro;
	public final int idUsuario;
	//vai ser usado para posterior consulta em cima da solução
	public final int idPedido;
	public final int tempo;
	public final TipoExemplar tipoExemplar;

	public PedidoEmprestimo(int idLivro, int idUsuario,int tempo,TipoExemplar tipoExemplar, int idPedido) {
		this.idLivro = idLivro;
		this.idUsuario = idUsuario;
		this.tempo = tempo;
		this.tipoExemplar = tipoExemplar;
		this.idPedido = idPedido;
	}

}
