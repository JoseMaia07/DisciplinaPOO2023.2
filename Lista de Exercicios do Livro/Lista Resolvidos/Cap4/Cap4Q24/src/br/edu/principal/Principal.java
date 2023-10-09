package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int pre, imposto, novo_pre, pre_custo, desconto;
String tipo, refrig;
double valor_adic;
System.out.println("Digite o preço do produto:");
pre = sc.nextInt();
System.out.println("Digite o tipo do produto (A, L e V):");
sc.nextLine();
tipo = sc.nextLine();
System.out.println("O produto precisa de refrigeração (S para sim ou N para não)?");
refrig = sc.nextLine();
if (refrig.equals("N")) {
if (tipo.equals("A")) {
if (pre < 15) {
valor_adic = 2;
} else {
valor_adic = 5;
}
} else {
valor_adic = 0;
}
} else if (tipo.equals("L")) {
if (pre < 10) {
valor_adic = 1.50;
} else {
valor_adic = 2.50;
}
} else if (tipo.equals("V")) {
if (pre < 30) {
valor_adic = 3;
} else if (pre < 50) {
valor_adic = 2.50;
} else {
valor_adic = 0;
}
} else {
valor_adic = 0;
}
System.out.println("O valor adicional é: " + valor_adic);
if (pre < 25) {
imposto = (int)(0.05 * pre);
} else {
imposto = (int)(0.08 * pre);
}
System.out.println("O imposto é: " + imposto);
pre_custo = pre + imposto;
System.out.println("O preço de custo é: " + pre_custo);
if (!tipo.equals("A") && !refrig.equals("S")) {
desconto = (int)(0.03 * pre_custo);
} else {
desconto = 0;
}
System.out.println("O desconto é: " + desconto);
novo_pre = pre_custo + (int)valor_adic - desconto;
System.out.println("O novo preço é: " + novo_pre);
if (novo_pre <= 50) {
System.out.println("Barato");
} else if (novo_pre > 50 && novo_pre <= 100) {
System.out.println("Normal");
} else {
System.out.println("Caro");
}
}
}