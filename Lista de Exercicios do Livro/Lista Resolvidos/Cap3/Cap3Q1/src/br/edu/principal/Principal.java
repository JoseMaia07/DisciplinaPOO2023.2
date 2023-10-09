package br.edu.principal;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
int n1, n2, n3, n4, soma;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o primeiro número: ");
n1 = sc.nextInt();
System.out.println("Digite o segundo número: ");
n2 = sc.nextInt();
System.out.println("Digite o terceiro número: ");
n3 = sc.nextInt();
System.out.println("Digite o quarto número: ");
n4 = sc.nextInt();
soma = n1 + n2 + n3 + n4;
System.out.println("a soma dos inteiros e igual a " + soma);
}
}