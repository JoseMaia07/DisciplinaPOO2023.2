package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num, soma, soma_par, qtd, maior, menor, qtd_par, qtd_impar;
		double media_par, media, perc;
		Scanner sc = new Scanner(System.in);
		qtd = 0;
		qtd_par = 0;
		soma_par = 0;
		qtd_impar = 0;
		soma = 0;
		maior = 0;
		menor = 0;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		while(num != 30000) {
			if(qtd == 0) {
				maior = num;
				menor = num;
			}else {
				if(num > maior) {
					maior = num;
				}else if(num < menor) {
					menor = num;
				}
			}
			soma = soma + num;
			qtd = qtd + 1;
			if((num%2) == 0) {
				soma_par = soma_par + num;
				qtd_par = qtd_par + 1;
			}else {
				qtd_impar = qtd_impar + 1;
			}
			System.out.println("Digite um número ou digite 30000 para encerrar: ");
			num = sc.nextInt();
		}
		if(qtd == 0) {
			System.out.println("Nenhum número digitado");
		}else {
			System.out.println("A soma é de: "+soma);
			System.out.println("A quantidade foi de: "+qtd);
			media = soma/qtd;
			System.out.println("A média entre a soma e a quantidade é de: "+media);
			System.out.println("O maior número digitado foi de: "+maior);
			System.out.println("O menor número digitado foi de: "+menor);
			if(qtd_par == 0) {
				System.out.println("Nenhum número par digitado");
			}else {
				media_par = soma_par/qtd_par;
				System.out.println("A média dos números pares é de: "+media_par);
				
			}
			perc = qtd_impar + 100/qtd;
			System.out.println("A porcentagem de números ímpares é de: "+qtd_impar+"%");
					
		}
		

	}

}
