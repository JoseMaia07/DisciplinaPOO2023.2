package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String sexo_op; int num_op, pecas_op, num_maior, cont_m, cont_f, tot_pecas, cont; 
		double media_m, salario_maior, media_f, salario_op, tot_folha;
		Scanner sc = new Scanner(System.in);
	
		tot_folha = 0;
		tot_pecas = 0;
		media_m = 0;
		media_f = 0;
		cont_m = 0;
		cont_f = 0;
		salario_op = 0;
		salario_maior = 0;
		num_maior = 0;
		for(cont = 1; cont <= 15; cont++) {
			System.out.println("Digite o número do "+cont+"° operário: ");
			num_op = sc.nextInt();
			System.out.println("Digite o sexo do operário, M ou F: ");
			sexo_op = sc.next();
			System.out.println("Digite o total de peças fabricadas pelo "+cont+"° operário: ");
			pecas_op = sc.nextInt();
			if(pecas_op <= 30) {
				salario_op = 450;
			}else if(pecas_op > 30 && pecas_op <= 50) {
				salario_op = 450 + ((pecas_op - 30)* 3/100 * 450);
			}else if(pecas_op > 50) {
				salario_op = 450 + ((pecas_op - 30)* 5/100 * 450);
			}
			System.out.println("O operário "+num_op+" recebe "+salario_op+" de salário");
			tot_folha = tot_folha + salario_op;
			tot_pecas = tot_pecas + pecas_op;
			if(sexo_op.equals("M")) {
				media_m = media_m + pecas_op;
				cont_m = cont_m + 1;
			}else{
				media_f = media_f + pecas_op;
				cont_f = cont_f + 1;
			}
			if(cont == 1) {
				salario_maior = salario_op;
				num_maior = num_op;
			}else {
				if(salario_op > salario_maior) {
					salario_maior = salario_op;
					num_maior = num_op;
				}
			}
		}
		System.out.println("Total da folha de pagamento é de: "+tot_folha);
		System.out.println("Total de peças fabricadas no mês é de: "+tot_pecas);
		if(cont_m == 0) {
			System.out.println("NENHUM HOMEM");
		}else {
			media_m = media_m/cont_m;
			System.out.println("A média de peças fabricadas pelos operários homens é de: "+Math.round(media_m));
		}
		if(cont_f == 0) {
			System.out.println("NENHUMA MULHER");
		}else {
			media_f = media_f/cont_f;
			System.out.println("A média de peças fabricadas pelas operárias mulheres é de: "+Math.round(media_f));
		}
		System.out.println("O número do operário com maior salário é "+num_maior);

	}

}
