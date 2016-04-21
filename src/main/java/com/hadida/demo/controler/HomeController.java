package com.hadida.demo.controler;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hadida.demo.service.PersonService;




/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private  PersonService personService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// Show persons
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		//String formattedDate = dateFormat.format(date);
		//model.addAttribute("serverTime", formattedDate );
		//return "home";
		
		//model.addAttribute("person", new com.hadida.demo.model.Person());
		model.addAttribute("listPersons", this.personService.getAllPerson());
		return "personspage";
	}
	
	
	@RequestMapping("/delete/{id}")
    public String deletePerson(@PathVariable("id") int id){
		
        this.personService.delete(id);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
       // model.addAttribute("person", this.personService.getPerson(id));
       // model.addAttribute("listPersons", this.personService.getAllPerson());
        return "personspage";
    }
    
    @RequestMapping("/add")
    public String addPerson(){
        return "add";
    }
	
}
