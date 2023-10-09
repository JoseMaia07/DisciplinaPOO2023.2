package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
// O dados são calculados a partir de uma base de valor 10.
int dep, taxa , renda , total;
Scanner sc = new Scanner(System.in);
System.out.println("por favor, digite o valor do depósito");
dep = sc.nextInt();
taxa = 10;
renda = dep * taxa/100;
total = dep + renda;
System.out.println("A renda adquirida foi " + renda);
System.out.println("O total foi de " + total);
}
}