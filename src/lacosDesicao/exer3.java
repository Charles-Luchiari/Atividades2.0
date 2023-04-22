package lacosDesicao;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		String nome = null;
		int idade;
		boolean doou;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nome = ler.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = ler.nextInt();
		System.out.println("Primeira doação de sangue? ");
		doou = ler.nextBoolean();
		
		if (idade>=18 && idade<=69 && doou) {
			if(idade>=60 && doou) {
				System.out.println(nome+" não está apto para doar!");
			} else {
				System.out.println(nome+" está apto para doar!");
			}
		} else {
			System.out.println(nome+" está apto para doar!");
		}
		
		
		

	}

}
