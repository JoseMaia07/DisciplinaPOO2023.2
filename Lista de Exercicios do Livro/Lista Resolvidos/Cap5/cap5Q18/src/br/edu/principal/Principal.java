package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num, quad, cubo; double raiz;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para saber seu valor elevado ao quadrado e ao cubo e também sua raíz: ");
		num = sc.nextInt();
		while(num != 0) {
			quad = num * num;
			System.out.println(num+"² é igual a: "+quad);
			cubo = num * num * num;
			System.out.println(num+"³ é igual a: "+cubo);
			raiz = Math.sqrt(num);
			System.out.println("O valor da raiz de "+num+" é igual a: "+raiz);
			System.out.println("Digite um número para saber seu valor elevado ao quadrado e ao cubo e também sua raíz: ");
			System.out.println("Digite 0 se quiser encerrar o programa.");
			num = sc.nextInt();
			
		}
		
	}

}
