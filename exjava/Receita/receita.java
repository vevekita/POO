/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comida;

public abstract class Receita {
    private String tipoReceita;
    
    public Receita(tipoReceita){
        this.tipoReceita = tipoReceita;
    }
    
    public Receita(){}
    
    public abstract void getIngredientes();
    public abstract void getModoDeFazer();
    
    public void setTipoReceita(String tipoReceita){
        this.tipoReceita = tipoReceita;
    }
    
    public String getTipo(){
        return this.tipoReceita;
    }    
}
