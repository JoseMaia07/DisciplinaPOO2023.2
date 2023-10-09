package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite a medida do ângulo em graus: ");
int angulo = scanner.nextInt();
int voltas;
if (angulo > 360 || angulo < -360) {
voltas = angulo / 360;
angulo = angulo % 360;
} else {
voltas = 0;
}
if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360
|| angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
System.out.println("Está em cima de algum dos eixos");
} else if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
System.out.println("1º Quadrante");
} else if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
System.out.println("2º Quadrante");
} else if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
System.out.println("3º Quadrante");
} else if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
System.out.println("4º Quadrante");
}
System.out.println(voltas + " volta(s) no sentido " + (angulo < 0 ? "horário" : "anti-horário"));
}
}