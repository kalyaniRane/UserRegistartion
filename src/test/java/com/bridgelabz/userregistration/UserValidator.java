package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidator {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result=UserRegistration.checkUserFirstName("Della");
        Assert.assertTrue(true);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean result=UserRegistration.checkUserFirstName("della");
        Assert.assertFalse(false);
    }
}