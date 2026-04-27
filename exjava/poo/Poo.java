package poo;

public class Poo {
    public static void main(String[] args){
        Carro meuCarro = new Carro();
        Carro meuOutroCarro = new Carro("BRANCO", "PASSEIO", "GGG-0000", 2);
        
        Pessoa pessoa = new Pessoa("Julia", "Vermelho", 18);
        
        meuCarro.setCor("PRETO");
        meuCarro.setTipo("PASSEIO");
        meuCarro.setPlaca("GGG-1111");
        meuCarro.setNumPortas(4);
        
        System.out.println("--------Carro---------");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Número de Portas: " + meuCarro.getNumPortas());
        
        System.out.println("--------Carro---------");
        System.out.println("Cor: " + meuOutroCarro.getCor());
        System.out.println("Tipo: " + meuOutroCarro.getTipo());
        System.out.println("Placa: " + meuOutroCarro.getPlaca());
        System.out.println("Número de Portas: " + meuOutroCarro.getNumPortas());
        
        pessoa.setCarro(meuCarro);
        
        pessoa.ligarCarro();
        pessoa.setCambioMarcha(1);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(2);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(3);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(2);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(1);
        pessoa.getCarro().getCambio();
        pessoa.acelerarCarro();
        
        System.out.println();
        
        pessoa.setCambioMarcha(0);
        pessoa.getCarro().getCambio();
        pessoa.frearCarro();
        pessoa.desligarCarro();
        
    }
}
