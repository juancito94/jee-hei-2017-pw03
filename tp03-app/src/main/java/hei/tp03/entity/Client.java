package hei.tp03.entity;

import java.awt.*;

/**
 * Created by Juan on 17/01/2017.
 */
public class Client {

    private String nom;
    private String prenom;
    private List<Commande> commandes;

    public Client() {
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
