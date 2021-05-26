package com.vertisage.crm.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vertisage.crm.model.UserInfo;
import com.vertisage.crm.model.UserLoginInfo;

@RestController
public class LoginController {

	@PostMapping(path = "/login")
	public String login(@RequestParam("userName")String userName,@RequestParam("password")String password) {
		
		return "Logged In Succcessful For User: " + userName;
	}
	
	@PostMapping(path = "/loginJson")
	public String loginWithJson(@RequestBody UserLoginInfo login) {
		if (login.getUserName().equals("anuj"))
		{
			return "LoggedJson In Succcessful For User: " + login.getUserName();
		}
		else
		{
			return "Username does not match";
		}
		
	}
	
	@GetMapping(path = "/getUserInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfo getUserInfo(@RequestParam("userId") String userId) {
	
		return new UserInfo(userId,"Sarthak Sinha");
	}
}
