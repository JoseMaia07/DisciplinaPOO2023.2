package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[][] mat = new int[6][8];
		int i, j, maior, menor, linha, coluna, cont;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 7; j++) {
				System.out.println("Digite os valores da matriz 5x7: ");
				mat[i][j] = sc.nextInt();
			}
		}
		cont = 0;
		for(i = 1; i <= 5; i++) {
			menor = mat[i][1];
			linha = i;
			coluna = 0;
			for(j = 1; j <= 7; j++) {
				if(mat[i][j] < menor) {
					menor = mat[i][j];
					linha = i;
					coluna = j;
				}
			}
			maior = mat[1][coluna];
			for(j = 1; j <= 5; j++) {
				if(mat[j][coluna] > maior) {
					maior =  mat[j][coluna];
				}
			}
			if(menor == maior) {
				System.out.println("Ponto de sela = "+maior+" na posição"+linha+" "+coluna);
				cont = cont + 1;
			}
		}
		if(cont == 0) {
			System.out.println("Não existe ponto de sela nesta matriz");
		}

	}

}
