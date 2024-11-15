package services;

import java.util.Scanner;
import models.Cliente;
import treatments.Limpeza;

public class RegistroCliente {
    public static void registro() throws InterruptedException {
        Limpeza.clear();
        Scanner sc = new Scanner(System.in);

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
        System.out.println(cliente.toString());

        System.out.println("Usuário registrado com sucesso!");
        Thread.sleep(1000);
        sc.close();

    }
}
