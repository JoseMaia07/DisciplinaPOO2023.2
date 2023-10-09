package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[][] mat = new int[16][6]; int[][] rep = new int[16][6]; int[][] vezes = new int[16][6];
		int i, j, k, l, lin, lin2, col, x, num, qtde, achou;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 15; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.println("Digite o valor da matrix  15x5: ");
				mat[i][j] = sc.nextInt();
			}
		}
		lin = 1;
		col = 1;
		for(i = 1; i <= 15; i++) {
			for(j = 1; j <= 5; j++) {
				qtde =1;
				num = mat[i][j];
				for(k = 1; k <= 15; k++) {
					for(l = 1; l <= 5; l++) {
						if( i != k || j != l) {
							if(mat[k][l] == num) {
								qtde = qtde + 1;
							}
						}
					}
				}
				if(qtde > 1) {
					achou = 0;
					if(col == 1) {
						lin2 = lin - 1;
					}else {
						lin2 = lin;
					}
					for(k = 1; k <= lin2; k++) {
						if(k < lin2) {
							x = 5;
						}else {
							x = col - 1;
						}
						for(l = 1; l <= x; l++) {
							if(num == rep[k][l]) {
								achou = 1;
							}
						}
					}
					if(achou == 0) {
						rep[lin][col] = num;
						vezes[lin][col] = qtde;
						col = col = 1;
						if(col > 5) {
							lin = lin + 1;
							col = 1;
						}
					}
				}
			}
		}
		for(i = 1; i <= lin; i++) {
			if(i < lin) {
				x = 5;
			}else {
				x = col - 1;
			}
			for(j = 1; j <= x; j++) {
				System.out.println("O número "+rep[i][j]+" repetiu "+vezes[i][j]+" vezes");
			}
		}

	}

}
