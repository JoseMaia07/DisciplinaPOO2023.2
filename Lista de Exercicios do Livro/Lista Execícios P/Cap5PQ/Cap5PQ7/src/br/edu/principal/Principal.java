package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade, i, ni, pa; double peso, altura, soma_a, media_a, soma_p, porc_p;
		soma_a=0;
		ni=0;
		pa=0;
		soma_p=0;
		Scanner sc = new Scanner(System.in);
		for(i=1; i<=5; i++) {
			System.out.println("Digite a idade da "+i+"° pessoa: ");
			idade = sc.nextInt();
			System.out.println("Digite a altura da "+i+"° pessoa em metros: ");
			altura = sc.nextDouble();
			System.out.println("Digite o peso da "+i+"° pessoa em quilos: ");
			peso = sc.nextDouble();
			if(idade>=50) {
				ni++;
			}
			if(idade>=10 && idade <=20) {
				soma_a += altura;
				pa++;
			}
			if(peso <=40) {
				soma_p++;
			}
		}
		if(pa >0) {
			media_a = soma_a/pa;
			System.out.println("A média das alturas das pessoas entre 10 e 20 anos, são "+Math.round(media_a));
		}
		porc_p = (soma_p * 100)/5;
		System.out.println("A porcentagem das pessoas com peso de 40kg ou inferior é de "+porc_p+"%");
		System.out.println("O número de pessoas com 50 anos ou superior é "+ni);
		
	}

}
