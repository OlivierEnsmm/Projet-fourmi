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
public class Cellule {
    private int etat ;
    private double pheromone ;
    private double nourriture ;
    private Position position ;

    public Cellule(int etat, double pheromone, double nourriture, Position position) {
        this.etat = etat;
        this.pheromone = pheromone;
        this.nourriture = nourriture;
        this.position = position;
    }

    public int getEtat() {
        return etat;
    }

    public double getPheromone() {
        return pheromone;
    }

    public double getNourriture() {
        return nourriture;
    }

    public Position getPosition() {
        return position;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setPheromone(double pheromone) {
        this.pheromone = pheromone;
    }

    public void setNourriture(double nourriture) {
        this.nourriture = nourriture;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    
}
