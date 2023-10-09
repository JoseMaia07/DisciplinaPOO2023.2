package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int codpdt, codp, pesog, pesokg, imposto, prevtotal, prepg, vtotal;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o código do produto: ");
codpdt = sc.nextInt();
System.out.println("Digite o código do país de origem do produto: ");
codp = sc.nextInt();
System.out.println("Digite o peso em quilos do produto: ");
pesokg = sc.nextInt();
pesog = pesokg * 1000;
System.out.println("O peso em gramas do produto é: "+pesog);
if (codpdt >= 1 && codpdt <= 4) {
prepg = 10;
prevtotal = pesog * prepg;
System.out.println("O pré valor total é de: "+prevtotal);
if (codp == 1) {
imposto = 0;
System.out.println("O imposto é: "+imposto+", ou 0... que bom!");
vtotal = prevtotal + imposto;
System.out.println("O valor total é de: "+vtotal);
}
}
if (codpdt >= 5 && codpdt <= 7) {
prepg = 25;
prevtotal = pesog * prepg;
System.out.println("O pré valor total é de: "+prevtotal);
if (codp == 2) {
imposto = 15/100;
System.out.println("O imposto é: "+imposto+", ou 15%");
vtotal = prevtotal + imposto;
System.out.println("O valor total é de: "+vtotal);
}
}
if (codpdt >= 8 && codpdt <= 10) {
prepg = 35;
prevtotal = pesog * prepg;
System.out.println("O pré valor total é de: "+prevtotal);
if (codp == 3) {
imposto = 25/100;
System.out.println("O imposto é: "+imposto+", ou 25%");
vtotal = prevtotal + imposto;
System.out.println("O valor total é de: "+vtotal);
}
}
}
}