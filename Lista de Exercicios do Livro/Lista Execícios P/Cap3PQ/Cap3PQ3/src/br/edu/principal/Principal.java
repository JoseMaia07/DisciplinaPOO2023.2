package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		double num1 , num2 , divisao;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro número");
	num1 = sc.nextDouble();
	System.out.println("Digite o segundo número(obs: não pode ser zero)");
	num2 = sc.nextDouble();
	if(num2 != 0){
		divisao = num1/num2;
	System.out.println("O resultado da divisão é: " + divisao);
	}else{
		System.out.println("Impossível dividir por zero. Insira outro valor.");

	}

}
}