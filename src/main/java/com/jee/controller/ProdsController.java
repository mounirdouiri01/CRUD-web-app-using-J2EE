package com.jee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jee.entity.Produits;
import com.jee.service.LignesProduitsService;
import com.jee.service.ProduitsService;



@Controller
public class ProdsController {
	
	@Autowired    
    ProduitsService dao;
	
	@Autowired
	private LignesProduitsService lpdao;
	
	
	@RequestMapping("/prod_form")    
    public String showform(Model m){    
		Produits Produit = new Produits();
		List<String> colooneprod = dao.getColonneProds();
		List<String> coloonelp = lpdao.getColonneLProds();
		m.addAttribute("colooneprod", colooneprod);
		m.addAttribute("coloonelp", coloonelp);
		m.addAttribute("prod", Produit);
        return "prod_form";   
    }    
	
	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("prod") Produits prod){    
	try {
        dao.saveProduit(prod);    
	}catch(Exception e) {}
        return "redirect:/viewprod";   
    }    
	
	
	 @RequestMapping("/viewprod")    
	    public String viewprod(Model m){    
	        List<Produits> list=dao.getProduits();    
	        m.addAttribute("list",list);  
	        return "viewprod";    
	    }    
	 
	 
	 
	 @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("prod") Produits prod){ 
		 
		 try {
	        dao.updateProduit(prod);    
		 }catch(Exception e) {}
		 
	        return "redirect:/viewprod";    
	    }    
	 
	 
	 
	 @RequestMapping(value="/deleteprod/{codeproduit}",method = RequestMethod.GET)    
	    public String delete(@PathVariable String codeproduit){   
		 
		 try {
	        dao.deleteProduit(codeproduit);  
		 }catch(Exception e) {}
	        
	        return "redirect:/viewprod";    
	    }     
	
}

