
public class TesteDaConta {

	public static void main(String[] args) {
		
		Conta ContaDoEduardo = new Conta();
		
		Data data = new Data();
		
		data.dia = 27;
		data.mes = 04;
		data.ano = 2023;
		
		ContaDoEduardo.dataDeAbertura = data;
		
		
		ContaDoEduardo.mostrarDadosDaConta();
		
		//ContaDoEduardo.depositar(1000);
		//ContaDoEduardo.saca(250);
		
		//ContaDoEduardo.mostrarDadosDaConta();
		
	}
}
