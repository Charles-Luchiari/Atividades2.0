package lacoRepeticao;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, pmenos21 = 0, pmais50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade > 0) {
			if(idade < 21) {
				pmenos21++;
			} else if(idade >50) {
				pmais50++;
			}
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+pmenos21);
		System.out.println("Total de pessoas maiores de 50 anos: "+pmais50);

	}

}
