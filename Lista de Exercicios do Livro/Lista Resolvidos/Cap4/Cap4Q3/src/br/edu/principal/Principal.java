package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int num1 , num2;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o primeiro número: ");
num1 = sc.nextInt();
System.out.println("Digite o segundo número: ");
num2 = sc.nextInt();
if(num1 > num2){
System.out.println("O maior número é "+ num1);
}
if(num2 > num1){
System.out.println("O maior número é "+ num2);
}
if(num1 == num2){
System.out.println("Os dois números são iguais");
}
}
}