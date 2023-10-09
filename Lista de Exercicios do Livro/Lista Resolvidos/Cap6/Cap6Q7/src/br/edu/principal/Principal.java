package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] vet = new int[9];
		int i, j, z, aux;
		Scanner sc = new Scanner(System.in);
		i =1;
		while(i <= 8) {
			System.out.println("Digite um número: ");
			aux = sc.nextInt();
			j = i - 1;
			while(j >= 0 && vet[j] > aux) {
				j = j + 1;
			}
			z = 1;
			while( z >= j) {
				vet[z] = vet[z + 1];
				z = z -1;
			}
			vet[j] = aux;
			i = i + 1;
		}
		for(i = 0; i < 8; i++) {
			System.out.println("O vetor: "+vet[i]);
		}
	}

}
