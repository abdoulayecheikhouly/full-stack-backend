package com.fullstack.backend.fulstackbackend.controller;


import com.fullstack.backend.fulstackbackend.model.Produit;
import com.fullstack.backend.fulstackbackend.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitController {

    @Autowired
    private ProduitService produitService;
    @GetMapping()
    private List<Produit> getAllProduit() {
        return produitService.getAllProduits();

    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Produit getProduitById(@PathVariable("id") Long id) {
        return produitService.getProduit(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.saveProduit(produit);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Produit updateProduit(@RequestBody Produit produit) {
        return produitService.updateProduit(produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable("id") Long id)
    {

        produitService.deleteProduitById(id);
    }

    @RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
    public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
        return produitService.findByCategorieIdCat(idCat);
    }
    @RequestMapping(value ="/prodsByName/{nom}",method = RequestMethod.GET)

    public List <Produit> getProduitByNom(@PathVariable("nom") String nom){
      return   produitService.findByNomProduit(nom);
    }





}
