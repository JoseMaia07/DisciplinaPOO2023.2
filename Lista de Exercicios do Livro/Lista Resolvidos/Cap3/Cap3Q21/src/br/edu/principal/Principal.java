package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int x , z;
double y;
Scanner sc = new Scanner(System.in);
System.out.println("Forneça o tamanho da escada");
x = sc.nextInt();
System.out.println("Forneça a altura em que voce deseja pregar o quadro");
z = sc.nextInt();
y = Math.sqrt(Math.pow(z,2) - Math.pow(x,2));
// y = (Math.sqrt(y));
System.out.println("A distância que a escada deve estar da parede é " + y);
}
}