package me.Lel020.Users;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

    ArrayList <User> users = new ArrayList <User>();

    public void addUser(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        User user = new User(name, password, email);
        users.add(user);
    }
}
