package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int custo, convite , qtd;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o custo do espetáculo teatral");
custo = sc.nextInt();
System.out.println("Digite o preço do convite desse espetáculo teatral");
convite = sc.nextInt();
qtd = custo/convite;
System.out.println("A quantidade de convites que deve ser vendida para pelo menos alcançar o custo do espetáculo é " + qtd);
}
}