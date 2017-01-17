package hei.tp03.entity;

import java.awt.*;

/**
 * Created by Juan on 17/01/2017.
 */
public class Commande {

    private boolean validee;
    private Client client;
    private List<Produit> produits;

    public Commande() {
    }

    public Commande(Client client) {
        this.client = client;
    }
}
