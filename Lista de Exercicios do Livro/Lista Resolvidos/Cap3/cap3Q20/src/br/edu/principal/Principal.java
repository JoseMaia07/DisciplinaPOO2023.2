package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int ang , alt ;
double escada , radiano;
Scanner sc = new Scanner(System.in);
System.out.println("Insira a medida do ângulo em graus");
ang = sc.nextInt();
System.out.println("Insira a altura da parede de onde está a ponta da escada");
alt = sc.nextInt();
radiano = Math.toRadians(ang);
escada = alt / Math.sin(radiano);
System.out.println("A medida da escada é " + escada);
}
}