package poo;

public class Pessoa {
    private String nome;
    private String corCabelo;
    private int idade;
    private Carro carro;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String corCabelo, int idade){
        this.nome = nome;
        this.corCabelo = corCabelo;
        this.idade = idade;
    }
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
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    public Carro getCarro(){
        return carro;
    }
    
    public void ligarCarro(){
        carro.ligar();
    }
    
    public void desligarCarro(){
        carro.desligar();
    }
    
    public void acelerarCarro(){
        carro.acelerar();
    }
    
    public void frearCarro(){
        carro.frear();
    }
    
    public void setCambioMarcha(int marcha){
        carro.setCambio(marcha);
    }
}
