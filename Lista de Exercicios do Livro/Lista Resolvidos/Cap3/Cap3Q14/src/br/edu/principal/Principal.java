package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int ano_at , ano_nas , id_at ,id_2050;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o ano atual ");
ano_at = sc.nextInt();
System.out.println("Digite o ano em que você nasceu ");
ano_nas = sc.nextInt();
id_at = ano_at - ano_nas;
id_2050 = 2050 - ano_nas;
System.out.println("Sua idade atual é " + id_at + " anos");
System.out.println("Sua idade em 2050 será " + id_2050 + " anos");
}
}
