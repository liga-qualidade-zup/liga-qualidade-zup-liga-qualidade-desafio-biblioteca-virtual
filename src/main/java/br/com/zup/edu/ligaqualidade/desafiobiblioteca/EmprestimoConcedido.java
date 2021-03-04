package br.com.zup.edu.ligaqualidade.desafiobiblioteca;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Optional;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosUsuario;

public class EmprestimoConcedido {

	// id do emprestimo referenciado no PedidoEmprestimo
	public final int idUsuario;
	public final int idExemplar;
	// data em função do tempo de emprestimo
	public final LocalDate dataPrevistaDevolucao;
	// instante da devolução
	private Instant momentoDevolucao;

	/**
	 * 
	 * @param idUsuario id referente ao {@link DadosUsuario}
	 * @param idExemplar id referente ao {@link DadosExemplar}
	 * @param dataPrevistaDevolucao data prevista para devolução em função do número de dias
	 */
	public EmprestimoConcedido(int idUsuario,int idExemplar ,LocalDate dataPrevistaDevolucao) {
		super();
		this.idUsuario = idUsuario;
		this.idExemplar = idExemplar;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	
	public void registraDevolucao() {
		this.momentoDevolucao = Instant.now();
	}
	
	
	public Optional<Instant> getMomentoDevolucao(){
		return Optional.ofNullable(this.momentoDevolucao);
	}


}
