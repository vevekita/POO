package poo;

public class Poo {
    public static void main(String[] args){
        Carro meuCarro = new Carro();
        meuCarro.setCor("PRETO");
        meuCarro.setTipo("PASSEIO");
        meuCarro.setPlaca("GGG-1111");
        meuCarro.setNumPortas(4);

        System.out.println("--------Carro---------");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Número de Portas: " + meuCarro.getNumPortas());
        
    }
}
