package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] dado = new int[21];
		int i, num1, num2, num3, num4, num5, num6;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 20; i++) {
			System.out.println("Digite um número de 1 a 6 para saber sua frequência em 20 jogadas e digite os números sorteados: ");
			dado[i] = sc.nextInt();
			while((dado[i] < 1) || (dado[i] > 6)) {
				System.out.println(" Por favor, Digite um número de 1 a 6 para saber sua frequência em 20 jogadas e digite os números sorteados: ");
				dado[i] = sc.nextInt();
		}
	}
		for(i = 1; i <= 20; i++) {
			System.out.println("O número sorteado: "+dado[i]);
		}
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0;
		num5 = 0;
		num6 = 0;
		for(i = 1; i <= 20; i++) {
			if(dado[i] == 1) {
				num1 = num1 + 1;
			}
			if(dado[i] == 2) {
				num2 = num2 + 1;
			}
			if(dado[i] == 3) {
				num3 = num3 + 1;
			}
			if(dado[i] == 4) {
				num4 = num4 + 1;
			}
			if(dado[i] == 5) {
				num5 = num5 + 1;
			}
			if(dado[i] == 6) {
				num6 = num6 + 1;
			}
		}
		System.out.println("O número 1 sorteado foi "+num1+" vez(es)");
		System.out.println("O número 2 sorteado foi "+num2+" vez(es)");
		System.out.println("O número 3 sorteado foi "+num3+" vez(es)");
		System.out.println("O número 4 sorteado foi "+num4+" vez(es)");
		System.out.println("O número 5 sorteado foi "+num5+" vez(es)");
		System.out.println("O número 6 sorteado foi "+num6+" vez(es)");

	}

}
