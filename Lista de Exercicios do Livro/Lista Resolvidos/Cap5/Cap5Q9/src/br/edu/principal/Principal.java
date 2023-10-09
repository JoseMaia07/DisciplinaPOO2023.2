package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont, ta = 0, te = 0, tr = 0; double n1, n2, media, media_classes, total_classes;
			total_classes = 0;
			Scanner sc = new Scanner(System.in);
			for(cont=1;cont<=6;cont++) {
				System.out.println("Digite a nota da n1: ");
				n1 = sc.nextDouble();
				System.out.println("Digite a nota da n2: ");
				n2 = sc.nextDouble();
				media = (n1 + n2)/2;
				System.out.println("A média foi de: "+Math.round(media));
				if(media <=3) {
					tr = tr +1;
					System.out.println("Reprovado");
				}
				if(media > 3 && media <7) {
					te = te + 1;
					System.out.println("Exame");
				}
				if(media >= 7) {
					ta = ta + 1;
					System.out.println("Aprovado");
				}
				total_classes = Math.round(total_classes + media);
			}
		System.out.println("O número de reprovados foram: "+tr);
		System.out.println("O número para exames foram: "+te);
		System.out.println("O número de aprovados foram: "+ta);
		media_classes = total_classes/6;
		System.out.println("A média da classe foi: "+Math.round(media_classes));

	}

}
