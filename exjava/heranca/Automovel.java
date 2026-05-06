package heranca;

public class Automovel extends Terrestre{
    private String numPlaca;
    private int numPortas;
    
    public Automovel(){
        
    }
    
    public String getNumPlaca(){
        return numPlaca;
    }
    
    public int getNumPortas(){
        return numPortas;
    }
    
    public void setNumPlaca(String numPlaca){
        this.numPlaca = numPlaca;
    }
    
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    
    
    public void imprimeDadosAutomovel(){
        System.out.println("CAPACIDADE: " + capacidade);
        System.out.println("NÚMERO DE RODAS: " + numRodas);
    }
}
