package gui;

import java.util.Scanner;
import treatments.Limpeza;
import repository.RepositorioPratos;
import repository.RepositorioClientes;
import services.AdicionarPrato;
import services.RemoverPrato;
import services.ListarPratos;
import services.RemoverCliente;
import services.ListarClientes;

public class MenuAdministracao {
    public static void administracao() throws InterruptedException {
        Limpeza.clear();
        Scanner sc = new Scanner(System.in);
        RepositorioPratos repositorio = new RepositorioPratos();
        AdicionarPrato adicionarPrato = new AdicionarPrato(repositorio);
        RemoverPrato removerPrato = new RemoverPrato(repositorio);
        ListarPratos listarPratos = new ListarPratos(repositorio);
        RepositorioClientes repositorioClientes = new RepositorioClientes();
        RemoverCliente removerCliente = new RemoverCliente(repositorioClientes);
        ListarClientes listarClientes = new ListarClientes(repositorioClientes);

        System.out.println("Menu de Administração");
        System.out.println("1 - Adicionar Pratos");
        System.out.println("2 - Remover Pratos");
        System.out.println("3 - Listar Pratos");
        System.out.println("4 - Remover Cliente");
        System.out.println("5 - Listar Clientes");
        System.out.println("6 - Retornar ao Menu Login");
        System.out.println("7 - Sair");

        String opcao = sc.nextLine();

        switch (opcao) {
            case "1":
                adicionarPrato.adicionar();
                administracao();
                break;
            case "2":
                removerPrato.remover();
                administracao();
                break;
            case "3":
                listarPratos.listar();
                administracao();
                break;
            case "4":
                removerCliente.remover();
                administracao();
                break;
            case "5":
                listarClientes.listar();
                administracao();
                break;
            case "6":
                MenuLogin.menuLogin();
                break;
            case "7":
                System.out.println("Volte sempre!");
                Thread.sleep(1000);
                System.out.println("Saindo do sistema...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                Thread.sleep(1000);
                administracao();
                break;
        }
        sc.close();
    }
}
