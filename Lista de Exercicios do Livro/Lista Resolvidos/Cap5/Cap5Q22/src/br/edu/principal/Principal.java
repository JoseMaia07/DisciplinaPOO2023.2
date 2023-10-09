package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade, tot, tot_f, tot_m, soma1, cont_m1, cont_m2, cont_f1, menor_idade, perc;
		double media_idade; String sexo, exp;
		Scanner sc = new Scanner(System.in);
		tot = 0;
		tot_f = 0;
		tot_m = 0;
		soma1 = 0;
		cont_m1 = 0;
		cont_m2 = 0;
		cont_f1 = 0;
		menor_idade = 0;
		System.out.println("Digite a idade do funcionário");
		idade = sc.nextInt();
		while(idade != 0) {
			System.out.println("Digite o sexo do funcionário, M ou F: ");
			sexo = sc.next();
			System.out.println("Digite se possui experiência, S ou N: ");
			exp = sc.next();
			if(sexo.equals("F") && exp.equals("S")) {
				if(tot == 0) {
					menor_idade = idade;
					tot = 1;
				}else if( idade < menor_idade) {
					menor_idade = idade;
				}
			}
			if(sexo.equals("M")) {
				tot_m = tot_m + 1;
			}
			if(sexo.equals("F")) {
				tot_f = tot_f + 1;
			}
			if(sexo.equals("F") && idade < 21 && exp.equals("S")) {
				cont_f1 = cont_f1 +1;
			}
			if(sexo.equals("M") && idade >45) {
				cont_m1 = cont_m1 + 1;
			}
			if(sexo.equals("M") && exp.equals("S")) {
				soma1 = soma1 + idade;
				cont_m2 = cont_m2 + 1;
			}
			System.out.println("Digite a idade do funcionário ou digite 0 para encerrar: ");
			idade = sc.nextInt();
		}
		System.out.println("O número de candidatas é de: "+tot_f);
		System.out.println("O número de candidatos é de: "+tot_m);
		if(cont_m2 == 0) {
			System.out.println("Nenhum candidato com experiência");
		}else {
			media_idade = soma1/cont_m2;
			System.out.println("A média de idade dos candidatos com experiência é de: "+media_idade);
		}
		if(tot_m == 0) {
			System.out.println("Nenhum candidato");
		}else {
			perc = cont_m1 * 100/tot_m;
			System.out.println("A porcentagem dos homens com idade maior de 45 anos entre o total é de: "+perc+"%");
		}
		System.out.println("O número de candidatas com idade inferior a 21 anos é de: "+cont_f1);
		System.out.println("A menor idade entre as candidatas com experiência é: "+menor_idade);

	}

}
