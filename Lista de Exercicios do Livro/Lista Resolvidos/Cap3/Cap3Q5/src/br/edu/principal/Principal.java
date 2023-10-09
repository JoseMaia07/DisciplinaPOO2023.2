package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int sal, perc, aum, novosal;
Scanner sc = new Scanner(System.in);
System.out.println("Digite seu salário");
sal = sc.nextInt();
perc = 25;
aum = sal * perc/100;
System.out.println("O aumento foi de " + aum);
novosal = sal + aum;
System.out.println("O novo salário é de " + novosal);
System.out.println("obs: os dados são calculados com base no percentual de aumento que é 25");
}
}