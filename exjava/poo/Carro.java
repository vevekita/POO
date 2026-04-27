package poo;

public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private int cambio;
    
    public Carro(){

    }

    public Carro(String cor, String tipo, String placa, int numPortas){
        this.cor = cor;
        this.tipo = tipo;
        this.placa = placa;
        this.numPortas = numPortas;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }

    public int getNumPortas(){
        return numPortas;
    }
    
    public void ligar(){
        System.out.println("CARRO LIGADO");
    }
    
    public void desligar(){
        System.out.println("DESLIGADO");
    }
    
    public void acelerar(){
        System.out.println("CARRO ACELERAnDO");
    }
    
    public void frear(){
        System.out.println("CARRO FREANDO");
    }
    
    public void setCambio(int cambio){
        this.cambio = cambio;
    }
    
    public int getCambio(){
        System.out.println("MARCHA: " + cambio);
        return cambio;
    }
}
