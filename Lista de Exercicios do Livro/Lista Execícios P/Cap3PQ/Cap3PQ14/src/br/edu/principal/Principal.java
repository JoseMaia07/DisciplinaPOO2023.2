package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       int ano_nas , ano_at , id_anos , id_meses , id_dias , id_sema;
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite seu ano de nascimento, por favor:");
       ano_nas = sc.nextInt();
       System.out.println("Digite o ano atual: ");
       ano_at = sc.nextInt();
       id_anos = ano_at - ano_nas;
       id_meses = id_anos * 12;
       id_dias = id_anos * 365;
       id_sema = id_dias/7;
       System.out.println("Sua idade em anos é " + id_anos);
       System.out.println("Sua idade em meses é " + id_meses);
       System.out.println("Sua idade em semanas é " + id_sema);
       System.out.println("Sua idade em dias é " + id_dias);
      }
}
