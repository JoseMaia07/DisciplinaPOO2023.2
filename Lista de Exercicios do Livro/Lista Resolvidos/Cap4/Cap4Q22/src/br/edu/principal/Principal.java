package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int sal_base, tempo, imposto, grat, sal_liq;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o valor do seu salário base:");
sal_base = sc.nextInt();
System.out.println("Digite o tempo de serviço trabalhado:");
tempo = sc.nextInt();
if (sal_base < 200) {
imposto = 0;
} else if (sal_base <= 450) {
imposto = (int) (0.03 * sal_base);
} else if (sal_base < 700) {
imposto = (int) (0.08 * sal_base);
} else {
imposto = (int) (0.12 * sal_base);
}
System.out.println("O imposto é: " + imposto);
if (sal_base > 500) {
if (tempo <= 3) {
grat = 20;
} else {
grat = 30;
}
} else {
if (tempo <= 3) {
grat = 23;
} else if (tempo < 6) {
grat = 35;
} else {
grat = 33;
}
}
System.out.println("A gratificação é: " + grat);
sal_liq = sal_base - imposto + grat;
System.out.println("O salário líquido é: " + sal_liq);
if (sal_liq <= 350) {
System.out.println("Classificação A");
} else if (sal_liq < 600) {
System.out.println("Classificação B");
} else {
System.out.println("Classificação C");
}
}
}
