package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int c, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		c = sc.nextInt();
		System.out.println("A temperatura em celsius: "+c+"°");
		f = 180*(c+32)/100;
		System.out.println("Convertendo, a temperatura em Fahrenheit: "+f+"°");


	}

}
