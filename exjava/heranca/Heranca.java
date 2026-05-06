package heranca;

public class Heranca {

    public static void main(String[] args) {
        Automovel carro = new Automovel();
        
        carro.setNumPlaca("GGG-0000");
        carro.setNumPortas(4);
        carro.setCapacidade(5);
        carro.setNumRodas(4);
        
        carro.capacidade = 10;
        carro.numRodas = 4;
    }
    
}
