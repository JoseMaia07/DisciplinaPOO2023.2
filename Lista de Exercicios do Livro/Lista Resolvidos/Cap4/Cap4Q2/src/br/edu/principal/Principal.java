package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int nt1 , nt2 , nt3, media , nt_exame;
Scanner sc = new Scanner(System.in);
System.out.println("Digite a nota da primeira prova:");
nt1 = sc.nextInt();
System.out.println("Digite a nota da segunda prova:");
nt2 = sc.nextInt();
System.out.println("Digite a nota da terceira prova:");;
nt3 = sc.nextInt();
media = (nt1 + nt2 +nt3)/3;
System.out.println("Sua média aritmética é de: " + media);
if(media >=0 && media < 3){
System.out.println("Reprovado. Torça pra pegar um professor e estude mais");
}
if(media >= 3 && media < 7){
System.out.println("Exame final.");
nt_exame = 12 - media;
System.out.println("Você deve tirar "+ nt_exame +" para passar. É agora ou só próximo semestre, então estude o máximo que puder para passar, boa sorte!");
}
if(media >= 7 && media <=10 ){
System.out.println("Aprovado. Você passou com louvor, parabéns.");
}
}
}