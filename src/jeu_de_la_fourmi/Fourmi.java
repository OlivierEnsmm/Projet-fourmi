/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_de_la_fourmi;

import java.util.Objects;

/**
 *
 * @author Olivi
 */
public class Fourmi {
    private Position positionFourmi ;
    private double energie ;
    private double nourriture ;
    private int numeroFourmiliere ;

    public Fourmi(Position positionFourmi, double energie, double nourriture, int numeroFourmiliere) {
        this.positionFourmi = positionFourmi;
        this.energie = energie;
        this.nourriture = nourriture;
        this.numeroFourmiliere = numeroFourmiliere;
    }

    public Position getPositionFourmi() {
        return positionFourmi;
    }

    public double getEnergie() {
        return energie;
    }

    public double getNourriture() {
        return nourriture;
    }

    public int getNumeroFourmiliere() {
        return numeroFourmiliere;
    }

    public void setPositionFourmi(Position positionFourmi) {
        this.positionFourmi = positionFourmi;
    }

    public void setEnergie(double energie) {
        this.energie = energie;
    }

    public void setNourriture(double nourriture) {
        this.nourriture = nourriture;
    }

    public void setNumeroFourmiliere(int numeroFourmiliere) {
        this.numeroFourmiliere = numeroFourmiliere;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.positionFourmi);
        hash = 41 * hash + this.numeroFourmiliere;
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
        final Fourmi other = (Fourmi) obj;
        if (this.numeroFourmiliere != other.numeroFourmiliere) {
            return false;
        }
        if (!Objects.equals(this.positionFourmi, other.positionFourmi)) {
            return false;
        }
        return true;
    }
    
    
}
