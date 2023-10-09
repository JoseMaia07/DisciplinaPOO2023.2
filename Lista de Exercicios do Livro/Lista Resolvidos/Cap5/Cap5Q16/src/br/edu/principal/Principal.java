package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double base, altura, area;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite a base do triangulo: ");
			base = sc.nextDouble();
			System.out.println("Digite a altura do triangulo: ");
			altura = sc.nextDouble();
			area = base * altura/2;
			System.out.println("O valor da área do triangulo é de "+Math.round(area)+"m²");
			System.out.println("Digite 0 para parar ou continue: ");
		}while(altura>0 && base>0);

	}

}
