package services;

import gui.MenuLogin;
import treatments.Limpeza;
import repository.RepositorioClientes;
import models.Cliente;
import java.util.Scanner;
import gui.MenuCliente;

public class LoginCliente {
    public static void login(Scanner sc) throws InterruptedException {
        Limpeza.clear();
        System.out.println("Login de Cliente\n");
        Thread.sleep(1500);

        System.out.println("Insira as informacoes requisitadas");
        System.out.println("Digite seu email: ");
        String email = sc.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        RepositorioClientes repositorioCliente = new RepositorioClientes();
        boolean loginSuccessful = false;
        for (Cliente cliente : repositorioCliente.getClienteList()) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                loginSuccessful = true;
                MenuCliente.menuCliente(cliente, sc);
                break;
            }
        }

        if (!loginSuccessful) {
            System.out.println("Email ou senha incorretos. Tente novamente.");
            MenuLogin.menuLogin(sc);
        }

    }
}
