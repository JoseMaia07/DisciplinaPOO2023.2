package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pi, raio, volume, comp,  area;
		String u;
		Scanner sc = new Scanner(System.in);
		pi = 3.14;
		System.out.println("Digite a unidade de medida: ");
		u = sc.next();
		System.out.println("Digite o raio da esfera: ");
		raio = sc.nextDouble();
		comp = 2*(pi*raio);
		System.out.println("O comprimento da esfera é de "+Math.round(comp)+u);
		area = pi * (raio * raio);
		System.out.println("A área da esfera é de "+Math.round(area)+u+"²");
		volume = 4/3 * pi * (raio * raio * raio);
		System.out.println("O volume da esfera é de: "+Math.round(volume)+u+"³");
	}

}
