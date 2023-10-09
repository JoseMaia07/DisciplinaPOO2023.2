package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int sal, salreceber, grat , imp;
Scanner sc = new Scanner(System.in);
System.out.println("Digite seu salário base");
sal = sc.nextInt();
grat = sal * 5/100;
imp = sal * 7/100;
salreceber = sal + grat - imp;
System.out.println("O salário a receber é "+ salreceber);
System.out.println("Fim do programa");
}
}