package com.example.registration.service;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.dao.UserRepository;
import com.example.registration.model.User;


@Service
public class UserService {
	//initial value
	Integer id = 90;
	
	
	@Autowired
	UserRepository repo;
	
	//adds user in db
	public void addUser(User user) {
		repo.save(user);
	}
	
	//returns true if email is already registered
	public boolean isRegistered(User user, String email) {
		Optional<User> op = Optional.empty();
		if(repo.findByEmail(email).equals(op)) {
			System.out.println("service: "+repo.findByEmail(email));
			return false;
		}
		return true;
	}
	
	// date format: dd-mm-yyyy to yy-MMM-dd
	public String dateFormat(String date) {
		String arr[] = new String[3];
		arr = date.split("-");
		System.out.println(Arrays.asList(arr));
		//convert month to integer
		int mon = Integer.parseInt(arr[1]);
		
		// months array
		String months[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		
		//return formatted date
		String format_date = arr[0].substring(2)+"-"+months[mon-1]+"-"+arr[2];
		return format_date;
	}
	
	//generate id
	public Integer getId() {
		return id+=10;
	}
}
