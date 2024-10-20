import java.util.List;

public class Pratos {

    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int tempoPreparo;
    private String vegetariano;
    private String semGluten;
    private String imagem;
     }

     Public Pratos(){
     }

     Public Pratos(int id, String nome, String descricao,double preco,int tempoPreparo,String vegetariano,String semGluten, String imagem ){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.semGluten = semGluten;
        this.imagem = imagem;
     }
    
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    } 

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    
    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    } 

    public int getTempoPreparo(){
        return tempoPreparo;
    }

    public void setTempoPreparo(int nome){
        this.tempoPreparo = tempoPreparo;
    } 

    public String getVegetariano(){
        return vegetariano;
    }

    public void setVegetariano(String vegetariano){
        this.vegetariano = vegetariano;
    } 

    public String getSemGluten(){
        return semGluten;
    }

    public void setSemGluten(String semGluten){
        this.semGluten = semGluten;
    } 

    public String getImagem(){
        return imagem;
    }

    public void setImagem(String imagem){
        this.imagem = imagem;
    } 




