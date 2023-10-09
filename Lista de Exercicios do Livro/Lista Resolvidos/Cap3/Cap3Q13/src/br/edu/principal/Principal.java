package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int pes , pole , jar , mil;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o valor da medida em pés");
pes = sc.nextInt();
pole = pes * 12;
jar = pes/3;
mil = jar/1760;
System.out.println("O valor em polegadas é " + pole);
System.out.println("O valor em jardas é " + jar);
System.out.println("O valor em milhas é " + mil);
}
}