package br.com.zup.edu.ligaqualidade.desafiobiblioteca;

import java.time.LocalDate;

public class DadosDevolucao {

	public final int idEmprestimo;
	public final LocalDate diaDevolucao;

	public DadosDevolucao(int idEmprestimo,LocalDate diaDevolucao) {
		super();
		this.idEmprestimo = idEmprestimo;
		this.diaDevolucao = diaDevolucao;
	}

}
