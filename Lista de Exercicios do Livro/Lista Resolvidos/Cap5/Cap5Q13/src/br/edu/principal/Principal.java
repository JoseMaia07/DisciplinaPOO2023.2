package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, num_cri, meses, porc_f, porc_m, tot_f, tot_m, tot_24, porc_24;
		String sexo;
		Scanner sc = new Scanner(System.in);
		tot_m = 0;
		tot_f = 0;
		tot_24 = 0;
		
		System.out.println("Digite o número de crianças nascidas no período: ");
		num_cri = sc.nextInt();
		for(i = 1; i <= num_cri; i++) {
			System.out.println("Digite o sexo da "+i+"° criança: ");
			sexo = sc.next();
			System.out.println("Digite o tempo de vida (em meses) da "+i+"° criança: ");
			meses = sc.nextInt();
			if(sexo.equals("M")) {
				tot_m = tot_m + 1;
			}else if(sexo.equals("F")) {
				tot_f = tot_f + 1;
			}
			if(meses <=24) {
				tot_24 = tot_24 + 1;
			}
		}
		if(num_cri == 0) {
			System.out.println("NENHUMA CRIANÇA DIGITADA");
		}else {
			porc_m = tot_m * 100/num_cri;
			porc_f = tot_f * 100/num_cri;
			porc_24 = tot_24 * 100/num_cri;
			System.out.println("O Percentual de crianças mortas do sexo feminino é de "+porc_f+"%");
			System.out.println("O Percentual de crianças mortas do sexo masculino é de "+porc_m+"%");
			System.out.println("O Percentual de crianças mortas com 24 meses ou menos no período, é de "+porc_24+"%");
		}
				

	}

}
