package hei.tp03.entity;


import javax.persistence.*;
import java.util.List;

/**
 * Created by Juan on 17/01/2017.
 */

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "validee")
    private boolean validee;

    @ManyToOne
    private Client client;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="commande")
    private List<Produit> produits;

    public Commande() {
    }

    public Commande(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
