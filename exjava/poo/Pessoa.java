package poo;

public class Pessoa {
    private String nome;
    private String corCabelo;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    
    public void setCorCabelo(String corCabelo){
        this.corCabelo = corCabelo;
    }
    
    public String getCorCabelo(){
        return corCabelo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
}
