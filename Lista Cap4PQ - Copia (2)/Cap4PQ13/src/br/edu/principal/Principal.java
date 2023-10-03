package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int novo_preco; String cfc; double preco;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o preço do produto: ");
		preco = sc.nextDouble();
		if(preco <= 50) {
			novo_preco = (int) Math.round(preco + (preco*5/100));
			System.out.println("O novo preço com o aumento é de "+novo_preco);
			if(novo_preco <= 80) {
				cfc = "Barato";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>80 && preco<=120){
				cfc = "Normal";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>120 && preco <=200) {
				cfc = "Caro";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>200) {
				cfc = "Muito caro";
				System.out.println("O preço do produto é "+cfc);
			}
		}else if(preco>50 && preco<=100) {
			novo_preco = (int) Math.round(preco + (preco*10/100));
			System.out.println("O novo preço com o aumento é de "+novo_preco);
			if(novo_preco <= 80) {
				cfc = "Barato";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>80 && preco<=120){
				cfc = "Normal";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>120 && preco <=200) {
				cfc = "Caro";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>200) {
				cfc = "Muito caro";
				System.out.println("O preço do produto é "+cfc);
			}
		}else if(preco>100) {
			novo_preco = (int) Math.round(preco + (preco*15/100));
			System.out.println("O novo preço com o aumento é de "+novo_preco);
			if(novo_preco <= 80) {
				cfc = "Barato";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>80 && preco<=120){
				cfc = "Normal";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>120 && preco <=200) {
				cfc = "Caro";
				System.out.println("O preço do produto é "+cfc);
			}else if(novo_preco>200) {
				cfc = "Muito caro";
				System.out.println("O preço do produto é "+cfc);
			}
		}

	}

}
