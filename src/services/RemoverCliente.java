
package services;

import repository.RepositorioClientes;
import models.Cliente;
import java.util.Scanner;

public class RemoverCliente {
    private RepositorioClientes repositorio;

    public RemoverCliente(RepositorioClientes repositorio) {
        this.repositorio = repositorio;
    }

    public void remover(Scanner sc) {
        System.out.println("Digite o CPF do cliente a ser removido:");
        String cpf = sc.nextLine();
        Cliente cliente = repositorio.findClienteByCpf(cpf);
        if (cliente != null) {
            repositorio.removeCliente(cliente);
            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}