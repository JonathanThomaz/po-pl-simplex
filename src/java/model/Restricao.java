/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Restricao {
    int variaveis[];
    int folga;
    int artificial;
    int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int[] getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(int[] variaveis) {
        this.variaveis = variaveis;
    }

    public int getFolga() {
        return folga;
    }

    public void setFolga(int folga) {
        this.folga = folga;
    }

    public int getArtificial() {
        return artificial;
    }

    public void setArtificial(int artificial) {
        this.artificial = artificial;
    }


    
      
    
}
