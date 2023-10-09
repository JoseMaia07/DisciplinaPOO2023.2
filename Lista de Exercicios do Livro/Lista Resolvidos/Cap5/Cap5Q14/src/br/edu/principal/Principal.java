package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int valor_inicial, juros, valor_parc, total, valor_juros, num_parc, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor incial da dívida");
		valor_inicial = sc.nextInt();
		juros = 0;
		num_parc = 1;
		total = valor_inicial;
		valor_parc = valor_inicial;
		System.out.println("O valor do total é: "+total);
		System.out.println("O valor dos juros são: "+juros);
		System.out.println("O número de parcelas são: "+num_parc);
		System.out.println("O valor da parcela é: "+valor_parc);
		juros = juros + 10;
		num_parc = num_parc + 2;
		for(i=1;i<=4;i++) {
			valor_juros = valor_inicial * juros/100;
			total = valor_inicial + valor_juros;
			valor_parc = total/num_parc;
			System.out.println("O valor do total é: "+total);
			System.out.println("O valor dos juros são: "+juros);
			System.out.println("O número de parcelas são: "+num_parc);
			System.out.println("O valor da parcela é: "+valor_parc);
			juros = juros + 5;
			num_parc = num_parc + 3;
		}
		
		

	}

}