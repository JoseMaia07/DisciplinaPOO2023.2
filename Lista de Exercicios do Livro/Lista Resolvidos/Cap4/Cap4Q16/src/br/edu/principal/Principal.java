package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int pre, venda, novo_pre = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o preço do produto:");
pre = sc.nextInt();
System.out.println("Digite a média de venda mensal do produto:");
venda = sc.nextInt();
if (venda < 500 || pre < 30) {
novo_pre = pre + (10 * pre) / 100;
} else if ((venda >= 500 && venda < 1200) || (pre >= 30 && pre < 80)) {
novo_pre = pre + (15 * pre) / 100;
} else if (venda >= 1200 || pre >= 80) {
novo_pre = pre - (20 * pre) / 100;
}
System.out.println("O novo preço do produto é: " + novo_pre);
}
}
