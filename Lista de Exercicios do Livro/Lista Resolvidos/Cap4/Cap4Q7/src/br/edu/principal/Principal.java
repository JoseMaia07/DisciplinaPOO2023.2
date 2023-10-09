package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int a, b, c, i;
Scanner sc = new Scanner(System.in);
System.out.println("Digite um valor para A:");
a = sc.nextInt();
System.out.println("Digite um valor para B:");
b = sc.nextInt();
System.out.println("Digite um valor para C:");
c = sc.nextInt();
System.out.println("Para finalizar digite um valor para I (obs: Apenas os valores 1, 2, 3):");
i = sc.nextInt();
if (i == 1) {
if (a < b && a < c) {
if (b < c) {
System.out.println("A ordem crescente dos números é: " + a + "-" + b + "-" + c);
} else {
System.out.println("A ordem crescente dos números é: " + a + "-" + c + "-" + b);
}
} else if (b < a && b < c) {
if (a < c) {
System.out.println("A ordem crescente dos números é: " + b + "-" + a + "-" + c);
} else {
System.out.println("A ordem crescente dos números é: " + b + "-" + c + "-" + a);
}
} else if (c < a && c < b) {
if (a < b) {
System.out.println("A ordem crescente dos números é: " + c + "-" + a + "-" + b);
} else {
System.out.println("A ordem crescente dos números é: " + c + "-" + b + "-" + a);
}
}
} else if (i == 2) {
if (a > b && a > c) {
if (b > c) {
System.out.println("A ordem decrescente dos números é: " + a + "-" + b + "-" + c);
} else {
System.out.println("A ordem decrescente dos números é: " + a + "-" + c + "-" + b);
}
} else if (b > a && b > c) {
if (a > c) {
System.out.println("A ordem decrescente dos números é: " + b + "-" + a + "-" + c);
} else {
System.out.println("A ordem decrescente dos números é: " + b + "-" + c + "-" + a);
}
} else if (c > a && c > b) {
if (a > b) {
System.out.println("A ordem decrescente dos números é: " + c + "-" + a + "-" + b);
} else {
System.out.println("A ordem decrescente dos números é: " + c + "-" + b + "-" + a);
}
}
} else if (i == 3) {
if (a < b && a < c) {
System.out.println("A ordem desejada dos números é: " + b + "-" + a + "-" + c);
} else if (b < a && b < c) {
System.out.println("A ordem desejada dos números é: " + a + "-" + b + "-" + c);
} else if (c < a && c < b) {
System.out.println("A ordem desejada dos números é: " + a + "-" + c + "-" + b);
}
} else {
System.out.println("Opção inválida. Escolha 1, 2 ou 3.");
}
sc.close();
}
}
