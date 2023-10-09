package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
// Q: 1 cap : 3
// Faça um programa que receba dois numeros, calcule e mostre a subtraçao do primeiro pelo segundo
	int num1 , num2 , sub;
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro número:");
	num1 = sc.nextInt();
	System.out.println("Digite o segundo número:");
	num2 = sc.nextInt();
	sub = num1 - num2;
	System.out.println("A subtraçao do primeiro numero pelo segundo é: " + sub);

	}

}
