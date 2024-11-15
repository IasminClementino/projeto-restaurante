package services;

import treatments.Limpeza;

import java.util.Scanner;

public class LoginUsuario {
    public static void login() throws InterruptedException {
        Limpeza.clear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Login de Usuario\n");
        Thread.sleep(1500);

        System.out.println("Insira as informacoes requisitadas");

        System.out.println("Digite seu email: ");
        String email = sc.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();


    }
}
