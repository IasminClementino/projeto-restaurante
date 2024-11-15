
package services;

import repository.RepositorioClientes;

import java.util.Scanner;

public class ListarClientes {
    private RepositorioClientes repositorio;

    public ListarClientes(RepositorioClientes repositorio) {
        this.repositorio = repositorio;
    }

    public void listar() throws InterruptedException {
        System.out.println("Lista de Clientes\n");
        Thread.sleep(1000);
        repositorio.getClienteList().forEach(cliente -> {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Rua: " + cliente.getRua());
            System.out.println("Bairro: " + cliente.getBairro());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("-------------------------");
        });

        System.out.print("\nPressione Enter para voltar ao menu anterior.");
        Scanner temp = new Scanner(System.in);
        temp.nextLine();
    }
}