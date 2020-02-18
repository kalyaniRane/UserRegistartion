package com.bridgelabz.userregistration;

public class UserRegistration {


    private static String VALID_NAME_PATTERN="^[A-Z][a-z]{3,}$";
    private static String VALID_EMAIL_PATTERN="^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    private static String VALID_MOBILE_NUMBER="^[1-9]{2}[[' ']][1-9]{1}[0-9]{9}$";
    public static String VALID_PASSWORD_PATTERN1="^[\\w\\W]{8,30}$";
    public static String VALID_PASSWORD_PATTERN2 = "^(?=.*[A-Z]).{8,}$";
    public static String VALID_PASSWORD_PATTERN3 = "^(?=.*[0-9]).{8,}$";

    public static boolean checkUserName(String name) {
        return(name.matches(VALID_NAME_PATTERN));
    }

    public static boolean checkUserEmail(String email) {
        return(email.matches(VALID_EMAIL_PATTERN));
    }

    public static boolean checkUserMobileNumber(String mobNumber) {
        return(mobNumber.matches(VALID_MOBILE_NUMBER));
    }

    public static boolean checkUserPassword(String password,String pattern) {
        return(password.matches(pattern));
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }
}