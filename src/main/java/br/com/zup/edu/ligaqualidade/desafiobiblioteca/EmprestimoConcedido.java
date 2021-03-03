package br.com.zup.edu.ligaqualidade.desafiobiblioteca;

import java.time.Instant;
import java.time.LocalDate;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosExemplar;

public class EmprestimoConcedido {

	// id do emprestimo referenciado no PedidoEmprestimo
	private final int idPedidoEmprestimo;
	private final int idExemplar;
	// data em função do tempo de emprestimo
	private final LocalDate dataPrevistaDevolucao;
	// instante da devolução
	private Instant momentoDevolucao;

	/**
	 * 
	 * @param idPedidoEmprestimo id referente ao {@link PedidoEmprestimo}
	 * @param idExemplar id referente ao {@link DadosExemplar}
	 * @param dataPrevistaDevolucao data prevista para devolução em função do número de dias
	 */
	public EmprestimoConcedido(int idPedidoEmprestimo,int idExemplar ,LocalDate dataPrevistaDevolucao) {
		super();
		this.idPedidoEmprestimo = idPedidoEmprestimo;
		this.idExemplar = idExemplar;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	
	public void registraDevolucao() {
		this.momentoDevolucao = Instant.now();
	}

}
