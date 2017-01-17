package hei.tp03.entity;

import javax.persistence.*;

/**
 * Created by Juan on 17/01/2017.
 */
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @ManyToOne
    private Commande comande;

    public Produit() {
    }

    public Produit(String nom, Commande comande) {
        this.nom = nom;
        this.comande = comande;
    }

    public Long getId() {
        return id;
    }
}
