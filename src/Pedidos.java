import java.util.List;

public class Pedidos {

 private int id;
 private String cliente;
 private String status;
 private int data;
 private int hora;
}

    Public Pedidos(){
    }

    Puplic Pedidos(int id, String cliente, String status, int data, int hora){
    this.id = id;
    this.cliente = cliente;
    this.status = status;
    this.data = data;
    this.hora = hora;
    }

    public int getId(){
        return Id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        this.hora = hora;
    }