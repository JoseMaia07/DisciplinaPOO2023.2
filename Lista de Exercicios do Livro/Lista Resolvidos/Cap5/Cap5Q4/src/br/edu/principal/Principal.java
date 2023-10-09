package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont, cod, num_vei, num_acid, 
		maior, cid_maior, menor, cid_menor, 
		media_vei, soma_vei, media_acid, soma_acid, cont_acid;
		Scanner sc = new Scanner(System.in);
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		maior = 0;
		menor = 0;
		cid_maior = 0;
		cid_menor = 0;
		for(cont = 1; cont <=5; cont++) {
			System.out.println("Digite o código da "+cont+"° cidade: ");
			cod = sc.nextInt();
			System.out.println("Digite o número de veículos da "+cont+"° cidade: ");
			num_vei = sc.nextInt();
			System.out.println("Digite o número de acidentes de trânsito da "+cont+"° cidade: ");
			num_acid = sc.nextInt();	
			if(cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			}else {
				if(num_acid > maior) {
					maior = num_acid;
					cid_maior = cod;
				}
				if(num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
				}
				soma_vei = soma_vei + num_vei;
			}
			if(num_vei < 2000) {
				soma_acid = soma_acid + num_acid;
				cont_acid = cont_acid + 1;
			}
			
			
		}
		System.out.println("O maior número de acidentes é de: "+maior+" pertencentes a cidade "+ cid_maior);
		System.out.println("O menor número de acidentes é de: "+menor+" pertencentes a cidade "+ cid_menor);
		media_vei = soma_vei/5;
		System.out.println("A média de veículos entre as cinco cidades é de: "+media_vei);
		if(cont_acid == 0) {
			System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
		}else {
			media_acid = soma_acid/cont_acid;
			System.out.println("A média de acidentes entre as cinco cidades é de: "+media_acid);
		}

	}

}
