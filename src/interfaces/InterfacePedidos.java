package interfaces;

import java.util.ArrayList;
import models.Pedidos;

public interface InterfacePedidos {

    public void addPedido(Pedidos pedido);

    public void removePedido(Pedidos pedido);

    public ArrayList<Pedidos> getPedidosList();

}
