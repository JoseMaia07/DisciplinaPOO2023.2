package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int p_fab , perc_d , perc_i , vlr_i , vlr_d , p_final;
Scanner sc = new Scanner(System.in);
System.out.println("Insira o preço de fábrica");
p_fab = sc.nextInt();
System.out.println("Insira o percentual de lucro");
perc_d = sc.nextInt();
System.out.println("Insira o percentual de imposto");
perc_i = sc.nextInt();
vlr_d = p_fab * perc_d/100;
vlr_i = p_fab * perc_i/100;
p_final = p_fab + vlr_d - vlr_i;
System.out.println("O valor do lucro do distribuidor é " + vlr_d + "%");
System.out.println("O valor correspondente ao imposto é " + vlr_i + "%");
System.out.println("O preço final do veículo é " + p_final);
}
}
