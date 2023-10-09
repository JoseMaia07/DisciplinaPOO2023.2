package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int op; double nota1, nota2, nota3, media1, media2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu de opções para calcular a média: ");
		System.out.println("1. Média Aritmética");
		System.out.println("2. Média Ponderada");
		System.out.println("3. Sair");
		System.out.println("Digite a opção desejada: ");
		op = sc.nextInt();
		while(true) {
			if(op != 1 && op != 2 && op != 3) {
				System.out.println("Opção inválida, reinicie o programa.");
				break;
			}else if(op == 1){
				System.out.println("Digite a primeira nota: ");
				nota1 = sc.nextDouble();
				System.out.println("Digite a segunda nota: ");
				nota2 = sc.nextDouble();
				media1 = Math.round((nota1+nota2)/2);
				System.out.println("Sua média foi de: "+media1);
				if(media1 <6) {
					System.out.println("Reprovado!");
				}else if(media1 >=6) {
					System.out.println("Aprovado!");
				}
				break;
			}else if(op == 2) {
				System.out.println("Digite a primeira nota: ");
				nota1 = sc.nextDouble();
				System.out.println("Digite a segunda nota: ");
				nota2 = sc.nextDouble();
				System.out.println("Digite a terceira nota: ");
				nota3 = sc.nextDouble();
				media2 = Math.round((nota1 + (nota2*2) + (nota3*3))/6);
				System.out.println("A média foi de: "+media2);
				if(media2 <6) {
					System.out.println("Reprovado!");
				}else if(media2 >=6) {
					System.out.println("Aprovado!");
				}
				break;
			}
		}
	}

}
