package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int cod_est , cod_carga , peso_toneladas , peso_quilos , pre_carga =0 , imposto =0 ,
valor_total ;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o código de estado:");
cod_est = sc.nextInt();
System.out.println("Digite o peso da carga em toneladas:");
peso_toneladas = sc.nextInt();
System.out.println("Digite o código da carga:");
cod_carga = sc.nextInt();
peso_quilos = peso_toneladas * 1000;
System.out.println("O peso em quilos é: " + peso_quilos);
if(cod_carga >= 10 && cod_carga <= 20){
pre_carga = 100 * peso_quilos;
}
if(cod_carga >= 21 && cod_carga <= 30){
pre_carga = 250 * peso_quilos;
}
if(cod_carga >= 31 && cod_carga <=40){
pre_carga = 340 * peso_quilos;
}
System.out.println("O preço da carga por quilo é: " + pre_carga);
if(cod_est == 1){
imposto = 35/100 * pre_carga;
}
if(cod_est == 2){
imposto = 25/100 * pre_carga;
}
if(cod_est == 3){
imposto = 15/100 * pre_carga;
}
if(cod_est == 4){
imposto = 5/100 * pre_carga;
}
if(cod_est == 5){
imposto = 0;
}
System.out.println("O valor do imposto é: " + imposto);
valor_total = pre_carga + imposto;
System.out.println("O valor total é: " + valor_total);
}
}