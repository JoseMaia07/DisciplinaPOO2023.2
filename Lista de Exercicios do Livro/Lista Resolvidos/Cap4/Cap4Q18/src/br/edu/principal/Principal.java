package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double x , y , z;
System.out.println("Digite um valor para X:");
x = sc.nextDouble();
System.out.println("Digite um valor para y:");
y = sc.nextDouble();
System.out.println("Digite um valor para z:");
z = sc.nextDouble();
if(x < y + z && y < x + z && z < x + y){
if(x == y && y == z){
System.out.println("Triângulo equilátero");
}
else if(x ==y || x == z || y == z){
System.out.println("Triângulo isósceles");
}
else{
System.out.println("Triângulo escaleno");
}
}
else{
System.out.println("Essas medidas não formam um triângulo");
}
}
}
