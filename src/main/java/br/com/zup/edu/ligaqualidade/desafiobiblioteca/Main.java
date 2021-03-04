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
