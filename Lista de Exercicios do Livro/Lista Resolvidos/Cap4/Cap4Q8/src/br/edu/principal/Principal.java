package br.edu.principal;
import java.util.Scanner;
class Principal {
public static void main(String[] args) {
int num1 , num2 , soma , op;
double raiz;
Scanner sc = new Scanner(System.in);
System.out.println("MENU");
System.out.println("1 - Somar dois números");
System.out.println("2 - Raiz quadrada de um número");
System.out.println("Digite sua opção");
op = sc.nextInt();
if(op == 1){
System.out.println("Escreva um valor para o primeiro número:");
num1 = sc.nextInt();
System.out.println("Escreva um valor para o segundo número:");
num2 = sc.nextInt();
soma = num1 + num2;
System.out.println("A soma de " + num1 + " e " + num2 + " é igual a: " + soma);
}
else if(op == 2){
System.out.println("Digite um valor:");
num1 = sc.nextInt();
raiz = Math.sqrt(num1);
System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
}else{
System.out.println("Opção inválida por favor, reinicie o programa e digite valores entre 1 e 2.");
}
}
}