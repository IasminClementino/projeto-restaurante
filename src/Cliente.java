
import java.util.List;

public class Cliente {

     //atributos basicos 
     private String nome; 

     //atributos de contato
     private String telefone;
     private String rua;
     private String bairro;

     //atributos pessoais
     private int cpf;

     //atributo financeiro
     private String banco;
     private String agencia;
     private int numeroConta;

     //atributo de identificaçao online
     private String google;    
    }

    Public Cliente(){
    }

    Public Cliente( String nome,String telefone, String rua, String bairro, int cpf, String banco,String agencia,int numeroConta,String google){
     this.nome = nome;
     this.telefone = telefone;
     this.rua = rua;
     this.bairro = bairro;
     this.cpf = cpf;
     this.banco = banco;
     this.agencia = agencia;
     this.numeroConta = numeroConta;
     this.google = google;
    }

           //Getters e Setters para os atributos
           public String getNome() {
               return nome;
           }

           public void setNome(String nome){
               this.nome = nome;
           }

           public String getTelefone(){
               return telefone;
           }

           public void setTelefone(String telefone){
               this.telefone = telefone;
           }

           public String getRua(){
               return rua;
           }

           public void setRua(String rua){
               this.rua = rua;
           }

           public String getBairro(){
               return bairro;
           }

           public void setBairro(String bairro){
               this.bairro = bairro;
           }

           public int getCpf(){
               return cpf;
           }

           public void setCpf(int cpf){
               this.cpf = cpf;
           }

           public String getBanco(){
               return banco;
           }

           public void setBanco(String banco){
               this.banco = banco;
           }

           public String getAgencia(){
               return agencia;
           }

           public void setAgencia(String agencia){
               this.agencia = agencia;
           }

           public int getNumeroConta(){
               return numeroConta;
           }

           public void setNumeroConta(int numeroConta){
               this.numeroConta =numeroConta;
           }

           public String getGoogle(){
               return google;
           }

           public void setGoogle(String google){
               this.google = google;
           }
