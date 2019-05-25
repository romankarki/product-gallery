package com.gallery.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gallery.service.BuyerService;
@Controller
public class BuyerController {
	@Autowired
	private BuyerService buyerService;
	   @RequestMapping(value={"/buy"}, method = RequestMethod.GET)

	    public ModelAndView roman(@RequestParam(value = "id", required = false) Integer id){
	       // List<User> userList = userService.findAll();
	      //userList.forEach(user -> System.out.println("user email: " + user.getEmail()));
	      ModelAndView modelAndView = new ModelAndView();
	     // modelAndView.addObject("userList", userList);
	    //User user = userService.findUserById(1);
	   //System.out.println("user = " + user);
	        modelAndView.setViewName("buy");
	        return modelAndView;
	    }
	
}
