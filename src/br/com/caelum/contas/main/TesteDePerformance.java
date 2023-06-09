package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;

public class TesteDePerformance {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando teste de performance...");
		
		Collection<Integer> teste = new ArrayList<>();
		//Collection<Integer> teste = new HashSet<>();
		
		long inicio = System.currentTimeMillis();
		
		
		
		int total = 150000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto:" + tempo);
		
		//teste de comando size, para mostrar o tamanho da minha coleção
		System.out.println(teste.size());
	}

}
