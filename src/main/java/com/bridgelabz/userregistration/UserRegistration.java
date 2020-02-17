package com.bridgelabz.userregistration;

public class UserRegistration {

    private static String VALID_NAME_PATTERN="^[A-Z][a-z]{3,}$";
    private static String VALID_EMAIL_PATTERN="^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }

    public static String checkUserName(String name) {
        if(name.matches(VALID_NAME_PATTERN)) {
            return "true";
        }
        return "false";
    }

    public static String checkUserEmail(String email) {
        if(email.matches(VALID_EMAIL_PATTERN))
        {
            return "true";
        }
        return "false";
    }
}
