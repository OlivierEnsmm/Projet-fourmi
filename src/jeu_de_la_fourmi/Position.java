/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_fourmi;

/**
 *
 * @author Olivi
 */
public class Position {
    private int abscisse ;
    private int ordonnee ;
    
    public Position(int abscisse, int ordonnee){
        this.abscisse = abscisse ;
        this.ordonnee = ordonnee ;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }
    
}
