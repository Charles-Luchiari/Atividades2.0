package lacoRepeticao;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, cont = 0, numPar = 0, numImpar = 0;

		for (cont = 1; cont <= 10; cont++) {
			System.out.printf("Digite %dº número: ", cont);
			num = leia.nextInt();

			if (num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}
		System.out.println("\nTotal de números pares: "+ numPar);
		System.out.println("\nTotal de números ímpares: "+ numImpar);
	}

}
