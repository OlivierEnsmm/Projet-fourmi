/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_fourmi;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Olivi
 */
public class Fourmiliere {
    private int nbFourmis ;
    private Position positionFourmiliere ;
    private ArrayList<Cellule> listeFourmis ;

    public Fourmiliere(int nbFourmis, Position positionFourmiliere, ArrayList<Cellule> listeFourmis) {
        this.nbFourmis = nbFourmis;
        this.positionFourmiliere = positionFourmiliere;
        this.listeFourmis = listeFourmis;
    }

    public int getNbFourmis() {
        return nbFourmis;
    }

    public Position getPositionFourmiliere() {
        return positionFourmiliere;
    }

    public ArrayList<Cellule> getListeFourmis() {
        return listeFourmis;
    }

    public void setNbFourmis(int nbFourmis) {
        this.nbFourmis = nbFourmis;
    }

    public void setPositionFourmiliere(Position positionFourmiliere) {
        this.positionFourmiliere = positionFourmiliere;
    }

    public void setListeFourmis(ArrayList<Cellule> listeFourmis) {
        this.listeFourmis = listeFourmis;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.positionFourmiliere);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fourmiliere other = (Fourmiliere) obj;
        if (!Objects.equals(this.positionFourmiliere, other.positionFourmiliere)) {
            return false;
        }
        return true;
    }
    
    
}
