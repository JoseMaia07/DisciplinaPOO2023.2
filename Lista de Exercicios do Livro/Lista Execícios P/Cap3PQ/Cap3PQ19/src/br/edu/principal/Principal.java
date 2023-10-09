package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double area, comprimento, largura, potencia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o comprimento do cômodo em metros: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite a largura do cômodo em metros: ");
		largura = sc.nextDouble();
		area = comprimento * largura;
		System.out.println("A área do cômodo é de "+area+"m²");
		potencia = area * 18;
		System.out.println("A potência necessária é de "+potencia+"W");
		

	}

}
