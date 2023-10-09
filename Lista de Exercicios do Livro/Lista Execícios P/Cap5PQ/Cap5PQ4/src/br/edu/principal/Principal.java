package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para ser feito sua tabuada: ");
		num = sc.nextInt();
		for(i = 0; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}

	}

}
