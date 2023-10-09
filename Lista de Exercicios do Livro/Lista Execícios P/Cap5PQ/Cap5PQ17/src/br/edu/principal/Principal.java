package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int canal, n_canal, n_pessoas, i, j, t_pessoas; double n_porc;
		Scanner sc = new Scanner(System.in);
		int[] canais = {4, 5, 7, 12};
		int[] audiencia = new int[4];
		t_pessoas = 0;
		while(true) {
			System.out.println("Digite o número do canal, ou digite 0 para encerrar o programa: ");
			canal = sc.nextInt();
			if(canal == 0) {
				break;
			}
			System.out.println("Digite o número de pessoas que estavam assistindo: ");
			n_pessoas = sc.nextInt();
			for(i = 0; i<canais.length; i++) {
				if(canal == canais[i]) {
					audiencia[i] += n_pessoas;
					t_pessoas += n_pessoas;
					break;
				}
			}
		}
		for(j = 0; j < canais.length; j++) {
			n_porc = ((double) audiencia[j]/t_pessoas) * 100;
			System.out.println("Canal "+canais[j]+": "+Math.round(n_porc)+"% de audiência.");
		}

	}

}
