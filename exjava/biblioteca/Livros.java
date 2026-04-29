package Biblioteca;

public class Livros {
    private String titulo;
    private String autores;
    private String area;
    private String editora;
    private int ano;
    private String edicao;
    private int numFolhas;
   
    public Livros(){
        
    }
    
    public Livros(String titulo, String autores, String area, String editora, int ano, String edicao, int numFolhas){
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numFolhas = numFolhas;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setAutores(String autores){
        this.autores = autores;
    }
    
    public String getAutores(){
        return autores;
    }
    
    public void setArea(String area){
        this.area = area;
    }
    
    public String getArea(){
        return area;
    }
    
    public void setEditora(String editora){
        this.editora = editora;
    }
    
    public String getEditora(){
        return editora;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setEdicao(String edicao){
            this.edicao = edicao;
    }
    
    public String getEdicao(){
        return edicao;
    }
    
    public void setNumFolhas(int numFolhas){
        this.numFolhas = numFolhas;
    }
    
    public int getNumFolhas(){
        return numFolhas;
    }
}
