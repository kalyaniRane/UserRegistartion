package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidator {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        String result=UserRegistration.checkUserFirstName("Della");
        Assert.assertEquals("true",result);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        String result=UserRegistration.checkUserFirstName("della");
        Assert.assertEquals("false",result);
    }
}
