package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_b, sal_l, media_m, media_f, num_h; int cod, cont_m, cont_f;
		String sexo;
		Scanner sc = new Scanner(System.in);
		cont_m = 0;
		cont_f = 0;
		media_m = 0;
		media_f = 0;
		sal_l = 0;
		System.out.println("Digite o código: ");
		cod = sc.nextInt();
		while(cod != 0) {
			System.out.println("Digite o sexo M ou F: ");
			sexo = sc.next();
			System.out.println("Digite o número de horas: ");
			num_h = sc.nextDouble();
			sal_b = num_h * 30;
			if(sexo.equals("M")) {
				sal_l = sal_b - (sal_b * 10/100);
				media_m = media_m + sal_l;
				cont_m = cont_m + 1;
			}else if(sexo.equals("F")) {
				sal_l = sal_b - (sal_b * 5/100);
				media_f = media_f + sal_l;
				cont_f = cont_f + 1;
			}
			System.out.println("O código é: "+cod);
			System.out.println("O salário bruto é de: "+sal_b);
			System.out.println("O salário líquido é de: "+sal_l);
			System.out.println("Digite o código ou 0 para encerrar: ");
			cod = sc.nextInt();
			
		}
		if(cont_m == 0) {
			System.out.println("Nenhum professor");
		}else {
			media_m = media_m/cont_m;
			System.out.println("A média dos salários do professores é de: "+media_m);
		}
		if(cont_f == 0) {
			System.out.println("Nenhuma professora");
		}else {
			media_f = media_f/cont_f;
			System.out.println("A média dos salários das professoras é de: "+media_f);
		}

	}

}
