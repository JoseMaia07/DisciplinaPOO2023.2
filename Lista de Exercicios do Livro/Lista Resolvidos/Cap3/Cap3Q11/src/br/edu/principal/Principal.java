package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int num;
double quad , cubo , r2 , r3;
System.out.println("Este programa calcula o quadrado, cubo , raiz quadrada e raiz cúbica de um número");
Scanner sc = new Scanner(System.in);
System.out.println("Digite um número");
num = sc.nextInt();
quad = Math.pow(num,2);
cubo = Math.pow(num,3);
r2 = Math.sqrt(num);
r3 = Math.cbrt(num);
System.out.println("O quadrado é " + quad);
System.out.println("O cubo é " + cubo);
System.out.println("A raiz quadrada é " + r2);
System.out.println("A raiz cúbica é " + r2);
}
}
