package com.bridgelabz.userregistration;

public class UserRegistration {

    private static String FIRST_NAME_PATTERN="^[A-Z][a-z]{3,}$";
    private static String LAST_NAME_PATTERN="^[A-Z][a-z]{3,}$";
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }

    public static String checkUserFirstName(String fname) {
        if(fname.matches(FIRST_NAME_PATTERN)) {
            return "true";
        }
        return "false";
    }


    public static String checkUserLastName(String lname) {
        if(lname.matches(LAST_NAME_PATTERN))
        {
            return "true";
        }
        return "false";
    }
}