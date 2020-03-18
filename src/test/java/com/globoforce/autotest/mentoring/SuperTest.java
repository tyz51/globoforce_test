package com.globoforce.autotest.mentoring;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuperTest {

    @Test(description = "TA-T10 TEST DESCRIPTION")
    public void test() {
        Assert.assertTrue(true);
    }
}