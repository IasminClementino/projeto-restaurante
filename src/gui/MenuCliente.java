package gui;

import java.util.Scanner;
import treatments.Limpeza;
import models.Cliente;
import services.DadosdoCliente;
import services.ListarPratos;
import repository.RepositorioPratos;
import services.ComprarPratos;
import services.VerCompras;
import repository.RepositorioPedidos;

public class MenuCliente {
    public static void menuCliente(Cliente cliente) throws InterruptedException {
        Limpeza.clear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu do Cliente\n");
        System.out.println("1. Ver Pratos");
        System.out.println("2. comprar Pratos");
        System.out.println("3. Ver compras");
        System.out.println("4. Dados do Usuário");
        System.out.println("5. Retornar ao menu login");
        System.out.println("6. Sair");

        String opcao = sc.nextLine();

        Limpeza.clear();

        ListarPratos listarPratos = new ListarPratos(new RepositorioPratos());
        RepositorioPratos repositorioPratos = new RepositorioPratos();
        RepositorioPedidos repositorioPedidos = new RepositorioPedidos();
        ComprarPratos comprarPratos = new ComprarPratos(repositorioPratos, repositorioPedidos);
        VerCompras verCompras = new VerCompras(repositorioPedidos, cliente);

        switch (opcao) {
            case "1":
                listarPratos.listar();
                Thread.sleep(2000);
                menuCliente(cliente);
                break;
            case "2":
                comprarPratos.comprarPrato(cliente);
                break;
            case "3":
                verCompras.verCompras(cliente);
                break;
            case "4":
                DadosdoCliente.dadosDoCliente(cliente);
                break;
            case "5":
                MenuLogin.menuLogin();
                return;
            case "6":
                System.out.println("Volte sempre!");
                Thread.sleep(1000);
                System.out.println("Saindo do sistema...");
                sc.close();
                System.exit(0);
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                Thread.sleep(1000);
                menuCliente(cliente);
                break;
        }
        
    }

}
