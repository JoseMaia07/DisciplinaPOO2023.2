package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] vet = new int[11];
		int i; boolean achou;
		Scanner sc = new Scanner(System.in);
		for( i = 0; i <=10; i++) {
			System.out.println("Digite um valor para o "+i+"° vetor: ");
			vet[i] = sc.nextInt();
		}
		achou = false;
		for(i = 0; i <=10; i++) {
			if(vet[i] > 50) {
				System.out.println("O vetor: "+i+" valor: "+vet[i]+" na posição "+i);
				achou = true;
			}
		}
		if(achou == false) {
			System.out.println("Não existem números superiores a 50 no vetor");
		}

	}

}
