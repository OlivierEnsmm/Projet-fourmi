/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_fourmi;

import java.util.ArrayList;

/**
 *
 * @author Olivi
 */
public class Terrain {
    private int tailleX ;
    private int tailleY ;
    private Cellule[][] plateau ; 
    private ArrayList<Fourmiliere> listeFourmilieres ;

    public Terrain(int tailleX, int tailleY, ArrayList<Fourmiliere> listeFourmilieres, Cellule[][] plateau) {
        this.tailleX = tailleX ;
        this.tailleY = tailleY ;
        this.listeFourmilieres = listeFourmilieres ;
        this.plateau = new Cellule[tailleX][tailleY] ;
    }

    public int getTailleX() {
        return tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }

    public ArrayList<Fourmiliere> getListeFourmilieres() {
        return listeFourmilieres;
    }

    public Cellule[][] getPlateau() {
        return plateau;
    }

    public void setTailleX(int tailleX) {
        this.tailleX = tailleX;
    }

    public void setTailleY(int tailleY) {
        this.tailleY = tailleY;
    }

    public void setListeFourmilieres(ArrayList<Fourmiliere> listeFourmilieres) {
        this.listeFourmilieres = listeFourmilieres;
    }
   
    
}
