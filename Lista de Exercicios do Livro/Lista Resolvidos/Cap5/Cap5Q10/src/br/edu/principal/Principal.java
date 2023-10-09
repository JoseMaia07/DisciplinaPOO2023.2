package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont_time, cont_jog, idade, qtde, tot80; double peso, altura, media_altura, media_idade, porc;
		Scanner sc = new Scanner(System.in);
		qtde = 0;
		tot80 = 0;
		media_altura = 0;
		for(cont_time = 1; cont_time <= 5; cont_time++) {
			media_idade = 0;
			for(cont_jog = 1; cont_jog <= 11; cont_jog++) {
				System.out.println("Digite a idade do "+cont_jog+"° jogador: ");
				idade = sc.nextInt();
				System.out.println("Digite o peso em quilos do "+cont_jog+"° jogador: ");
				peso = sc.nextDouble();
				System.out.println("Digite a altura em metros do "+cont_jog+"° jogador: ");
				altura = sc.nextDouble();
				if(idade<18) {
					qtde = qtde + 1;
					media_idade = media_idade + idade;
					media_altura = media_altura + altura;
					if(peso > 80) {
						tot80 = tot80 + 1;
					}
				}
				
			}
			media_idade = media_idade/11;
			System.out.println("A média das idades dos jogadores do "+cont_time+"° time é: "+media_idade);
		
		}
		System.out.println("A quantidade de jogadores com idade inferior a 18 anos é: "+qtde);
		media_altura = media_altura/55;
		System.out.println("A média das alturas dos jogadores é: "+Math.round(media_altura));
		porc = tot80 * 100/55;
		System.out.println("A porcentagem dos jogadores com mais de 80kg é de: "+porc+"%");

	}

}
