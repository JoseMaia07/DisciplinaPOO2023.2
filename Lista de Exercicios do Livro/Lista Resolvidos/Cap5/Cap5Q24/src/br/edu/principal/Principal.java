package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int op; double sal, imp, aum, novo_sal;
		Scanner sc = new Scanner(System.in);
		imp = 0;
		aum = 0;
		op = 0;
		while(op != 4){
			System.out.println("MENU DE OPÇÕES");
			System.out.println("1- Imposto");
			System.out.println("2- Novo Salário");
			System.out.println("3- Classificação");
			System.out.println("4- Finalizar o programa");
			System.out.println("Digite a opção desejada: ");
			op = sc.nextInt();
			if(op > 4 || op < 1) {
				System.out.println("Opção inválida!");
			}
			if(op == 1) {
				System.out.println("Digite o salário: ");
				sal = sc.nextDouble();
				if(sal < 500) {
					imp = sal * 5/100;
				}
				if(sal >= 500 && sal <= 850) {
					imp = sal * 10/100;
				}
				if(sal > 850) {
					imp = sal * 15/100;
				}
				System.out.println("O imposto é de: "+imp);
			}
			if(op == 2) {
				System.out.println("Digite o salário: ");
				sal = sc.nextDouble();
				if(sal > 1500) {
					aum = 25;
				}
				if(sal >= 750 && sal <= 1500) {
					aum = 50;
				}
				if(sal >= 450 && sal < 750) {
					aum = 75;
				}
				if(sal < 450) {
					aum = 100;
				}
				novo_sal = sal + aum;
				System.out.println("O novo salário, agora é de: "+novo_sal);
			}
			if(op == 3) {
				System.out.println("Digite o salário: ");
				sal = sc.nextDouble();
				if(sal <= 700) {
					System.out.println("Mal Remunerado");
				}else {
					System.out.println("Bem Remunerado");
				}
			}
			if(op == 4) {
				System.out.println("Finalizado");
			}
		}

	}

}
