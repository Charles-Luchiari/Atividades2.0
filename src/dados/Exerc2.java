package dados;

import java.util.Scanner;
import java.util.Stack;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();

		int op;

		do {

			System.out.println("******************************************************************");
			System.out.println("\n1 - Adicionar livro na pilha");
			System.out.println("\n2 - Listar todos os livros");
			System.out.println("\n3 - Retirar livro da pilha");
			System.out.println("\n0 - Sair");
			System.out.println("******************************************************************");
			System.out.println("\nEntre com a opção desejada: ");

			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome: ");
				String nome = leia.nextLine();
				livros.push(nome);
				System.out.println(livros);
				System.out.println("O livro foi adicionado!");
				break;
			case 2:
				leia.nextLine();
				System.out.println("Lista de livros da pilha: ");
				System.out.println(livros);
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia! Adicione um livro");
				} else {
					livros.pop();
					System.out.println(livros);
					System.out.println("O livro foi retirado!");
				}
				break;
			case 0:
				System.out.println("Programa finalizado!!");
				break;
			default:
				System.out.println("Digite uma opção valida!");
				break;
			}

		} while (op != 0);

	}

}
