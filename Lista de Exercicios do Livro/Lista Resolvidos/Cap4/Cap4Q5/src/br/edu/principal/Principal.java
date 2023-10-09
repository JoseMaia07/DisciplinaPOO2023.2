package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int num1 , num2 , num3 , num4;
Scanner sc = new Scanner(System.in);
System.out.println("Digite 3 números obrigatoriamente em crescente");
System.out.println("Digite o primeiro número:");
num1 = sc.nextInt();
System.out.println("Digite o segundo número:");
num2 = sc.nextInt();
System.out.println("Digite o terceiro número:");
num3 = sc.nextInt();
System.out.println("Agora pra finalizar digite um quarto número fora da ordem crescente");
num4 = sc.nextInt();
if(num4 > num3){
System.out.println("A ordem decrescente é " + num4 + "-" + num3 + "-" + num2 + "-" + num1);
}
if(num4 < num2 && num4 < num3){
System.out.println("A ordem decrescente é " + num3 + "-" + num4 + "-" + num2 + "-" + num1);
}
if(num4 < num1 && num4 < num2){
System.out.println("A ordem decrescente é " + num3 + "-" + num2 + "-" + num4 + "-" + num1);
}
if(num4 < num1){
System.out.println("A ordem decrescente é " + num3 + "-" + num2 + "-" + num1 + "-" + num4);
}
}
}
