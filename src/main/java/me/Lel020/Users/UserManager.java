package me.Lel020.Users;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    ArrayList <User> users = new ArrayList <User>();

    public void addUser() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        boolean isValid = false;
        do {
            System.out.println("Enter your email: ");
            String email = scanner.nextLine();
            isValid = isValidEmail(email);

            if(!isValid){
                System.out.println("Invalid email!");
            } else {
                users.add(new User(name, password, email));
                System.out.println("User added!");
            }
        }
        while(!isValid);
        scanner.close();
    }

    public boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }
}
