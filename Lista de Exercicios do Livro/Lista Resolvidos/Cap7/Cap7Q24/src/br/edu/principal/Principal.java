package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double[][][] medias = new double[4][9][5]; 
		int i, j, k; double media_aluno, media_turma;
		media_turma = 0;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 3; i++) {
			for(j = 1; j <= 8; j++) {
				for(k = 1; k <= 4; k++) {
					System.out.println("Digite o valor das notas para a matrix: ");
					medias[i][j][k] = sc.nextDouble();
				}
			}
		}
		for(i = 1; i <= 3; i++) {
			for(j = 1; j <= 8; j++) {
				media_aluno = 0;
				for(k = 1; k <= 4; k++) {
					media_aluno = media_aluno + medias[i][j][k];
				}
				media_aluno = media_aluno/4;
				System.out.println("A média do aluno "+j+" na turma "+i+" = "+media_aluno);
			}
		}
		for(i = 1; i <= 3; i++) {
			media_aluno = 0;
			for(j = 1; j <= 8; j++) {
				for(k = 1; k <= 4; k++) {
					media_turma = media_turma + medias[i][j][k];
				}
			}
			media_turma = media_turma/(8 * 4);
			System.out.println("A média da turma "+i+" = "+media_turma);
		}
		
		
	}

}
