package collectionsSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> Cor = new ArrayList();

		String cores = "";
		int i;

		System.out.println("Digite 5 cores: ");
		for (i = 0; i < 5; i++) {
			System.out.printf("Digite a %dª cor: ", i + 1);
			cores = leia.nextLine();
			Cor.add(cores);
		}

		System.out.println("\nLista de todas as frutas: ");
		System.out.println(Cor);

		System.out.println("\nOrdenar as cores ");
		Collections.sort(Cor);
		System.out.println(Cor);

	}

}
