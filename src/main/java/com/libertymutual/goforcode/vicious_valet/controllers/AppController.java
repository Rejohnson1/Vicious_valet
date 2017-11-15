package com.libertymutual.goforcode.vicious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.vicious_valet.models.Car;
import com.libertymutual.goforcode.vicious_valet.models.Lot;

@Controller
public class AppController {

	
	
	private Lot carLot; //variable of type lot called carLot... Lot is the Blueprint

	public AppController() { // constructor doesn't return anything , and has the same name as the class
		carLot = new Lot(); // creating a lot object and storing it in the variable lot
	}
	
	@RequestMapping("/remove")	
	public ModelAndView removeCar(int carIndex) { //this is the method in the class - method name is "removecar". ModelAndView is the return type.
		carLot.removeCarFromLot(carIndex); // calling removeCarFromLot from lot class
		ModelAndView mv;
		mv = new ModelAndView(); //every method on a control is going to return a model and view // create an instance of it //
		mv.setViewName("app"); //expecting a car lot to 
		mv.addObject("lot", carLot); //must be whatever is used elsewhere to...when you go look in the html, if it starts with lot. something, use the carLot value
		return mv;
	}
 	
		@RequestMapping("/") //when someone is in the browser and someone does /remove, map that action
	public ModelAndView showApp(String license, String state, String color, String make, String model) { //ModelAndView is the return tyoe
		// if license is not null and the length of license is greater than 0
		// create a new instance of the car class from the values submitted
		if (license != null && license.length() > 0) {
			Car car;
			car = new Car(license, state, color, make, model); // when creating the object, must be in the same order as the constructor
														
			// add a method to the lot class and call that method
			carLot.driveCarOnto(car); //object carLot of type Lot, running the method driveCarOnto, and passing the 
		}
				
			ModelAndView mv; //showing the same file as above. Same as "ModelAndView mv - new ModelAndView;"
			mv = new ModelAndView();
			mv.setViewName("app"); //tell it to render app.html
					// add the carLot so that I can see the list of cars in the view
		mv.addObject("lot", carLot);
		return mv;
	}
}

//method - visibility(pub/priv), return type (has to return something), name of the method, parameters (can be 0 or a lot)
//parameters and arguments are synonyms
//variable dec - type and name
