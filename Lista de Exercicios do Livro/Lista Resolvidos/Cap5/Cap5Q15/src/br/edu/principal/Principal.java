package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, qtd_b, qtd_n, qtd_c, custo_est; double preco, imp, preco_final, adicional, maior_p, menor_p, tot_imp;
		String refri, categ;
		Scanner sc = new Scanner(System.in);
		adicional = 0;
		tot_imp = 0;
		qtd_b = 0;
		qtd_n = 0;
		qtd_c = 0;
		menor_p = 0;
		maior_p = 0;
		custo_est = 0;
		for(i = 1; i <= 12; i++) {
			System.out.println("Digite o preço do "+i+"° produto: ");
			preco = sc.nextInt();
			System.out.println("Digite se precisa de refrigeração, S ou N: ");
			refri = sc.next();
			System.out.println("Digite a categoria do produto: A, L ou V: ");
			categ = sc.next();
			if(preco <= 20) {
				if(categ.equals("A")) {
					custo_est = 2;
				}else if(categ.equals("L")) {
					custo_est = 3;
				}else if(categ.equals("V")) {
					custo_est = 4;
				}
			}
			if(preco > 20 && preco <= 50) {
				if(refri.equals("S")) {
					custo_est = 6;
				}else {
					custo_est = 0;
				}
			}
			if(preco > 50) {
				if(refri.equals("S")) {
					if(categ.equals("A")) {
						custo_est = 5;
					}else if(categ.equals("L")) {
						custo_est = 2;
					}else if(categ.equals("V")) {
						custo_est = 4;
					}
				}else {
					if(categ.equals("A") || categ.equals("V")) {
						custo_est = 0;
					}else if(categ.equals("L")) {
						custo_est = 1;
					}
				}
			}
			if(categ.equals("A") && categ.equals("S")) {
				imp = preco * 4/100;
			}else {
				imp = preco * 2/100;
			}
			preco_final = preco + custo_est + imp;
			System.out.println("O custo de estoque é de: "+custo_est);
			System.out.println("O imposto é de: "+imp);
			System.out.println("O preço final é de: "+preco_final);
			if(preco_final <= 20) {
				qtd_b = qtd_b = 1;
				System.out.println("Classificação: Barato");
			}else if(preco_final > 20 && preco_final <= 100) {
				qtd_n = qtd_n + 1;
				System.out.println("Classificação: Normal");
			}else if(preco_final > 100) {
				qtd_c = qtd_c + 1;
				System.out.println("Classificação: Caro");
			}
			adicional = adicional + custo_est + imp;
			tot_imp = tot_imp = imp;
			if(i == 1) {
				maior_p = preco_final;
				menor_p = preco_final;
			}else {
				if(preco_final > maior_p) {
					maior_p = preco_final;
				}else if(preco_final < menor_p) {
					menor_p = preco_final;
				}
			}
		}
		adicional = adicional/12;
		System.out.println("O adicional é de: "+Math.round(adicional));
		System.out.println("O produto mais caro é: "+maior_p);
		System.out.println("O produto mais barato é: "+menor_p);
		System.out.println("O valor total de impostos é de: "+tot_imp);
		System.out.println("A quantidade de produtos baratos é de: "+qtd_b);
		System.out.println("A quantidade de produtos normais é de: "+qtd_n);
		System.out.println("A quantidade de produtos caros é de: "+qtd_c);

	}

}
