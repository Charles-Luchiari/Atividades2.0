package dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		int op;
		Scanner leia = new Scanner(System.in);

		Queue<String> clientes = new LinkedList<String>();

		do {

			System.out.println("******************************************************************");
			System.out.println("\n1 - Adicionar Cliente na fila");
			System.out.println("\n2 - Listar todos os clientes");
			System.out.println("\n3 - Retirar Cliente da fila");
			System.out.println("\n0 - Sair");
			System.out.println("******************************************************************");
			System.out.println("\nEntre com a opção desejada: ");

			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome: ");
				String nome = leia.nextLine();
				clientes.add(nome);
				System.out.println("Fila: " + clientes);
				System.out.println("Cliente adicionado!!");
				break;
			case 2:
				leia.nextLine();
				System.out.println("Lista de Clientes na fila: ");
				System.out.println(clientes);
				break;
			case 3:
				leia.nextLine();
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia\n");
				} else {
					clientes.remove();
					System.out.println(clientes);
					System.out.println("O cliente foi chamado!!");
				}
			case 0:
				System.out.println("Muito obrigado !! Volte sempre !!");
				break;
			default:
				System.out.println("Entre com uma opção valida!!");
				break;
			}

		} while (op != 0);
	}

}
