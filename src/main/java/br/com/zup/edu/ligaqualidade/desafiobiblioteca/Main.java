package br.com.zup.edu.ligaqualidade.desafiobiblioteca;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.modifique.Solucao;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosLivro;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosUsuario;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoUsuario;

public class Main {

	public static void main(String[] args) {
		int idLivro1 = 1;
		DadosLivro dadosLivro1 = new DadosLivro("titulo1",BigDecimal.TEN,idLivro1);
		
		DadosExemplar dadosExemplar1Livro1 = new DadosExemplar(TipoExemplar.RESTRITO,idLivro1,1);
		DadosExemplar dadosExemplar2Livro1 = new DadosExemplar(TipoExemplar.LIVRE,idLivro1,2);
		
		int idLivro2 = 2;
		DadosLivro dadosLivro2 = new DadosLivro("titulo2",BigDecimal.TEN,idLivro2);
		
		DadosExemplar dadosExemplar1Livro2 = new DadosExemplar(TipoExemplar.RESTRITO,idLivro2,7);
		DadosExemplar dadosExemplar2Livro2 = new DadosExemplar(TipoExemplar.LIVRE,idLivro2,8);
		
		int idLivro3 = 3;
		DadosLivro dadosLivro3 = new DadosLivro("titulo3",BigDecimal.TEN,idLivro3);
		
		DadosExemplar dadosExemplar1Livro3 = new DadosExemplar(TipoExemplar.RESTRITO,idLivro3,13);
		DadosExemplar dadosExemplar2Livro3 = new DadosExemplar(TipoExemplar.LIVRE,idLivro3,14);
		
		int idLivro4 = 4;
		DadosLivro dadosLivro4 = new DadosLivro("titulo4",BigDecimal.TEN,idLivro4);
		
		DadosExemplar dadosExemplar1Livro4 = new DadosExemplar(TipoExemplar.RESTRITO,idLivro4,15);
		DadosExemplar dadosExemplar2Livro4 = new DadosExemplar(TipoExemplar.LIVRE,idLivro4,16);
		
		int idLivro5 = 5;
		DadosLivro dadosLivro5 = new DadosLivro("titulo5",BigDecimal.TEN,idLivro5);
		
		DadosExemplar dadosExemplar1Livro5 = new DadosExemplar(TipoExemplar.RESTRITO,idLivro5,17);
		DadosExemplar dadosExemplar2Livro5 = new DadosExemplar(TipoExemplar.LIVRE,idLivro5,18);
		
		int idLivro6 = 6;
		DadosLivro dadosLivro6 = new DadosLivro("titulo6",BigDecimal.TEN,idLivro6);
		
		DadosExemplar dadosExemplar1Livro6 = new DadosExemplar(TipoExemplar.RESTRITO,idLivro6,19);
		DadosExemplar dadosExemplar2Livro6 = new DadosExemplar(TipoExemplar.LIVRE,idLivro6,20);
		
		DadosUsuario usuario1 = new DadosUsuario(TipoUsuario.PADRAO,1);
		DadosUsuario usuario2 = new DadosUsuario(TipoUsuario.PESQUISADOR,2);
		
		
		
		List<DadosLivro> livros = List.of(dadosLivro1);
		List<DadosExemplar> exemplares = List.of(dadosExemplar2Livro1,dadosExemplar2Livro2,dadosExemplar2Livro3,dadosExemplar2Livro4,dadosExemplar2Livro5);
		List<DadosUsuario> usuarios = List.of(usuario1);
		
		DadosEmprestimo pedidoEmprestimo1 = new DadosEmprestimo(idLivro1,usuario1.idUsuario,60,TipoExemplar.LIVRE,1);
		DadosEmprestimo pedidoEmprestimo2 = new DadosEmprestimo(idLivro1,usuario1.idUsuario,60,TipoExemplar.LIVRE,2);
		DadosEmprestimo pedidoEmprestimo3 = new DadosEmprestimo(idLivro1,usuario1.idUsuario,60,TipoExemplar.LIVRE,3);
		DadosEmprestimo pedidoEmprestimo4 = new DadosEmprestimo(idLivro1,usuario1.idUsuario,60,TipoExemplar.LIVRE,4);
		DadosEmprestimo pedidoEmprestimo5 = new DadosEmprestimo(idLivro1,usuario1.idUsuario,60,TipoExemplar.LIVRE,5);
		
		List<DadosEmprestimo> emprestimos = List.of(pedidoEmprestimo1,pedidoEmprestimo2,pedidoEmprestimo3,pedidoEmprestimo4,pedidoEmprestimo5);
		
		List<DadosDevolucao> devolucoes = List.of();
		
		Collection<EmprestimoConcedido> resultados =  Solucao.executa(livros,exemplares,usuarios,emprestimos,devolucoes,LocalDate.now().plusDays(61));
		
		System.out.println("****** Resultados teste 1 começo ********");
		
		
		Set<Integer> idsExemplaresRetornados = resultados.stream().map(r -> r.idExemplar).collect(Collectors.toSet());
		Set<Integer> idsExemplaresEsperados = exemplares.stream().map(e -> e.idExemplar).collect(Collectors.toSet());
		System.out.println("Ids exemplares esperados? "+idsExemplaresEsperados+". Ids exemplares retornados? "+idsExemplaresRetornados+". Correto? ");
		
		System.out.println("****** Resultados teste 1 fim ********");
		
		/*
		 * Cenario 1
		 * 
		 *  - Usuario padrão pede 5 exemplares livres diferentes para 60 dias
		 *  - Retorno: 5 emprestimos concedidos para o determinado usuario, determinado exemplar, data prevista de devolução e sem data instante de devolução
		 *  
		 *  Cenario 2
		 *  
		 *  - Usuario pesquisador pede 6 exemplares restritos diferentes para 60 dias
		 *  - Retorno: 6 emprestimos concedidos para o determinado usuario, determinado exemplar, data prevista de devolução e sem data instante de devolução
		 *  
		 *  Cenario 3
		 *  
		 *  - Usuario padrão pede 4 exemplares livres diferentes e 1 restrito para 60 dias
		 *  - Retorno: 4 emprestimos concedidos para o determinado usuario, determinado exemplar, data prevista de devolução e sem data instante de devolução
		 *  
		 *  Cenario 4
		 *  
		 *  - Usuario pesquisador pede 4 exemplares livres diferentes e 2 restrito para 60 dias
		 *  - Retorno: 6 emprestimos concedidos para o determinado usuario, determinado exemplar, data prevista de devolução e sem data instante de devolução
		 *  
		 *  Cenario 5
		 *  
		 *  - Usuario pesquisador pede 5 exemplares diferentes para 61 dias
		 *  - Retorno: 0 emprestimos concedidos 
		 *  
		 *  
		 *  Cenario 6
		 *  
		 *  - Usuario padrao pede 1 exemplar livre para 10 dias
		 *  - Dez dias se passaram
		 *  - Usuario padrao pede 1 exemplar livre diferente para 10 dias
		 *  - Retorno: 1 empréstimo concedido para o determinado usuario, determinado exemplar, data prevista de devolução e sem data instante de devolução 
		 *  
		 *  Cenario 7
		 *  
		 *  - Usuario padrao pede 5 exemplares livres para 10 dias
		 *  - Usuario devolve o primeiro o livro 5 dias depois
		 *  - Retorno: 5 empréstimo concedidos e um devolvido para o determinado usuario, determinado exemplar, data prevista de devolução e sem data instante de devolução
		 */
		
		/*
		 * 
		 */
		

		
	}

}
