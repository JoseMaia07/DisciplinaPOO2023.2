package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int hrs_t , vlr_sal_min , vlr_hrs_t , vlr_sal_bru , imp , vlr_sal_l;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o número de horas trabalhadas");
hrs_t = sc.nextInt();
System.out.println("Digite o valor do salário mínimo");
vlr_sal_min = sc.nextInt();
vlr_hrs_t = vlr_sal_min/2;
vlr_sal_bru = vlr_hrs_t * hrs_t;
imp = vlr_sal_bru * 3/100;
vlr_sal_l = vlr_sal_bru - imp;
System.out.println("O valor do salário líquido é " + vlr_sal_l);
}
}