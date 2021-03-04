package br.com.zup.edu.ligaqualidade.desafiobiblioteca.modifique;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosDevolucao;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosEmprestimo;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.EmprestimoConcedido;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosLivro;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosUsuario;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoUsuario;

public class Cenario6 {

	int idLivro1 = 1;
	DadosLivro dadosLivro1 = new DadosLivro("titulo1", BigDecimal.TEN,
			idLivro1);

	DadosExemplar dadosExemplar1Livro1 = new DadosExemplar(
			TipoExemplar.RESTRITO, idLivro1, 1);
	DadosExemplar dadosExemplar2Livro1 = new DadosExemplar(TipoExemplar.LIVRE,
			idLivro1, 2);

	int idLivro2 = 2;
	DadosLivro dadosLivro2 = new DadosLivro("titulo2", BigDecimal.TEN,
			idLivro2);

	DadosExemplar dadosExemplar1Livro2 = new DadosExemplar(
			TipoExemplar.RESTRITO, idLivro2, 7);
	DadosExemplar dadosExemplar2Livro2 = new DadosExemplar(TipoExemplar.LIVRE,
			idLivro2, 8);

	int idLivro3 = 3;
	DadosLivro dadosLivro3 = new DadosLivro("titulo3", BigDecimal.TEN,
			idLivro3);

	DadosExemplar dadosExemplar1Livro3 = new DadosExemplar(
			TipoExemplar.RESTRITO, idLivro3, 13);
	DadosExemplar dadosExemplar2Livro3 = new DadosExemplar(TipoExemplar.LIVRE,
			idLivro3, 14);

	int idLivro4 = 4;
	DadosLivro dadosLivro4 = new DadosLivro("titulo4", BigDecimal.TEN,
			idLivro4);

	DadosExemplar dadosExemplar1Livro4 = new DadosExemplar(
			TipoExemplar.RESTRITO, idLivro4, 15);
	DadosExemplar dadosExemplar2Livro4 = new DadosExemplar(TipoExemplar.LIVRE,
			idLivro4, 16);

	int idLivro5 = 5;
	DadosLivro dadosLivro5 = new DadosLivro("titulo5", BigDecimal.TEN,
			idLivro5);

	DadosExemplar dadosExemplar1Livro5 = new DadosExemplar(
			TipoExemplar.RESTRITO, idLivro5, 17);
	DadosExemplar dadosExemplar2Livro5 = new DadosExemplar(TipoExemplar.LIVRE,
			idLivro5, 18);

	int idLivro6 = 6;
	DadosLivro dadosLivro6 = new DadosLivro("titulo6", BigDecimal.TEN,
			idLivro6);

	DadosExemplar dadosExemplar1Livro6 = new DadosExemplar(
			TipoExemplar.RESTRITO, idLivro6, 19);
	DadosExemplar dadosExemplar2Livro6 = new DadosExemplar(TipoExemplar.LIVRE,
			idLivro6, 20);

	DadosUsuario usuario1 = new DadosUsuario(TipoUsuario.PADRAO, 1);
	DadosUsuario usuario2 = new DadosUsuario(TipoUsuario.PESQUISADOR, 2);

	@Test
	@DisplayName("Usuario padrao pede 1 exemplar livre para 10 dias. "
			+ " Onze dias se passaram. "
			+ " Usuario padrao pede 1 exemplar livre diferente para 10 dias")
	void teste() throws Exception {
		Set<DadosLivro> livros = Set.of(dadosLivro1, dadosLivro2);
		Set<DadosExemplar> exemplares = Set.of(dadosExemplar2Livro1,
				dadosExemplar2Livro2);
		Set<DadosUsuario> usuarios = Set.of(usuario1);

		DadosEmprestimo pedidoEmprestimo1 = new DadosEmprestimo(idLivro1,
				usuario1.idUsuario, 10, TipoExemplar.LIVRE, 1);
		DadosEmprestimo pedidoEmprestimo2 = new DadosEmprestimo(idLivro2,
				usuario1.idUsuario, 10, TipoExemplar.LIVRE, 2);

		Set<DadosEmprestimo> emprestimos = Set.of(pedidoEmprestimo1,
				pedidoEmprestimo2);
		
		if(emprestimos.size() != 2) {
			throw new IllegalStateException("Alberto com certeza montou o cenário errado");
		}
		
		Set<DadosDevolucao> devolucoes = Set.of();

		LocalDate hoje = LocalDate.now();

		Collection<EmprestimoConcedido> resultados = Solucao.executa(livros,
				exemplares, usuarios, emprestimos, devolucoes,
				hoje.plusDays(11));

		Assertions.assertTrue(resultados.stream()
				.noneMatch(r -> r.getMomentoDevolucao().isPresent()));
		Assertions.assertEquals(1, resultados.size());

		List<Integer> idsUsuariosRetornados = resultados.stream()
				.map(r -> r.idUsuario).collect(Collectors.toList());
		List<Integer> idsUsuariosEsperados = usuarios.stream()
				.map(u -> u.idUsuario).collect(Collectors.toList());
		Assertions.assertEquals(idsUsuariosEsperados, idsUsuariosRetornados);
		
		List<LocalDate> datasPrevistasDevolucaoRetornadas = resultados.stream()
				.map(r -> r.dataPrevistaDevolucao).collect(Collectors.toList());
		LocalDate previsaoEntrega = hoje.plusDays(10);
		List<LocalDate> datasPrevistasEsperadas = List.of(previsaoEntrega,
				previsaoEntrega, previsaoEntrega);
		Assertions.assertEquals(datasPrevistasEsperadas,
				datasPrevistasDevolucaoRetornadas);
	}
}
