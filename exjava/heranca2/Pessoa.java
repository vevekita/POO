public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNasc;
    
    public Pessoa(String nome, String cpf, String dataNasc){
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    public Pessoa(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
}
