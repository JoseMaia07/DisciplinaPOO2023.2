package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
int salario , aumento , cargo , novo_sal;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o cargo funcionário (1,2,3,4 ou 5)");
cargo = sc.nextInt();
System.out.println("Digite o valor do salário:");
salario = sc.nextInt();
if(cargo == 1){
System.out.println("O cargo é escrituário");
aumento = salario * 50/100;
System.out.println("O valor do aumento é: " + aumento);
novo_sal = salario + aumento;
System.out.println("O novo salário é: " + novo_sal);
}
else if(cargo == 2){
System.out.println("O cargo é secretário");
aumento = salario * 35/100;
System.out.println("O valor do aumento é: " + aumento);
novo_sal = salario + aumento;
System.out.println("O novo salário é: " + novo_sal);
}
else if(cargo == 3){
System.out.println("O cargo é caixa");
aumento = salario * 20/100;
System.out.println("O valor do aumento é: " + aumento);
novo_sal = salario + aumento;
System.out.println("O novo salário é: " + novo_sal);
}
else if(cargo == 4){
System.out.println("O cargo é gerente");
aumento = salario * 10/100;
System.out.println("O valor do aumento é: " + aumento);
novo_sal = salario + aumento;
System.out.println("O novo salário é: " + novo_sal);
}
else if(cargo == 5){
System.out.println("O cargo é diretor");
aumento = salario * 0/100;
System.out.println("O valor do aumento é: " + aumento);
novo_sal = salario + aumento;
System.out.println("O novo saláeio é :" + novo_sal);
}
else{
System.out.println("Cargo inexistente !!!");
}
}
}