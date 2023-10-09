package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, ind; double tot_geral, tot_vend, comissao, maior;
		int[] qtd = new int[11]; double[] preco = new double[11];
		tot_geral = 0;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i<=10; i++) {
			System.out.println("Digite a quantidade vendida do "+i+"° produto: ");
			qtd[i] = sc.nextInt();
			System.out.println("Digite o preço do "+i+"° produto: ");
			preco[i] = sc.nextDouble();
		}
		for(i = 1; i<=10; i++) {
			tot_vend = qtd[i] * preco[i];
			System.out.println("A quantidade do "+i+"° produto é de: "+qtd[i]);
			System.out.println("O preço do "+i+"° produto é de: "+preco[i]);
			System.out.println("O total de vendas do produto "+i+"° foi de: "+tot_vend);
			tot_geral = tot_geral + tot_vend;
		}
		comissao = tot_geral * 5/100;
		System.out.println("O total geral foi de: "+tot_geral);
		System.out.println("A comissão do foi de: "+comissao);
		maior = qtd[1];
		ind = 1;
		for(i = 2; i<=10; i++) {
			if(qtd[i] > maior) {
				maior = qtd[i];
				ind = i;
			}
		}
		System.out.println("O maior preço foi do produto: "+preco[ind]+" e sua posição: "+ind);

	}

}
