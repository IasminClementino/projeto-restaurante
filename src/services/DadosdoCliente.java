package services;

import java.util.Scanner;

import gui.MenuCliente;
import models.Cliente;

public class DadosdoCliente {
  public static void dadosDoCliente(Cliente cliente) throws InterruptedException {
        System.out.println("Dados do Usuário:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Rua: " + cliente.getRua());
        System.out.println("Bairro: " + cliente.getBairro());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.print("\nPressione Enter para voltar ao menu anterior.");
        Scanner temp = new Scanner(System.in);
        temp.nextLine();
        MenuCliente.menuCliente(cliente);
    }
}
