package hei.tp03.entity;

/**
 * Created by Juan on 17/01/2017.
 */
public class Produit {

    private String nom;
    private Commande comande;

    public Produit() {
    }

    public Produit(String nom, Commande comande) {
        this.nom = nom;
        this.comande = comande;
    }
}
