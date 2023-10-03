package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade; String categoria;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade do nadador: ");
		idade = sc.nextInt();
		if(idade<5) {
			System.out.println("Um bebê de "+idade+" anos não deve nem saber andar , imagine nadar");
		}else if(idade==5 && idade<=7) {
			categoria = "Infantil";
			System.out.println("A criança de "+idade+" anos está na categoria "+categoria);
		}else if(idade >=8 && idade<=10) {
			categoria = "Juvenil";
			System.out.println("A criança de "+idade+" anos está na categoria "+categoria);
		}else if(idade >=11 && idade<=15) {
			categoria = "Adolescente";
			System.out.println("O jovem de "+idade+" anos está na categoria "+categoria);
		}else if(idade >=16 && idade <=30) {
			categoria = "Adulto";
			System.out.println("O rapaz de "+idade+" anos está na categoria "+categoria);
		}else if(idade>30) {
			categoria = "Sênior";
			System.out.println("O senhor de "+idade+" anos está na categoria "+categoria);
		}
		

	}

}
