package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 /*Eduardo - 25/04/23 - criei as packages e fiz import de classes que estão contidas nelas, para importar tudo de um package apenas coloar .* para importar todas as classes pertencentes a um package.
 */

public class TesteDaConta {

	public static void main(String[] args) {
		
		//26/04/23 - Pacotes criados corretamente
		
		Conta ContaDoEduardo = new Conta();
		Conta ContaDoClaudinho = new Conta();
		
		
		ContaDoClaudinho.setNomeDoTitular("Claudinho");
		ContaDoEduardo.setNomeDoTitular("Eduardo");
		
		ContaDoClaudinho.setAgencia("0000 00000");
		ContaDoEduardo.setAgencia("0002 88888");
		
		ContaDoEduardo.depositar(100);
		ContaDoClaudinho.depositar(300);
		
		Data data = new Data();
		
		data.dia = 27;
		data.mes = 04;
		data.ano = 2023;
		
		//Funções das listas usadas corretamente - Claudio - 05/09/23
		List<Conta> listaDeContas = new ArrayList<>();
		
		listaDeContas.add(ContaDoEduardo);
		listaDeContas.add(ContaDoClaudinho);
		
		int maiorSaldo = ContaDoEduardo.compareTo(ContaDoClaudinho);
		
		if(maiorSaldo == -1) {
			System.out.println("A conta pertencente ao " + ContaDoEduardo.getNomeDoTitular() + " tem o saldo menor que a conta pertencente ao " + ContaDoClaudinho.getNomeDoTitular());
		}
		
		Collections.sort(listaDeContas);
		
		System.out.println(listaDeContas);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//ContaDoEduardo.dataDeAbertura = data;
		
		//Claudio - 19/04/23 - Mudando so o valor do atributo agencia
		
		//System.out.println("Nome do titular: " + ContaDoClaudinho.getNomeDoTitular());
		//System.out.println("Nome do titular: " + ContaDoEduardo.getNomeDoTitular());
		
		
		//System.out.println("Numero da agencia do " + ContaDoClaudinho.getNomeDoTitular() + ":" + ContaDoClaudinho.getAgencia());
		//System.out.println("Numero da agencia do " + ContaDoEduardo.getNomeDoTitular() + ":" + ContaDoEduardo.getAgencia());
		
		//ContaDoEduardo.mostrarDadosDaConta();
		
		//ContaDoEduardo.depositar(1000);
		//ContaDoEduardo.saca(250);
		
		//ContaDoEduardo.mostrarDadosDaConta();
		
	}
}
