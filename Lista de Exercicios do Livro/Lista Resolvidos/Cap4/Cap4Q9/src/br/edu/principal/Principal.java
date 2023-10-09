package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int t , d , dia , ano , hora , min , mes ;
Scanner sc = new Scanner(System.in);
System.out.println("Insira o valor da data atual");
System.out.println("Insira o valor do dia atual:");
dia = sc.nextInt();
System.out.println("Insira o valor mês atual:");
mes = sc.nextInt();
System.out.println("Digite o valor do ano atual");
ano = sc.nextInt();
System.out.println("Data atual: " + dia +"/" + mes + "/" + ano);
if(mes == 1){
System.out.println("Janeiro");
}
if(mes == 2){
System.out.println("Fevereiro");
}
if(mes == 3){
System.out.println("Março");
}
if(mes == 4){
System.out.println("Abril");
}
if(mes == 5){
System.out.println("Maio");
}
if(mes == 6){
System.out.println("Junho");
}
if(mes == 7){
System.out.println("Julho");
}
if(mes == 8){
System.out.println("Agosto");
}
if(mes == 9){
System.out.println("setembro");
}
if(mes == 10){
System.out.println("Outubro");
}
if(mes == 11){
System.out.println("Novembro");
}
if(mes == 12){
System.out.println("Dezembro");
}
System.out.println("Digite a hora atual:");
hora = sc.nextInt();
System.out.println("Digite os minutos atuais:");
min = sc.nextInt();
System.out.println("Horário atual:");
System.out.println(hora + ":" + min);
}
}