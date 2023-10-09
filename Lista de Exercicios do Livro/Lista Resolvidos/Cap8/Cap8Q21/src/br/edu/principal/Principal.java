package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int x, y, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite valores postivos e inteiros");
		System.out.println("Digite o valor de x: ");
		x = sc.nextInt();
		System.out.println("Digite o valor de y tal que seja maior que x: ");
		y = sc.nextInt();
		while(x != y) {
			soma = primos(x, y);
			System.out.println("A soma dos números primos entre eles foi de: "+soma);
			System.out.println("Ou digite valores iguais para encerrar: ");
			System.out.println("Digite o valor de x: ");
			x = sc.nextInt();
			System.out.println("Digite o valor de y tal que seja maior que x: ");
			y = sc.nextInt();
		}

	}
	static int primos(int x, int y) {
		int i, j, r, cont, somatorio;
		somatorio = 0;
		for(i = x; i <= y; i++) {
			cont = 0;
			for(j = 1; j <= i; j++) {
				r = (i%j);
				if(r == 0) {
					cont = cont + 1;
				}
			}
			if(cont <= 2) {
				somatorio = somatorio + 1;
			}
		}
		return somatorio;
	}

}
