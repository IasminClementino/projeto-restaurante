package repository;

import models.Cliente;
import java.util.ArrayList;

public class RepositorioClientes {
    private ArrayList<Cliente> clienteList;

    public RepositorioClientes() {
        this.clienteList = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        clienteList.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        clienteList.remove(cliente);
    }

    public ArrayList<Cliente> getClienteList() {
        return clienteList;
    }

    public Cliente findClienteByCpf(String cpf) {
        for (Cliente cliente : clienteList) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

}
