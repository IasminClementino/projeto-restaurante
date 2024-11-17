package services;

import java.util.Scanner;
import gui.MenuCliente;
import models.Cliente;
import treatments.Limpeza;
import repository.RepositorioClientes;

public class RegistroCliente {
    public static void registro(Scanner sc) throws InterruptedException {
        Limpeza.clear();

        System.out.println("Registro de Usuário\n");
        Thread.sleep(1500);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu email: ");
        String email = sc.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        System.out.println("Digite seu telefone: ");
        String telefone = sc.nextLine();

        System.out.println("Digite sua rua: ");
        String rua = sc.nextLine();

        System.out.println("Digite seu bairro: ");
        String bairro = sc.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(nome, email, telefone, senha, rua, bairro, cpf);
        RepositorioClientes repositorioCliente = new RepositorioClientes();
        repositorioCliente.addCliente(cliente);

        System.out.println("Usuário registrado com sucesso!");
        Thread.sleep(1000);
        MenuCliente.menuCliente(cliente, sc);
    }
}
