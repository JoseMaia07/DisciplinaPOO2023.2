package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int i , a;
double num , f;
Scanner sc = new Scanner(System.in);
System.out.println("Digite um número real:");
num = sc.nextInt();
i = (int) num;
f = num - i;
a = (int) Math.round(num);
System.out.println("A parte inteira desse número é " + i);
System.out.println("A parte fracionária desse número e " + f);
System.out.println("O arredondamento desse número é " + a);
}
}