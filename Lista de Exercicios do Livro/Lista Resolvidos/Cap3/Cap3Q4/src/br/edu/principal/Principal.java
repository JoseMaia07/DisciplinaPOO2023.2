package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int sal, novosal;
Scanner sc = new Scanner(System.in);
System.out.println("Digite seu salario (obs: use vírgula ao invés de ponto caso seja um número de quatro casas ou mais");
sal = sc.nextInt();
novosal = sal + sal * 25/100;
System.out.println("O novo salário é de " + novosal);
System.out.println("você teve um aumento de 25%");
System.out.println("Fim do programa");
}
}
