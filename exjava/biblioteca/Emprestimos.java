package Biblioteca;

public class Emprestimos {
    private String dataEmprestimo;
    private String horaEmprestimo;
    private Livros livro;
    private Usuarios usuario;
    
    public Emprestimos(){
        
    }
    
    public Emprestimos(String dataEmprestimo, String horaEmprestimo, Livros livro, Usuarios usuario){
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    public void realizarEmprestimo(){
        
    }
    
    public void imprimirEmprestimo(){
        
    }
}
