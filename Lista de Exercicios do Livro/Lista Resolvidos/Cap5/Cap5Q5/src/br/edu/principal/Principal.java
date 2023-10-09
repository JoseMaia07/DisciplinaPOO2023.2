package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int fim, i, j, x, expoente, num_termos, den, denominador, fat, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de termos: ");
		num_termos = sc.nextInt();
		System.out.println("Digite um valor positivo para X: ");
		x = sc.nextInt();
		s = 0;
		denominador = 1;
		for(i = 1; i<=num_termos;i++) {
			fim = denominador;
			fat = 1;
			for(j = 1; j<=denominador; j++) {
				fat = fat*j;}
			expoente = i + 1;
			if(expoente%2 == 0) {
				s = s- (int) Math.pow(x, expoente) / fat;
			}else {
				s = s + (int) Math.pow(x, expoente) / fat;
			}
			if(denominador == 4) {
				den = -1;
			}
			else if(denominador == 1) {
				den = 1;
			if(den == 1) {
				denominador = denominador + 1;
			}else{
				denominador = denominador - 1;
			}
			}
		}
		System.out.println("O valor da série é de: "+s);

	}

}
