package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double[][] mat = new double[4][5]; double[] vet = new double[13];
		int i, j;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i <= 3; i++) {
			for(j = 1; j <= 4; j++) {
				System.out.println("Digite o valor para a matrix: ");
				mat[i][j] = sc.nextDouble();
				
			}
		}
		gera_vetor(mat, vet);
		for(i = 1; i <= 12; i++) {
			System.out.println("O vetor resultante: "+vet[i]);
		}

	}
	static void gera_vetor(double[][] m, double[] v) {
		int i, j, k;
		k = 1;
		for(i = 1; i <= 3; i++) {
			for(j = 1; j <= 4; j++) {
				v[k] = m[i][j]; k = k+1;
			}
		}
	}

}
