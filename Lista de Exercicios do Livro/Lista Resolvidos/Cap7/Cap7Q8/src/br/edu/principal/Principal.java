package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[][] mat1 = new int[7][5]; int[][] mat2 = new int[7][5];
		int i, j, qtde;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 6; i++) {
			for(j = 1; j <= 4; j++) {
				System.out.println("Digite o valor da matrix 1 6x4: ");
				mat1[i][j] = sc.nextInt();
			}
		}
		qtde = 0;
		for(i = 1; i <= 6; i++) {
			for(j = 1; j <= 4; j++) {
				if(mat1[i][j] > 30) {
					qtde = qtde + 1;
				}
			}
		}
		for(i = 1; i <= 6; i++) {
			for(j = 1; j <= 4; j++) {
				if(mat1[i][j] == 30) {
					mat2[i][j] = 0;
				}else {
					mat2[i][j] = mat1[i][j];
				}
			}
		}
		System.out.println("O número de elementos maiores que 30 são: "+qtde);
		for(i = 1; i <= 6; i++) {
			for(j = 1; j <= 4; j++) {
				System.out.println("A matrix 2 6x4: "+mat2[i][j]);
			}
		}

	}

}
