package interfaces;

import java.util.ArrayList;
import models.Pratos;

public interface InterfacePratos {

    public void addPrato(Pratos prato);

    public void removePrato(Pratos prato);

    public ArrayList<Pratos> getPratosList();

    public Pratos findPratoByName(String nome);

    public Pratos findPratoById(int id);
}
