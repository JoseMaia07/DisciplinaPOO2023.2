package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cod_origem; String proc; Double preco;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o preço do produto: ");
		preco = sc.nextDouble();
		System.out.println("Digite o código de origem do produto: ");
		cod_origem = sc.nextInt();
		if(cod_origem <1) {
			System.out.println("Código Inválido, verifique o código do produto e reinicie o programa");
		}else if(cod_origem==1) {
			proc = "Sul";
			System.out.println("O produto de preço "+preco+" Sua procedência é do "+proc);		
		}else if(cod_origem==2) {
			proc = "Norte";
			System.out.println("O produto de preço "+preco+"Sua procedência é do "+proc);
		}else if(cod_origem==3){
			proc = "Leste";
			System.out.println("O produto de preço "+preco+"Sua procedência é do "+proc);
		}else if(cod_origem==4){
			proc = "Oeste";
			System.out.println("O produto de preço "+preco+"Sua procedência é do "+proc);
		}else if(cod_origem== 5 || cod_origem == 6) {
			proc = "Nordeste";
			System.out.println("O produto de preço "+preco+"Sua procedência é do "+proc);
		}else if(cod_origem== 7 || cod_origem == 8 || cod_origem == 9) {
			proc = "Sudeste";
			System.out.println("O produto de preço "+preco+"Sua procedência é do "+proc);
		}else if(cod_origem>= 10 && cod_origem <= 20) {
			proc = "Centro-oeste";
			System.out.println("O produto de preço "+preco+"Sua procedência é do "+proc);
		}else if(cod_origem>= 21 && cod_origem <= 30) {
			proc = "Noroeste";
			System.out.println("O produto de preço "+preco+"Sua procedência é do "+proc);
		}else if(cod_origem> 30) {
			System.out.println("Código Inválido, verifique o código do produto e reinicie o programa");
		}
	}
}