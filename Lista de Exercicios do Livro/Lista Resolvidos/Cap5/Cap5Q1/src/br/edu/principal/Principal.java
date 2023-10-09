package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, ano_atual, salario; double novo_salario, percentual, n_percentual;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		ano_atual = sc.nextInt();
		salario = 1000;
		percentual = 1.5/100;
		novo_salario = salario + percentual * salario;
		for(i = 2007; i <= ano_atual; i++) {
			n_percentual = 2 * percentual;
			novo_salario = novo_salario + (percentual * novo_salario);
		}
		System.out.println("O salário atual do funcionário é de: "+Math.round(novo_salario));
		
		

	}

}
