package me.lel020.users;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    ArrayList <User> users = new ArrayList <User>();

    public void addUser() {

        Scanner scanner = new Scanner(System.in);

        String name = null;
        String email = null;

        boolean isName = false;
        boolean isEmail = false;

        do{
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            isName = isValidName(name);

            if(!isName){
                System.out.println("Invalid name format, please try again: ");
            }
        }
        while (!isName);

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        do {
            System.out.println("Enter your email: ");
            email = scanner.nextLine();
            isEmail = isValidEmail(email);

            if(!isEmail){
                System.out.println("Invalid email, please try again: ");
            }
        }
        while(!isEmail);

        users.add(new User(name,password, email));
        System.out.println("User added!");

        scanner.close();
    }

    public boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    public boolean isValidName(String name){
        String regex = "^[A-za-z]+([\\s'-][A-Za-z]+)$";
        return name.matches(regex);
    }
}
