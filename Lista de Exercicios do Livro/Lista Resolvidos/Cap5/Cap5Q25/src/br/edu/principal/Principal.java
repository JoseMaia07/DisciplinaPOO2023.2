package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preco, imp, transp, seguro, final1, total_imp; int origem; String meio_t, carga;
		Scanner sc = new Scanner(System.in);
		imp = 0;
		transp = 0;
		seguro = 0;
		total_imp = 0;
		System.out.println("Digite o preço da carga: ");
		preco = sc.nextDouble();
		while(preco > 0) {
			System.out.println("Digite o número do pais de origem, 1, 2 ou 3: ");
			origem = sc.nextInt();
			System.out.println("Digite o meio de transporte: T, F ou A: ");
			meio_t = sc.next();
			System.out.println("Digite S ou N se a carga é perigosa: ");
			carga = sc.next();
			if(preco <= 100) {
				imp = preco * 5/100;
			}else {
				imp = preco * 10/100;
			}
			if(carga.equals("S")) {
				if(origem == 1) {
					transp = 50;
				}
				if(origem == 2) {
					transp = 21;
				}
				if(origem == 3) {
					transp = 24;
				}
			}
			if(carga.equals("N")) {
				if(origem == 1) {
					transp = 12;
				}
				if(origem == 2) {
					transp = 21;
				}
				if(origem == 3) {
					transp = 60;
				}
			}
			if(origem == 2 || meio_t.equals("A")) {
				seguro = preco/2;
			}else {
				seguro = 0;
			}
			final1 = preco + imp + transp + seguro;
			total_imp = total_imp + imp;
			System.out.println("O custo do imposto é: "+imp);
			System.out.println("O custo do transporte é: "+transp);
			System.out.println("O custo do seguro é: "+seguro);
			System.out.println("O custo final é de: "+final1);
			System.out.println("Digite o preço da carga ou digite 0 para encerrrar: ");
			preco = sc.nextDouble();
		}
		System.out.println("O imposto total é de: "+total_imp);
	}

}
