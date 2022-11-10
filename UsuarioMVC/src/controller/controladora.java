package controller;

import model.user;

public class controladora {
	private user u;
	
	public controladora() {
		u = new user();
	}
	public String ingles(String login, String senha) {
		return u.toString();
		
	}
}
