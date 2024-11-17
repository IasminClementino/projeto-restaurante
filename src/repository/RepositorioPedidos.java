package repository;

import models.Pedidos;
import java.util.ArrayList;

public class RepositorioPedidos implements interfaces.InterfacePedidos {
    private ArrayList<Pedidos> pedidosList;

    public RepositorioPedidos() {
        this.pedidosList = new ArrayList<>();
    }

    public void addPedido(Pedidos pedido) {
        pedidosList.add(pedido);
    }

    public void removePedido(Pedidos pedido) {
        pedidosList.remove(pedido);
    }

    public ArrayList<Pedidos> getPedidosList() {
        return pedidosList;
    }

}
