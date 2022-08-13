package com.fullstack.backend.fulstackbackend.repository;

import com.fullstack.backend.fulstackbackend.model.Categorie;
import com.fullstack.backend.fulstackbackend.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
/*
    List<Produit>findByNomProduit(String nom);
    List<Produit>findByNameProduitLike(String s);
    @Query("select p from Produit p where p.nomProduit like %?1 and p.prix > ?2")
    List<Produit>findbyNomPrix(String nom,Double prix);
    @Query("select p from Produit p where p.categorie = ?1")
    List<Produit>findProduitByCategorie(Categorie categorie);
    List<Produit>findbyIdCategorie(Long id);
    @Query("select p from Produit p ORDER BY p.nomProduit ASC")
    List<Produit>findByNomAsc();
    @Query("select p from Produit  p order by p.nomProduit ASC ,p.prix")
    List<Produit>trierParNomPrix();*/
}
