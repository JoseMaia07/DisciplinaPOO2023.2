package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double precoantigo, precoatual, acrescimo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o preço antigo: ");
		precoantigo = sc.nextDouble();
		System.out.println("Digite o preço atual: ");
		precoatual = sc.nextDouble();
		acrescimo = calculo_reajuste(precoantigo, precoatual);
		System.out.println("O acréscimo foi de: "+acrescimo);
		
	}
	
	static double calculo_reajuste(double pa, double pn ) {
		double result;
		result = (100 * pn - 100 * pa)/ pa;
		return result;
	}
	
}
