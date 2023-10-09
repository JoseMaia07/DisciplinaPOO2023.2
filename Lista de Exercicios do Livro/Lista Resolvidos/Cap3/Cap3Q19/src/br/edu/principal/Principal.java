package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int qtd_degraus , a_degraus , a_usuario ;
Scanner sc = new Scanner(System.in);
System.out.println("Insira o valor da altura dos degraus em metros");
a_degraus = sc.nextInt();
System.out.println("Insira o valor da altura que você quer atingir em metros");
a_usuario = sc.nextInt();
qtd_degraus = a_usuario / a_degraus;
System.out.println("você deve subir " + qtd_degraus +" degrau(s) para atingir seu objetivo");
}
}