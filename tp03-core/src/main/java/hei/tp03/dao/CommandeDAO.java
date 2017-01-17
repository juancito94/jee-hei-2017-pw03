package hei.tp03.dao;

import hei.tp03.entity.Client;
import hei.tp03.entity.Commande;
import hei.tp03.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Juan on 17/01/2017.
 */
public interface CommandeDAO extends JpaRepository<Commande, Long> {

}
