package com.example.registration.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.registration.model.Address;
import com.example.registration.model.User;
import com.example.registration.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		return "register.jsp";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerMe(@RequestParam("materials")String[] materials,@ModelAttribute("User")User user,@ModelAttribute("address")Address address) {
		List<Address> addressList= new ArrayList<Address>();
		addressList.add(address);
		user.setAddress(addressList);
		
		user.setMaterials(Arrays.toString(materials));
		user.setDob(service.dateFormat(user.getDob()));
		user.setId(service.getId());
		//debug
		System.out.println(user);
		
		//check if email already present
		if(service.isRegistered(user, user.getEmail())) {
			System.out.println("already registered!");
			return "register.jsp";
		}
		else {
			service.addUser(user);
		}
		return "home.jsp";
	}
	
}
