/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author felip
 */
public class Rainha extends Peca {

    public Rainha() {
        super(9);   
    }

    @Override
    public boolean isJogadaValida(Xadrez.PecasEnum[][] tabuleiro, int[] posInicial, int[] posFinal) {
        return posFinal[0] == posInicial[0] || posFinal[1] == posInicial[1] || Math.abs(posInicial[0] - posFinal[0]) == Math.abs(posInicial[1] - posFinal[1]);
    }
    
}
