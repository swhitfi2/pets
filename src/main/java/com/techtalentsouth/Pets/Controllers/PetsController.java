package com.techtalentsouth.Pets.Controllers;

import java.util.ArrayList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.stereotype.Controller; 

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping; 

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

 
@Controller 

public class PetsController { 
	
//	private static List<Pets> posts = new ArrayList<>();



@Autowired  

private PetsRepository petsRepository; //creates an instance 

	
@GetMapping("/") 

public String index(PetsUser petsuser, Model model)  

{
	return	"PetsUser/index.html"; 

}	 

//@GetMapping("/index")
//public ModelAndView petsList(PetsUser petsUser) {
//    ModelAndView mv = new ModelAndView("PetsUser/index");
//    mv.addObject("petsUser", petsRepository.findAll());
//  //addAllObjects(modelMap)   
//	return mv;    
//}
 	  


@GetMapping("/list")
public ModelAndView allOwners(PetsUser pets) {
	ModelAndView mv = new ModelAndView("PetsUser/list");
	mv.addObject("pets", petsRepository.findAll());
	return mv;
}


@GetMapping("/pets") 

	public String pets(PetsUser petsUser)  
	
	{ 
	     return	"PetsUser/pets.html"; 
	
	} 

 

@GetMapping("/about") 

	public String about()  
	
		{ 
		     return	"PetsUser/about.html"; 
		
		} 

 
	
@PostMapping(value="/pets")//post back to the form page 
	
	public String addNewPet(PetsUser petsuser, Model model) { 

 

	petsRepository.save(new PetsUser(petsuser.getName(),petsuser.getPetName(),  
	
	petsuser.getDesc(), petsuser.getDateCreated())); 

	
	//then the add attribute is passing the form data to be used back to the form 
	
	//takes saved variables and  
	
	model.addAttribute("name", petsuser.getName()); 
	
	model.addAttribute("petName", petsuser.getPetName()); 
	
	model.addAttribute("desc", petsuser.getDesc()); 
	
	model.addAttribute("createdDate", petsuser.getDateCreated()); 	
	 
	
	return "PetsUser/confirmSignUp"; 
	
	} 

 

} 