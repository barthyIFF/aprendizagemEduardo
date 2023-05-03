package br.com.caelum.contas.modelo;

import java.lang.Comparable;


public class Conta implements Comparable<Conta>{
		
	/*
	 * Eduardo, veja que o nome do 
	 */
	
	
	
	//Veja que conforme conversamos esses são os atributos, ou seja, o que essa classe TEM
	private String nomeDoTitular;
	private int numeroDaConta;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void saca(double valorQueSeraSacado) {
		saldo += -valorQueSeraSacado;
	}
	
	public void depositar(double valorQueSeraDepositado) {
		saldo += valorQueSeraDepositado;
	}
	
	double calculaRendimento() {
		return saldo * 0.1;
	}
	
	//Veja que conforme conversamos esse é um método, ou seja, o que essa classe FAZ 
	void mostrarDadosDaConta() {
		System.out.println("Nome do titular: " + nomeDoTitular);
		System.out.println("Número da conta: "+ numeroDaConta);
		System.out.println("Agência: " + agencia);
		System.out.println("Saldo da conta: " + saldo);
		//System.out.println("Data de abertura: " + dataDeAbertura.dia + "/" + dataDeAbertura.mes + "/" + dataDeAbertura.ano );
	}

	public int compareTo(Conta outra) {
			if (this.saldo < outra.saldo) {
				return -1;
			}
			
			if (this.saldo > outra.saldo) {
				return 1;
			}
			
			return 0;
	}

}
