package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int meses; double sal_carlos, sal_joao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário de Carlos: ");
		sal_carlos = sc.nextDouble();
		sal_joao = sal_carlos/3;
		meses = 0;
		while(sal_joao <= sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos * 2/100);
			sal_joao = sal_joao + (sal_joao * 5/100);
			meses = meses + 1;
		}
		System.out.println("Levará "+meses+" meses para que João consiga igualar ou superar o salário.");

	}

}
