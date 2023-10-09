package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] vet = new int[11];
		int i, j, aux;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 10; i++) {
			System.out.println("Digite o "+i+"° número inteiro para o vetor: ");
			vet[i] = sc.nextInt();
		}
		for(i = 1; i <= 10; i++) {
			for(j = 1; j <= 9; j++) {
				if(vet[j] < vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		for(i = 1; i <= 10; i++) {
			System.out.println("O "+i+"° vetor resultante é: "+vet[i]);
		}

	}

}
