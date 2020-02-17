package com.bridgelabz.userregistration;

public class UserRegistration {

    private static String VALID_NAME_PATTERN="^[A-Z][a-z]{3,}$";

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }
    public static boolean checkUserName(String name) {
        return(name.matches(VALID_NAME_PATTERN));
    }
}