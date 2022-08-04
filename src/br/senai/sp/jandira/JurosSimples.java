package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		double juros, capital, tempo, taxa;
		double valorInteiro;
		char respostaParcelas;
		
		Scanner leitor;
		
		leitor = new Scanner (System.in);
		
		System.out.print("Qual é o capital? ");
		capital = leitor.nextDouble();
		
		System.out.print("Qual é a taxa de juros? ");
		taxa = leitor.nextDouble();
		
		System.out.print("Quantos meses? ");
		tempo = leitor.nextDouble();
		
		juros = capital*tempo*taxa/100; //C.i.t - porcento
		valorInteiro = juros + capital;
		
		System.out.println("O valor de juros é: " + juros);
		System.out.print("Você terá ao todo: " + valorInteiro);
		System.out.println("Gostaria de ver a quantidade de parcelas?");
					
	}

}
