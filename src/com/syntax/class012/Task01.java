package com.syntax.class012;

public class Task01 {

    public static void main(String[] args) {


//	    	Store username, password and confirm password from a user and check following requirements:
//			Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//			Password should be minimum 8 characters, if less → message=”Password is too short”.
//			Password cannot contain username if so, → message=”Password cannot contain username”.
//			Password should match confirmed password, if not  → message=“Passwords do not match”.
//			Only after all requirements met → message “Your username and password has been created”

        String username = "admin";
        String password = "Loki12345";
        String confirmPassword = "Loki12345";

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!confirmPassword.equals(password)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }

    }

}
