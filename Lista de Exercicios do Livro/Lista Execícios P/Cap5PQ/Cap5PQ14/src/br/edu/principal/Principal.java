package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int espec, op, idade, i, s_idade, m_idade, n_idade, n_bons, p_bons, n_regular;
		espec = 15;
		s_idade =0;
		n_idade = 0;
		n_bons = 0;
		n_regular = 0;
		Scanner sc = new Scanner(System.in);
		for(i=1; i<=15; i++) {
			System.out.println("Digite a idade do "+i+"° espectador: ");
			idade = sc.nextInt();
			System.out.println("Digite a opnião do "+i+"° espectador: ");
			op = sc.nextInt();
			if(op==3) {
				s_idade += idade;
				n_idade++;
			}
			if(op==2) {
				n_bons++;
			}
			if(op==1) {
				n_regular++;
			}
		}
		if(n_idade >0) {
			m_idade = s_idade/n_idade;
			System.out.println("A média das idades de quem disse "+"Ótimo"+" foi de "+m_idade);
		}
		p_bons = (n_bons * 100)/15;
		System.out.println("A quantidade de pessoas que disseram "+"Regular"+" foi de "+n_regular);
		System.out.println("A porcentagem de quem disse "+"Bom"+" foi cerca de "+p_bons+"%");

	}

}
