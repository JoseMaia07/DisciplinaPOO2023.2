package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int area, d_maior, d_menor; String u;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a unidade de medida:  ");
		u = sc.next();
		System.out.println("Digite a diagonal maior do losango: ");
		d_maior = sc.nextInt();
		System.out.println("Digite a diagonal menor do losango: ");
		d_menor = sc.nextInt();
		System.out.println("O valor das diagonais, maior e menor são respectivamente "+d_maior+u+" e "+d_menor+u);
		area = (d_maior*d_menor)/2;
		System.out.println("A área do losango é de "+area+u);
	}

}
