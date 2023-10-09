package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, m;
		String letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		do {
			System.out.println("Digite a letra, A-Aritmética ou P-Ponderada: ");
			System.out.println("Após isso, digite uma letra diferente para encerrar a escolha do método: ");
			letra = sc.next();
		}while((letra.equals("A")) || (letra.equals("P")));
		m = calcula_media(nota1, nota2, nota3, letra);
		if(letra.equals("A")) {
			System.out.println("A nota pela média Aritmética: "+Math.round(m));
		}else {
			System.out.println("A nota pela média Ponderada: "+Math.round(m));
		}

	}
	static double calcula_media(double n1, double n2, double n3, String l) {
		double media;
		if(l.equals("A")) {
			media = (n1+n2+n3)/3;
		}else {
			media = (n1*5+n2*3+n3*2)/(5+3+2);
		}
		return media;
	}

}
