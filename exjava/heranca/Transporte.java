package heranca;

public class Transporte { /*se tivesse um extends Object, não estaria errado, já que essa classe é padrão*/
    protected int capacidade;
    
    public Transporte(){
        
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
}
