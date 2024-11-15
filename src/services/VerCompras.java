package services;

import repository.RepositorioPedidos;
import java.util.Scanner;
import gui.MenuCliente;
import models.Cliente;
import models.Pedidos;

public class VerCompras {
    private RepositorioPedidos repositorioPedidos;

    public VerCompras(RepositorioPedidos repositorioPedidos, Cliente cliente) {
        this.repositorioPedidos = repositorioPedidos;
    }

    public void verCompras(Cliente cliente) throws InterruptedException {
        System.out.println("Compras realizadas:\n");
        for (Pedidos pedido : repositorioPedidos.getPedidosList()) {
            if (pedido.getCliente().equals(cliente)) {
                System.out.println(pedido);
            }
        }

        System.out.print("\nPressione Enter para voltar ao menu anterior.");
        Scanner temp = new Scanner(System.in);
        temp.nextLine();
        MenuCliente.menuCliente(cliente);
    }
}
