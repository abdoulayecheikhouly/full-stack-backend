package com.fullstack.backend.fulstackbackend.repository;

import com.fullstack.backend.fulstackbackend.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(path = "cat")
public interface CategorieRepository  extends JpaRepository<Categorie, Long> {


}
