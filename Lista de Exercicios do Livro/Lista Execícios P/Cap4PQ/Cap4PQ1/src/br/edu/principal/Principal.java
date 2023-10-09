package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, notaf, media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		System.out.println("Digite a última nota: ");
		nota4 = sc.nextDouble();
		notaf = nota1 + nota2 + nota3 + nota4;
		System.out.println("A soma das notas foi de "+Math.round(notaf));
		media = notaf/4;
		System.out.println("Sua média foi de "+Math.round(media));
		if(media >=7) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado.");
		}

	}

}