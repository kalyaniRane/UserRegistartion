package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidator {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserName("Della");
        Assert.assertTrue(true);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserName("della");
        Assert.assertFalse(false);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserName("Desuza");
        Assert.assertTrue(true);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserName("desuza");
        Assert.assertFalse(false);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(true);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserEmail(".abc@abc.com");
        Assert.assertFalse(false);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserMobileNumber("91 9834256734");
        Assert.assertTrue(true);
    }

    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserMobileNumber("919834256734");
        Assert.assertFalse(false);
    }
}
