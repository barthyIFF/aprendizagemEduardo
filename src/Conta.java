
public class Conta {
	
	String nomeDoTitular;
	int numeroDaConta;
	String agencia;
	double saldo;
	Data dataDeAbertura;
	
	
	void saca(double valorQueSeraSacado) {
		saldo += -valorQueSeraSacado;
	}
	
	void depositar(double valorQueSeraDepositado) {
		saldo += valorQueSeraDepositado;
	}
	
	double calculaRendimento() {
		return saldo * 0.1;
	}
	
	void mostrarDadosDaConta() {
		System.out.println("Nome do titular: " + nomeDoTitular);
		System.out.println("Número da conta: "+ numeroDaConta);
		System.out.println("Agência: " + agencia);
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("Data de abertura: " + dataDeAbertura.dia + "/" + dataDeAbertura.mes + "/" + dataDeAbertura.ano );
	}
}
