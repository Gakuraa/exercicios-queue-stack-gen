package Exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<String> fila = new LinkedList<String>();

        int opcao;

        do {
            System.out.println("*************************************************************\n");
            System.out.println("\t\t1 - Adicionar Cliente na Fila");
            System.out.println("\t\t2 - Listar todos os Clientes");
            System.out.println("\t\t3 - Retirar Cliente da Fila");
            System.out.println("\t\t0 - Sair");
            System.out.println("\n*************************************************************\n");

            System.out.println("\nEntre com a opção desejada: \n");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do cliente: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    fila.add(nome);
                    System.out.println("\nCliente " + nome + " adicionado!\n");
                    Iterator<String> itFila = fila.iterator();
                    while (itFila.hasNext()) {
                        System.out.println(itFila.next());
                    }
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        Iterator<String> itFila2 = fila.iterator();
                        while (itFila2.hasNext()) {
                            System.out.println(itFila2.next());
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        System.out.println("\nCliente " + fila.poll() + " retirado da fila!");
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
