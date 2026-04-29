public class Agenda {
    int dia;
    int mes;
    int ano;
    String anotacao;
    
    void anote(int dia, int mes, int ano, String nota){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.anotacao = nota;
        validaData();
    }
    
    void validaData(){
        if((dia < 1) || (dia > 31) || (mes < 1) || (mes > 12)){
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            this.anotacao = "ANOTAÇÃO NÃO INSERIDA: DATA VÁLIDA";
        }
    }
    
    void mostraAnotacao(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano + ": " + this.anotacao);
    }
}
