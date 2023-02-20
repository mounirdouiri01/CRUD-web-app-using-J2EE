package com.jee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import com.jee.entity.LignesProduits;
import com.jee.service.LignesProduitsService;




@Controller
public class LignesProdsController {
	
	@Autowired    
    LignesProduitsService lpdao;
	
	@RequestMapping("/ligneprodform")    
    public String showform(Model ml){    
		
		LignesProduits ligneprod = new LignesProduits();
		List<String> colonnelp = lpdao.getColonneLProds();
		ml.addAttribute("ligneprod", ligneprod);
		ml.addAttribute("colonnelp", colonnelp);
          
        return "ligneprodform";   
    }    
	

	@RequestMapping(value="/savelp",method = RequestMethod.POST)    
    public String save(@ModelAttribute("ligneprod") LignesProduits ligneprod){    
		try {
			lpdao.saveLProd(ligneprod);   
		}catch(Exception e) {}
		
			return "redirect:/viewlp";   
    }    
	

	 @RequestMapping("/viewlp")    
	    public String viewlp(Model ml){    
	        List<LignesProduits> liste=lpdao.getLignesProds();    
	        ml.addAttribute("liste",liste);  
	        return "viewlp";    
	    }    
	 

	 @RequestMapping(value="/editsavelp",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("ligneprod") LignesProduits ligneprod){    
		 try {
	        lpdao.updateLProd(ligneprod);
		 }catch(Exception e) {}
	        return "redirect:/viewlp";    
	    }    
	 
	 
	 @RequestMapping(value="/deletelp/{lp}",method = RequestMethod.GET)    
	    public String delete(@PathVariable String lp){    
		 try {
	        lpdao.deleteLProd(lp);
		 }catch(Exception e) {}
	        return "redirect:/viewlp";    
	    }     
	

}
