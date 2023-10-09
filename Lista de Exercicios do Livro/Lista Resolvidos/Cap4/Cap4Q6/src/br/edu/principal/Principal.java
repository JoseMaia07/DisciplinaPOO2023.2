package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int num , r;
Scanner sc = new Scanner(System.in);
System.out.println("Bem-vindo, este programa determina se um numero e impar ou par");
System.out.println("Digite um numero:");
num = sc.nextInt();
r = (num%2);
if(r == 0){
System.out.println("O numero e par.");
}else{
System.out.println("O numero e impar");
}
}
}
