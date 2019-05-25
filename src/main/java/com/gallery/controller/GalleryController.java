package com.gallery.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import com.gallery.model.gallery;
import com.gallery.service.GalleryService;



@Controller
public class GalleryController {
	@Autowired
	private GalleryService galleryService;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView create() {

		List<gallery> gallerylist = galleryService.findAll();
		//System.out.println("courseList" + courselist);
		// courseList.forEach(course -> System.out.println("user"))
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("gallerylist", gallerylist);
		modelAndView.setViewName("/gallery");
		/*ModelAndView modelAndView = new ModelAndView();
		gallery gallery = new gallery();
		modelAndView.addObject("gallery", gallery);
		modelAndView.setViewName("gallery");*/
		return modelAndView;
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public ModelAndView upload() {
		
		ModelAndView modelAndView = new ModelAndView();
		gallery gallery = new gallery();
		modelAndView.addObject("gallery", gallery);
		modelAndView.setViewName("/upload");
		return modelAndView;
	}
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ModelAndView createNewGallery(@Valid gallery gallery,
			BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		//System.out.println("Course .......  " + course);
		gallery galleryExists = galleryService.findGalleryByGalleryName(gallery
				.getGalleryName());
		//System.out.println(course);
		if (galleryExists != null) {
			bindingResult.rejectValue("galleryname", "error.user",
					"There is already a product registered with the same name");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("/upload");
		} else {
			System.out.println("Here ... ");
			galleryService.saveGallery(gallery);
			modelAndView.addObject("successMessage",
					"course has been registered successfully");
			List<gallery> galleryList = galleryService.findAll();
			//System.out.println("courseList" + courselist);
			// courseList.forEach(course -> System.out.println("user"))
			// ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("gallerylist", galleryList);
			modelAndView.setViewName("/gallery");
			return modelAndView;
		}
		return modelAndView;
	}
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView showProduct(
			@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();

		gallery gallery = galleryService.findByGalleryId(id);
		System.out.println("--------------------------------------------------------------------------gallery " + gallery);
		modelAndView.addObject("gallery", gallery);
		modelAndView.setViewName("/show");
		
		return modelAndView;
	}
	 /*@RequestMapping(value={"/buy"}, method = RequestMethod.GET)

	    public ModelAndView roman(){
	       // List<User> userList = userService.findAll();
	      //userList.forEach(user -> System.out.println("user email: " + user.getEmail()));
	      ModelAndView modelAndView = new ModelAndView();
	     // modelAndView.addObject("userList", userList);
	    //User user = userService.findUserById(1);
	   //System.out.println("user = " + user);
	        modelAndView.setViewName("/buy");
	        return modelAndView;
	    }
	*/
	

}
