package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int sal_min, nht, coeficiente = 0, sal_bruto = 0, imposto, grat, auxilio, sal_liq;
String turno, categoria;
System.out.println("Digite o valor do salário mínimo:");
sal_min = sc.nextInt();
sc.nextLine();
System.out.println("Digite seu turno (M, V ou N):");
turno = sc.nextLine();
System.out.println("Digite sua categoria (O para Operário ou G para Gerente):");
categoria = sc.nextLine();
System.out.println("Digite o número de horas trabalhadas:");
nht = sc.nextInt();
if (turno.equals("M")) {
coeficiente = (10 * sal_min) / 100;
} else if (turno.equals("V")) {
coeficiente = (15 * sal_min) / 100;
} else if (turno.equals("N")) {
coeficiente = (12 * sal_min) / 100;
System.out.println("O coeficiente é: " + coeficiente);
sal_bruto = nht * coeficiente;
System.out.println("O salário bruto é " + sal_bruto);
}
if (categoria.equals("O")) {
if (sal_bruto >= 300) {
imposto = (5 * sal_bruto) / 100;
} else {
imposto = (3 * sal_bruto) / 100;
}
if (sal_bruto >= 400) {
imposto = (6 * sal_bruto) / 100;
} else {
imposto = (4 * sal_bruto) / 100;
}
System.out.println("O imposto é: " + imposto);
if (turno.equals("N") && nht > 80) {
grat = 50;
} else {
grat = 30;
}
System.out.println("A gratificação é: " + grat);
if (categoria.equals("O") || coeficiente <= 25) {
auxilio = (sal_bruto * 1) / 3;
} else {
auxilio = (sal_bruto * 1) / 2;
}
System.out.println("O valor do auxílio é: " + auxilio);
sal_liq = sal_bruto - imposto + grat + auxilio;
System.out.println("O salário líquido é: " + sal_liq);
if (sal_liq < 350) {
System.out.println("Mal remunerado. Você é liso.");
} else if (sal_liq >= 350 && sal_liq <= 600) {
System.out.println("Normal. Para esses parâmetros você é neutro.");
} else {
System.out.println("Bem remunerado. Pelo visto você tem uma certa condição segundo este parâmetro.");
}
}
}
}