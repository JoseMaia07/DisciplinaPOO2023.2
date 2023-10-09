package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int hora , h , m , conversao;
Scanner sc = new Scanner(System.in);
System.out.println("Digite a hora desejada");
hora = sc.nextInt();
h = hora * 60;
m = hora % 60;
conversao = (h * 60) + m ;
System.out.println("A hora covertida em minutos é " + conversao);
}
}