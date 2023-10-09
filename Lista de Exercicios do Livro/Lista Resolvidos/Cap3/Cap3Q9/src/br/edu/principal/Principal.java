package br.edu.principal;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Este programa calcula a área de triângulo: ");
double base , altura , area;
System.out.println("Digite a base: ");
base = sc.nextDouble();
System.out.println("Digite a altura: ");
altura = sc.nextDouble();
area = (base * altura)/2;
System.out.println("A área é " + Math.round(area));
System.out.println("Fim do programa");
}
}