package dashboard;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana Komase
 */
public class AvaliarMusica {
    private String nome;
    private int nota;
    
    /**
     *
     * @param genero
     * @param nomeMusica
     */
    public AvaliarMusica(){
       this.nome = nome;
       this.nota = nota;
        
    }

    public AvaliarMusica(int nota) {
        this.nota = nota;
    }

    public AvaliarMusica(String nome) {
        this.nome = nome;
    }
  
 
    public String getNomeMusica() {
        return nome;
    }

    public void setNomeMusica(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
