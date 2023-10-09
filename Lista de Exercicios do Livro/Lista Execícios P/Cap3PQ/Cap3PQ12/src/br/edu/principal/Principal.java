package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_min, sal, sal_t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do salário mínimo: Brasil-2023(1320) ");
		sal_min = sc.nextDouble();
		System.out.println("Digite o salário do funcionário: ");
		sal = sc.nextDouble();
		sal_t = Math.round(sal/sal_min);
		System.out.println("O funcionário recebe cerca de "+sal_t+" salários minímos");
		
	}

}
