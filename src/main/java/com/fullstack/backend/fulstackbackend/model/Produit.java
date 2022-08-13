package com.fullstack.backend.fulstackbackend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idProduit;
    private String nomProduit;
    private Double  prix;
    private Date dateCreation;
    @ManyToOne
    private Categorie categorie;

}