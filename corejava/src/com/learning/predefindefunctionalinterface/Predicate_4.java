/*
 * simple authentication program
 */

package com.learning.predefindefunctionalinterface;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	
	public String userName;
	public String password;
	
	User(String userName, String password){
		this.userName = userName;
		this.password = password;
	}
}

public class Predicate_4 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String username = sc.next();
		System.out.println("Enter user password");
		String pass = sc.next();
		
		Predicate<User> p = user -> user.userName.equals("vinay") && user.password.equals("kr");
		
		User userObj = new User(username, pass);
		
		if(p.test(userObj)) {
			System.out.println("valid user");
		}
		else {
			System.err.println("Error invalid user");
		}
	}
}
