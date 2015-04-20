package org.hillel.it.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.hillel.it.charm.service.CharmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MapController {
	
	private static final Logger logger = LoggerFactory.getLogger(MapController.class);
	
	@Autowired
    private CharmService charmService;
	
	@RequestMapping("/index")
	public String getMaps(java.util.Map<String, Object> m) {
		
		m.put("map", new org.hillel.it.charm.model.entity.Map());
		m.put("mapList", charmService.getMaps());
        
		return "map";
	 }
	
	@RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }
	
	@RequestMapping("/formAction")
	public String formAction(java.util.Map<String, Object> m) {
		
		m.put("map", new org.hillel.it.charm.model.entity.Map());
		m.put("mapList", charmService.getMaps());
		
		return "formAction";
	}
	
	/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "map";
	}
	*/
}