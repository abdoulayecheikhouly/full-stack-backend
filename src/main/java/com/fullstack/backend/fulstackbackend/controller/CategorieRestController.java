package com.fullstack.backend.fulstackbackend.controller;

import com.fullstack.backend.fulstackbackend.model.Categorie;
import com.fullstack.backend.fulstackbackend.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")


public class CategorieRestController {

    @Autowired
    CategorieRepository categorieRepository;
    @RequestMapping(method= RequestMethod.GET)
    public List<Categorie> getAllCategories()
    {
        return categorieRepository.findAll();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Categorie getCategorieById(@PathVariable("id") Long id) {
        return categorieRepository.findById(id).get();
    }
}
