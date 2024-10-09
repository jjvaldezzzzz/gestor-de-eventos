package org.projeto;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Organizador organizador = new Organizador();
        EventoCSV e = new EventoCSV();

        String opcao;
        String nome;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar evento");
            System.out.println("2. Excluir evento");
            System.out.println("3. Realizar inscrição");
            System.out.println("4. Buscar evento");
            System.out.println("5. Listar eventos");
            System.out.println("6. Importar CSV");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.next(); scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Nome do evento: ");
                    nome = scanner.nextLine();
                    System.out.println("Data do evento: ");
                    String data = scanner.nextLine();
                    System.out.println("Local do evento: ");
                    String local = scanner.nextLine();
                    System.out.println("Capacidade do evento: ");
                    int capacidade = scanner.nextInt(); scanner.nextLine();
                    organizador.cadastrar(nome, data, local, capacidade);
                    break;
                case "2":
                    System.out.println("Nome do evento: ");
                    nome = scanner.next();
                    organizador.excluir(nome);
                    break;
                case "3":
                    System.out.println("Nome do evento: ");
                    nome = scanner.next();
                    organizador.seInscrever(nome);
                    break;
                case "4":
                    System.out.println("Nome do evento: ");
                    nome = scanner.next();
                    System.out.println(organizador.buscar(nome));
                    break;
                case "5":
                    organizador.listar();
                    break;
                case "6":
                    organizador.setQuantidade(e.importarCSV(organizador.getEventos(), organizador.getQuantidade()));
                    break;
                case "0":
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != "0");

        scanner.close();
    }
}
