package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int h, hm, n_hextras, n_hfaltas, premio; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de horas extras que o funcionário trabalhou: ");
		n_hextras = sc.nextInt();
		System.out.println("Digite o número de horas que o funcionário faltou: ");
		n_hfaltas = sc.nextInt();
		h = n_hextras - (2/3 *n_hfaltas);
		hm = h * 60;
		System.out.println("O funcionário ficou com "+hm+" minutos em H");
		if(hm >=2400) {
			premio = 500;
			System.out.println("O funcionário ganhou "+premio+" em reais de gratificação");
		}else if(hm >= 1800 && hm < 2400) {
			premio = 400;
			System.out.println("O funcionário ganhou "+premio+" em reais de gratificação");
		}else if(hm >= 1200 && hm < 1800) {
			premio = 300;
			System.out.println("O funcionário ganhou "+premio+" em reais de gratificação");
		}else if(hm >= 600 && hm < 1200) {
			premio = 200;
			System.out.println("O funcionário ganhou "+premio+" em reais de gratificação");
		}else if(hm < 600) {
			premio = 100;
			System.out.println("O funcionário ganhou "+premio+" em reais de gratificação");
		}

	}

}
