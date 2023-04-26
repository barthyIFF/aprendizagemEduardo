package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

//Eduardo - 25/04/23 - criei as packages e fiz import de classes que estão contidas nelas, para importar tudo de um package apenas coloar .* para importar todas as classes pertencentes a um package.

public class TesteDaConta {

	public static void main(String[] args) {
		
		//26/04/23 - Pacotes criados corretamente
		
		Conta ContaDoEduardo = new Conta();
		Conta ContaDoClaudinho = new Conta();
		
		Data data = new Data();
		
		data.dia = 27;
		data.mes = 04;
		data.ano = 2023;
		
		//ContaDoEduardo.dataDeAbertura = data;
		ContaDoClaudinho.setNomeDoTitular("Claudio");
		ContaDoEduardo.setNomeDoTitular("Eduardo");
		
		//Claudio - 19/04/23 - Mudando so o valor do atributo agencia
		ContaDoClaudinho.setAgencia("0000 00000");
		ContaDoEduardo.setAgencia("0002 88888");
		
		System.out.println("Nome do titular: " + ContaDoClaudinho.getNomeDoTitular());
		System.out.println("Nome do titular: " + ContaDoEduardo.getNomeDoTitular());
		
		
		System.out.println("Numero da agencia do " + ContaDoClaudinho.getNomeDoTitular() + ":" + ContaDoClaudinho.getAgencia());
		System.out.println("Numero da agencia do " + ContaDoEduardo.getNomeDoTitular() + ":" + ContaDoEduardo.getAgencia());
		
		//ContaDoEduardo.mostrarDadosDaConta();
		
		//ContaDoEduardo.depositar(1000);
		//ContaDoEduardo.saca(250);
		
		//ContaDoEduardo.mostrarDadosDaConta();
		
	}
}
