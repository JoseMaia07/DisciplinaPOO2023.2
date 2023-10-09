package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[][] mat = new int[11][11]; int aux, i, j;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 10; i++) {
			for(j = 1; j <= 10; j++) {
				System.out.println("Digite o valor para a Matrix: ");
				mat[i][j] = sc.nextInt();
			}
		}
		for(i = 1; i <= 10; i++) {
			aux = mat[2][i];
			mat[2][i] = mat[8][i];
			mat[8][i] = aux;
		}
		for(i = 1; i <= 10; i++) {
			aux = mat[i][4];
			mat[i][4] = mat[i][10];
			mat[i][10] = aux;
		}
		j = 10;
		for(i = 1; i <= 10; i++) {
			aux = mat[i][i];
			mat[i][i] = mat[i][j];
			mat[i][j] = aux;
			j = j - 1;
		}
		for(j = 1; j <= 10; j++) {
			aux = mat[5][j];
			mat[5][j] = mat[j][10];
			mat[j][10] = aux;
		}
		for(i = 1; i <= 10; i++) {
			for(j = 1; j <= 10; j++) {
				System.out.println("A Matrix:  "+mat[i][j]);
			}
		}

	}

}
