package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int op, sal, imp, aum, novo_sal;
System.out.println("Menu de opções");
System.out.println("Digite o valor correspodente as ações a seguir: ");
Scanner sc = new Scanner(System.in);
System.out.println("1- Imposto");
System.out.println("2- Aumento Salarial");
System.out.println("3- Classificação Salarial");
System.out.println("Digite um número: ");
op = sc.nextInt();
//Opção 1: Imposto
if(op == 1) {
System.out.println("Digite o salário: ");
sal = sc.nextInt();
if(sal < 500) {
imp = sal * (5/100);
System.out.println("O imposto foi de: "+imp+" Correspodente a: "+sal+" + 5%");
}
if(sal >= 500 && sal <=850) {
imp = sal * (10/100);
System.out.println("O imposto foi de: "+imp+" Correspodente a: "+sal+" + 10%");
}
if(sal > 850) {
imp = sal * (15/100);
System.out.println("O imposto foi de: "+imp+" Correspodente a: "+sal+" + 15%");
}
}
//Opção 2: Aumento
if(op == 2) {
System.out.println("Digite o salário: ");
sal = sc.nextInt();
if(sal > 1500) {
aum = 25;
System.out.println("O aumento foi de: "+aum+" Reais");
}
if(sal >= 750 && sal <= 1500) {
aum = 50;
System.out.println("O aumento foi de: "+aum+" Reais");
}
if(sal >= 450 && sal < 750) {
aum = 75;
System.out.println("O aumento foi de: "+aum+" Reais");
}
if(sal < 450) {
aum = 100; novo_sal = sal + aum;
System.out.println("O novo salário com aumento é de: "+novo_sal+" Reais");
}
}
//Opção 3: Classificação
if(op == 3) {
System.out.println("Digite o salário: ");
sal = sc.nextInt();
if(sal <= 700) {
System.out.println("Mal Remunerado.");
}
if(sal > 700) {
System.out.println("Bem Remunerado.");
}
}
if(op < 1 || op > 3) {
System.out.println("Opção inválida. Digite apenas as opções mostradas e recomeçe o programa.");
}
}
}