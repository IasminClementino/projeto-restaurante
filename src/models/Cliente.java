package models;

public class Cliente extends Pessoa{
    private String cpf;

    public Cliente() {}
    
    public Cliente(String nome, String email, String telefone, String senha, String rua, String bairro, String cpf) {
        super(nome, email, senha, telefone, rua, bairro);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
