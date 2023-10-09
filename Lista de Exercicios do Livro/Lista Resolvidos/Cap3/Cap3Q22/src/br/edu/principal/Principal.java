package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int vlr_sal , qtd_kw , vlr_kw , vlr_reais , desc , vlr_desc;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o valor do seu salário: ");
vlr_sal = sc.nextInt();
System.out.println("Digite a quantidade de quilowatts consumida: ");
qtd_kw = sc.nextInt();
vlr_kw = vlr_sal / 5;
vlr_reais = vlr_kw * qtd_kw;
desc = vlr_reais * 15/100;
vlr_desc = vlr_reais - desc;
System.out.println("O valor de cada quilowatts é " + vlr_kw);
System.out.println("O valor a ser pago por essa residência é " + vlr_reais);
System.out.println("O valor a ser pago com desconto de 15 % é " + vlr_desc);
}
}