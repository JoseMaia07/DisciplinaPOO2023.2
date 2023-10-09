
package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int cont, codigo, nht, valor, sal_min, sal_inicial, aux, sal_final;
        String turno, categoria;
        sal_min = 450;
        Scanner sc = new Scanner(System.in);
        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Digite o código: ");
            codigo = sc.nextInt();
            System.out.println("Digite o número de horas trabalhadas: ");
            nht = sc.nextInt();
            System.out.println("Digite o turno: M, V ou N");
            turno = sc.next();
            System.out.println("Digite sua categoria: G ou O");
            categoria = sc.next();
            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) { 
                turno = sc.next();
            }
            while (!categoria.equals("G") && !categoria.equals("O")) { 
                categoria = sc.next();
            }
            if (categoria.equals("G")) { 
                if (turno.equals("N")) { 
                    valor = sal_min * 18 / 100;
                } else {
                    valor = sal_min * 15 / 100;
                }
            } else {
                if (turno.equals("N")) { 
                    valor = sal_min * 13 / 100;
                } else {
                    valor = sal_min * 10 / 100;
                }
            }
            sal_inicial = nht * valor;
            if (sal_inicial <= 300) {
                aux = sal_inicial * 20 / 100;
            } else if (sal_inicial < 600) {
                aux = sal_inicial * 15 / 100;
            } else {
                aux = sal_inicial * 5 / 100;
            }
            sal_final = sal_inicial + aux;
            System.out.println("O código é: " + codigo);
            System.out.println("O número de horas trabalhadas é: " + nht);
            System.out.println("O valor das horas é: " + valor);
            System.out.println("O salário inicial é de: " + sal_inicial);
            System.out.println("O valor do auxílio alimentação é de: " + aux);
            System.out.println("Por fim, o salário final é de: " + sal_final);
        }
    }
}


