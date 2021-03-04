package br.com.zup.edu.ligaqualidade.desafiobiblioteca.modifique;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
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

public class Cenario2 {

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
	@DisplayName("Usuario pesquisador pede 6 exemplares restritos diferentes para 60 dias")
	void teste() throws Exception {
		Set<DadosLivro> livros = Set.of(dadosLivro1, dadosLivro2, dadosLivro3,
				dadosLivro4, dadosLivro5, dadosLivro6);
		Set<DadosExemplar> exemplares = Set.of(dadosExemplar1Livro1,
				dadosExemplar1Livro2, dadosExemplar1Livro3,
				dadosExemplar1Livro4, dadosExemplar1Livro5,
				dadosExemplar1Livro6);
		Set<DadosUsuario> usuarios = Set.of(usuario2);

		DadosEmprestimo pedidoEmprestimo1 = new DadosEmprestimo(idLivro1,
				usuario2.idUsuario, 60, TipoExemplar.LIVRE, 1);
		DadosEmprestimo pedidoEmprestimo2 = new DadosEmprestimo(idLivro2,
				usuario2.idUsuario, 60, TipoExemplar.LIVRE, 2);
		DadosEmprestimo pedidoEmprestimo3 = new DadosEmprestimo(idLivro3,
				usuario2.idUsuario, 60, TipoExemplar.LIVRE, 3);
		DadosEmprestimo pedidoEmprestimo4 = new DadosEmprestimo(idLivro4,
				usuario2.idUsuario, 60, TipoExemplar.LIVRE, 4);
		DadosEmprestimo pedidoEmprestimo5 = new DadosEmprestimo(idLivro5,
				usuario2.idUsuario, 60, TipoExemplar.LIVRE, 5);
		DadosEmprestimo pedidoEmprestimo6 = new DadosEmprestimo(idLivro6,
				usuario2.idUsuario, 60, TipoExemplar.LIVRE, 6);

		Set<DadosEmprestimo> emprestimos = Set.of(pedidoEmprestimo1,
				pedidoEmprestimo2, pedidoEmprestimo3, pedidoEmprestimo4,
				pedidoEmprestimo5, pedidoEmprestimo6);

		Set<DadosDevolucao> devolucoes = Set.of();

		LocalDate hoje = LocalDate.now();

		Collection<EmprestimoConcedido> resultados = Solucao.executa(livros,
				exemplares, usuarios, emprestimos, devolucoes,
				hoje.plusDays(61));

		if (emprestimos.size() != 6) {
			throw new IllegalStateException("Alberto montou o cenário errado");
		}

		Assertions.assertTrue(resultados.stream()
				.noneMatch(r -> r.getMomentoDevolucao().isPresent()));
		Assertions.assertEquals(6, resultados.size());

		List<Integer> idsExemplaresRetornados = resultados.stream()
				.map(r -> r.idExemplar).collect(Collectors.toList());
		List<Integer> idsExemplaresEsperados = exemplares.stream()
				.map(e -> e.idExemplar).collect(Collectors.toList());
		Assertions.assertEquals(idsExemplaresEsperados,
				idsExemplaresRetornados);

		List<Integer> idsUsuariosRetornados = resultados.stream()
				.map(r -> r.idUsuario).collect(Collectors.toList());
		List<Integer> idsUsuariosEsperados = usuarios.stream()
				.map(u -> u.idUsuario).collect(Collectors.toList());
		Assertions.assertEquals(idsUsuariosEsperados, idsUsuariosRetornados);

		List<LocalDate> datasPrevistasDevolucaoRetornadas = resultados.stream()
				.map(r -> r.dataPrevistaDevolucao).collect(Collectors.toList());
		LocalDate previsaoEntrega = hoje.plusDays(60);
		List<LocalDate> datasPrevistasEsperadas = List.of(previsaoEntrega,
				previsaoEntrega, previsaoEntrega, previsaoEntrega,
				previsaoEntrega, previsaoEntrega);
		Assertions.assertEquals(datasPrevistasEsperadas,
				datasPrevistasDevolucaoRetornadas);
	}
}
