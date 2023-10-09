package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int num1 , num2;
double r1 , r2;
System.out.println("Este programa eleva um número ao outro e vice versa");
Scanner sc = new Scanner(System.in);
System.out.println("Digite um primeiro número");
num1 = sc.nextInt();
System.out.println("Digite um segundo número");
num2 = sc.nextInt();
r1 = Math.pow(num1,num2);
r2 = Math.pow(num2,num1);
System.out.println("O primeiro número elevado ao segundo é " + r1);
System.out.println("O segundo número elevado ao primeiro é " + r2);
System.out.println("Fim do programa.");
}
}