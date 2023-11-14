package Exercicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<String> listaLivro = new Stack<String>();

		int opcao;

		do {
			System.out.println("*************************************************************\n");
			System.out.println("\t\t1 - Adicionar Livro na Pilha");
			System.out.println("\t\t2 - Listar todos os Livros");
			System.out.println("\t\t3 - Retirar Livro da Pilha");
			System.out.println("\t\t0 - Sair");
			System.out.println("\n*************************************************************\n");

			System.out.println("\nEntre com a opção desejada: \n");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				sc.nextLine();
				String nomeLivro = sc.nextLine();
				listaLivro.push(nomeLivro);
				System.out.println("\nLivro adicionado! \n");
				System.out.println("\nPilha: \n");
				Iterator<String> itLista = listaLivro.iterator();
				while (itLista.hasNext()) {
					System.out.println(itLista.next());
				}
				break;
			case 2:
				if (listaLivro.isEmpty()) {
					System.out.println("\nA pilha está vazia! \n");
				} else {
					System.out.println("\nPilha: \n");
					Iterator<String> itLista2 = listaLivro.iterator();
					while (itLista2.hasNext()) {
						System.out.println(itLista2.next());
					}
				}
				break;
			case 3:
				if (listaLivro.isEmpty()) {
					System.out.println("\nA pilha está vazia! \n");
				} else {
					listaLivro.pop();
					System.out.println("\nUm Livro foi retirado da pilha! \n");
					System.out.println("\nPilha: \n");
					Iterator<String> itLista3 = listaLivro.iterator();
					while (itLista3.hasNext()) {
						System.out.println(itLista3.next());
					}
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida!");
			}

		} while (opcao != 0);

		sc.close();

	}

}
