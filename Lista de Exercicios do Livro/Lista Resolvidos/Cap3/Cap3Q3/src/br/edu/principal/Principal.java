package br.edu.principal;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
double nota1,nota2,nota3,soma1,soma2,soma3,total,media; int peso1, peso2, peso3;
Scanner sc = new Scanner(System.in);
System.out.println("Digite a nota 1: ");
nota1= sc.nextDouble();
System.out.println("Digite a nota 2: ");
nota2= sc.nextDouble();
System.out.println("Digite a nota 3: ");
nota3= sc.nextDouble();
System.out.println("Digite o peso da nota1: ");
peso1= sc.nextInt();
System.out.println("Digite o peso da nota2: ");
peso2= sc.nextInt();
System.out.println("Digite o peso da nota3: ");
peso3= sc.nextInt();
soma1= nota1 * peso1;
soma2= nota2 * peso2;
soma3= nota3 * peso2;
total = peso1 + peso2 + peso3;
media=(soma1 + soma2 + soma3)/total;
System.out.println("A média ponderada foi " + Math.round(media));
}
}