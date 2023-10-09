package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int m ,n, soma, i;
		m = 0;
		n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de m sendo menor que o de n: ");
		m = sc.nextInt();
		System.out.println("Digite o valor de n que seja maior que m: ");
		n = sc.nextInt();
		while(m < n) {
			soma = 0;
			for(i = m; i <= n; i++) {
				soma = soma + 1;
			}
			System.out.println("O valor da soma dos números de m a n é: "+soma);
			System.out.println("Digite o valor de m: ");
			m = sc.nextInt();
			System.out.println("Digite o valor de n: ");
			n = sc.nextInt();
		}

	}

}
