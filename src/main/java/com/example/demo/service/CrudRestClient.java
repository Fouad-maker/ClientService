package com.example.demo.service;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Article;
import com.example.demo.entity.Avis;
import com.example.demo.entity.Categorie;
import com.example.demo.entity.Client;
import com.example.demo.entity.Commande;
import com.example.demo.entity.Fournisseur;
import com.example.demo.entity.Marque;
import com.example.demo.entity.Reclamation;
import com.example.demo.entity.SousCategorie;

import org.springframework.hateoas.Resources;




@FeignClient(name = "CrudApplication" )
public interface CrudRestClient {
	
	
	@GetMapping("/article/{id}")
	public Article findArticleById(@PathVariable("id") String id );
	

	@GetMapping("/article")
	public Resources<Article> findAllArticle();
	
	@PutMapping("/article/{id}")
	public Article updatArticle(Article article , @PathVariable("id") String id);
	
	// Feign Avis

	@GetMapping("/avis/{id}")
	public Avis findAvisById(@PathVariable("id") String id );
	
	
	@PostMapping("/avis")
	public Avis postAvis( @RequestBody Avis avis);
	
	@GetMapping("/avis")
	public Resources<Avis> findAllAvis();
	
	
	@PutMapping("/avis/{id}")
	public Avis modifyAvis(@RequestBody Avis avis ,@PathVariable("id") String id);
	
	@DeleteMapping("/avis/{id}")
	public void deleteById(@PathVariable("id") String id);
	
	// Feign Reclamation
	
	@GetMapping("/reclamation")
	public Resources<Reclamation> findAllReclamation();
	
	
	@PutMapping("/reclamation/{id}")
	public Avis modifyReclamation(@RequestBody Reclamation reclamation ,@PathVariable("id") String id);
	
	@PostMapping("/reclamation")
	public Optional<Avis> postReclamation( @RequestBody Reclamation reclamation);
	
	@DeleteMapping("/reclamation/{id}")
	public void deleteReclamationById(@PathVariable("id") String id);
	
	// Feign Commande
	
	@PostMapping("/commande")
	public Commande postCommande (@RequestBody Commande commande);
	
	// Feign Client
	
	@PutMapping("/client/{id}")
	public Optional<Client> updatClient(@RequestBody Client client,@PathVariable String id);
	
	@PostMapping("/client")
	public Client addClient (@RequestBody Client client);	
	
	@GetMapping("/client/{id}")
	public Client findClientById(@PathVariable("id") String id );
	
	// Feign Marque 
	
	@GetMapping("/marque")
	public Resources<Marque> findAllMarque();
	
	@GetMapping ("/marque/{id}")
	public Marque findMarqueById(@PathVariable ("id") String id );
	
	// Feign SousCategorie
	@GetMapping("/souscategorie")
	public Resources<SousCategorie> findAllSousCategorie();
	
	@GetMapping ("/souscategorie/{id}")
	public SousCategorie findSousCategorieById(@PathVariable ("id") String id );
	
	//Feign Fourniseeur
	
	@GetMapping ("/fournisseur/{id}")
	public Fournisseur findFournisseurById (@PathVariable ("id") String id);
	
	// Feign  Catégorie 
	@GetMapping("/categorie")
	public Resources<Categorie> findAllCategorie();
	
	@GetMapping ("/categorie/{id}")
	public Categorie findCategorieById(@PathVariable ("id") String id );
	
	
	

	
	
	
	
}
