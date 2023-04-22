package VariaveisEOperadores;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		System.out.println("Salario bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Horas Extras:");
		horasExtras = leia.nextFloat();
		System.out.println("Descontos:  ");
		descontos = leia.nextFloat();

		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.printf("Salario liquido: %.2f", salarioLiquido);

	}
}
