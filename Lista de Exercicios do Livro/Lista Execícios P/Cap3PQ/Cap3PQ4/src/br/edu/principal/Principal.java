package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
// Faça um programa que receba duas notas, calcule e mostre a média ponderada dessas notas, considerando peso 2 para a primeira e peso 3 para a segunda.
		Scanner sc = new Scanner(System.in);
		double nota1 ,nota2 , peso1 , peso2 , mp;
		System.out.println("Digite a nota 1:");
		nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2:");
		nota2 = sc.nextDouble();
		peso1 = 2.0;
		peso2 = 3.0;
		mp =(nota1 * peso1 + nota2 * peso2)/(peso1 + peso2);
	    System.out.println("A média ponderada é: " + Math.round(mp));
       }
}