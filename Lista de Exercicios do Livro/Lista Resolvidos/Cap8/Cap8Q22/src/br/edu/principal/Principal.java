package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] vet1 = new int[9]; int [] vet2 = new int[9]; int[] vet3 = new int[9];
		int i, cont1, cont2;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 8; i++) {
			System.out.println("Digite os valores para o vetor 1: ");
			vet1[i] = sc.nextInt();
		}
		cont1 = pares(vet1, vet2);
		if(cont1 == 1) {
			System.out.println("NENHUM PAR FOI DIGITADO");
		}else {
			for(i = 1; i <= cont1 - 1; i++) {
				System.out.println("Digite os valores para a o vetor 2: ");
				vet2[i] = sc.nextInt();
			}
			cont2 = impares(vet1, vet3);
			if(cont2 == 1) {
				System.out.println("NENHUM ÍMPAR FOI DIGITADO");
			}else {
				for(i = 1; i <= cont2 - 1; i++) {
					System.out.println("O vetor resultante é: "+vet3[i]);
				}
			}
		}
	}
	static int pares(int[] v1, int[] v2) {
		int i, r, cont;
		cont = 1;
		for(i = 1; i <= 8; i++) {
			r = (v1[i]%2);
			if(r == 0) {
				v2[cont] = v1[i];
				cont = cont + 1;
			}
		}
		return cont;
	}
	static int impares(int[] v1, int[] v2) {
		int i, r, cont;
		cont = 1;
		for(i = 1; i <= 8; i++) {
			r = (v1[i]%2);
			if(r == 1) {
				v2[cont] = v1[i];
				cont = cont + 1;
			}
		}
		return cont;
	}

}
