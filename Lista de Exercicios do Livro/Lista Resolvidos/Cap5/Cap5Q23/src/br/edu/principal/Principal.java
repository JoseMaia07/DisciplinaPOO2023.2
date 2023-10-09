package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int tipo; double sal, qtd, valor_kw, gasto, acresc, total, tot_gasto, qtd_cons, tot_geral;
		Scanner sc = new Scanner(System.in);
		tot_geral = 0;
		qtd_cons = 0;
		acresc = 0;
		System.out.println("Digite o salário: ");
		sal = sc.nextDouble();
		System.out.println("Digite a quantidade de quilo-watts: ");
		qtd = sc.nextDouble();
		valor_kw = sal/8;
		while(qtd != 0) {
			gasto = qtd * valor_kw;
			System.out.println("Digite o tipo de consumidor: 1, 2 ou 3");
			tipo = sc.nextInt();
			if(tipo == 1) {
				acresc = gasto * 5/100;
			}else if(tipo == 2) {
				acresc = gasto * 10/100;
			}else if(tipo == 3) {
				acresc = gasto * 15/100;
			}
			total = gasto + acresc;
			tot_geral = tot_geral + total;
			if(total >= 500 && total <=1000) {
				qtd_cons = qtd_cons +1;
			}
			System.out.println("O gasto é de: "+gasto);
			System.out.println("O acréscimo é de: "+acresc);
			System.out.println("O total foi de: "+total);
			System.out.println("Digite a quantidade de quilo-watts ou digite 0 para encerrar: ");
			qtd = sc.nextDouble();
		}
		System.out.println("O total geral foi de: "+tot_geral);
		System.out.println("A quantidade de quilo-watts consumida foi de: "+qtd_cons);
		
	}

}
