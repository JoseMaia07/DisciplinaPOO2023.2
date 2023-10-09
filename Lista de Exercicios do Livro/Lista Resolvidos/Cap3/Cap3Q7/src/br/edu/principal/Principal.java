package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int sal, salreceber , imp;
Scanner sc = new Scanner(System.in);
System.out.println("Digite seu salário base");
sal = sc.nextInt();
imp = sal * 10/100;
salreceber = sal + 50 - imp;
System.out.println(" Seu salário a receber é " + salreceber);
System.out.println("Fim do programa.");
}
}