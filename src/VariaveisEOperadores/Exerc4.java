package VariaveisEOperadores;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float n1, n2, n3, n4, calculo;

		System.out.println("Digite 4 numeros");
		System.out.println("Numero 1: ");
		n1 = leia.nextFloat();
		System.out.println("Numero 2: ");
		n2 = leia.nextFloat();
		System.out.println("Numero 3: ");
		n3 = leia.nextFloat();
		System.out.println("Numero 4: ");
		n4 = leia.nextFloat();

		calculo = (n1 * n2) - (n3 * n4);

		System.out.println("Diferença: " + calculo);

	}

}
