package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidator {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserName("Della");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserName("della");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserName("Desuza");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserName("desuza");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserEmail(".abc@abc.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserMobileNumber("91 9834256734");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserMobileNumber("919834256734");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMinimum8Character_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserPassword("anbc@123",UserRegistration.VALID_PASSWORD_PATTERN1);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenLessThan8Character_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserPassword("abc@123",UserRegistration.VALID_PASSWORD_PATTERN1);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenAtLeast1UpperCase_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserPassword("Anbc@123",UserRegistration.VALID_PASSWORD_PATTERN2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtLeast1UpperCase_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserPassword("abcf@123",UserRegistration.VALID_PASSWORD_PATTERN2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenAtLeast1NumericNumber_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserPassword("Anbc@123",UserRegistration.VALID_PASSWORD_PATTERN3);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtLeast1NumericNumber_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserPassword("abcf@abv",UserRegistration.VALID_PASSWORD_PATTERN3);
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenExact1SpecialCharacter_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserPassword("Anbc@123",UserRegistration.VALID_PASSWORD_PATTERN4);
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenExact1SpecialCharacter_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserPassword("abcf@@abv",UserRegistration.VALID_PASSWORD_PATTERN4);
        Assert.assertFalse(result);
    }
}
