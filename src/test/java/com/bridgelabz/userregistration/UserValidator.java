package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidator {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        String result=UserRegistration.checkUserName("Della");
        Assert.assertEquals("true",result);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        String result=UserRegistration.checkUserName("della");
        Assert.assertEquals("false",result);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnTrue() {
        String result=UserRegistration.checkUserName("Desuza");
        Assert.assertEquals("true",result);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        String result=UserRegistration.checkUserName("desuza");
        Assert.assertEquals("false",result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        String result=UserRegistration.checkUserEmail("abc.xyz@bl.co.in");
        Assert.assertEquals("true",result);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        String result=UserRegistration.checkUserEmail(".abc@abc.com");
        Assert.assertEquals("false",result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        String result=UserRegistration.checkUserMobileNumber("91 9834256734");
        Assert.assertEquals("true",result);
    }

    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse() {
        String result=UserRegistration.checkUserMobileNumber("919834256734");
        Assert.assertEquals("false",result);
    }
}
