package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n, num, i, j, fat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de N");
		n = sc.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("Digite o valor de num: ");
			num = sc.nextInt();
			fat = 1;
			for(j=1;j<=num;j++) {
				fat = fat * j;
			}
			System.out.println("O valor de fat é: "+fat);
		}

	}

}
