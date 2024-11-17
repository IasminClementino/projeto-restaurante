package gui;

import java.util.Scanner;
import services.LoginCliente;
import services.RegistroCliente;
import treatments.Limpeza;

public class MenuLogin {
    public static void menuLogin(Scanner sc) throws InterruptedException {
        Limpeza.clear();

        System.out.println("Bem-Vindo ao Restaurante\n");
        Thread.sleep(2000);
        System.out.println("selecione uma opção:");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro");
        System.out.println("3 - menu de administração");
        System.out.println("4 - Sair\n");

        String opcao = sc.nextLine();

        switch (opcao) {
            case "1":
                LoginCliente.login(sc);
                break;
            case "2":
                RegistroCliente.registro(sc);
                break;
            case "3":
                MenuAdministracao.administracao(sc);
                break;
            case "4":
                System.out.println("Volte sempre!");
                Thread.sleep(1000);
                sc.close();
                System.out.println("Saindo do sistema...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                Thread.sleep(1000);
                menuLogin(sc);
                break;
        }
    }
}
