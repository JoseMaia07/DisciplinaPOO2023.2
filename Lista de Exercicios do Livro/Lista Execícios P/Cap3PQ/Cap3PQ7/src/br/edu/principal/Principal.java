package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double peso , peso_engordar , peso_emagrecer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa mostra seu peso caso você engorde numa taxa de 15% ou emagreça numa taxa de 20%, sinta-se a vontade pra testar.");
		System.out.println("Digite o seu peso");
		peso = sc.nextDouble();
		peso_engordar = peso + (peso * 0.15);
		peso_emagrecer = peso - (peso * 0.20);
		System.out.println("Se você engordar 15% seu novo peso será " + peso_engordar);
        System.out.println("Se você emagrecer 20% seu novo peso será " + peso_emagrecer);
        }
}