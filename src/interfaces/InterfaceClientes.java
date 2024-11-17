package interfaces;

import java.util.ArrayList;
import models.Cliente;

public interface InterfaceClientes {

  public void addCliente(Cliente cliente);

  public void removeCliente(Cliente cliente);

  public ArrayList<Cliente> getClienteList();

  public Cliente findClienteByCpf(String cpf);
}
