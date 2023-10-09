package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int nota_trab , aval_sem , exame , media;
Scanner sc = new Scanner(System.in);
System.out.println("Digite a nota do trabalho de laboratório: ");
nota_trab = sc.nextInt();
System.out.println("Digite a nota da avaliação semestral");
aval_sem = sc.nextInt();
System.out.println("Digite a nota do exame final");
exame = sc.nextInt();
media = (nota_trab * 2 + aval_sem * 3 + exame * 5)/10;
System.out.println("Media ponderada: " + media);
if(media >= 8 && media <= 10){
System.out.println("Obteve conceito A");
}
if(media >= 7 && media < 8){
System.out.println("Obteve conceito B");
}
if(media >= 6 && media < 7){
System.out.println("Obteve conceito C");
}
if(media >= 5 && media < 6 ){
System.out.println("Obteve conceito D");
}
if(media >= 0 && media < 5){
System.out.println("Obteve conceito E");
}
System.out.println("Fim do programa");
}
}
