package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int peso_saco , racao_gato1 , racao_gato2 , total_final;
Scanner sc = new Scanner(System.in);
System.out.println("insira o peso do saco da ração");
peso_saco = sc.nextInt();
System.out.println("Coloque valor da quantidade de ração para o Manelitos(ou gato 1 se preferir)");
racao_gato1 = sc.nextInt();
System.out.println("Coloque o valor da quantidade de ração para o Apolo(ou gato 2 se preferir)");
racao_gato2 = sc.nextInt();
racao_gato1 = racao_gato1/1000;
racao_gato2 = racao_gato2/1000;
total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
System.out.println("O total restante de ração após cinco dias será " + total_final + " kg");
}
}