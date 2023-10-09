package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
double altura , peso;
Scanner sc = new Scanner(System.in);
System.out.println("Digite sua altura:");
altura = sc.nextDouble();
System.out.println("Digite seu peso:");
peso = sc.nextDouble();
if(altura < 1.20){
if(peso <= 60){
System.out.println("A");
}
if(peso > 60 && peso <= 90){
System.out.println("D");
}
if(peso > 90){
System.out.println("G");
}
}
if(altura >= 1.20 && altura <= 1.70){
if(peso <= 60){
System.out.println("B");
}
if(peso > 60 && peso <= 90){
System.out.println("E");
}
if(peso > 90){
System.out.println("H");
}
}
if(altura > 1.70){
if(peso <= 60){
System.out.println("C");
}
if(peso > 60 && peso <= 90){
System.out.println("F");
}
if(peso > 90){
System.out.println("I");
}
}
}
}