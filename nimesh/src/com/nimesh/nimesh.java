package com.nimesh;

import org.testng.annotations.Test;

public class nimesh {
    @Test(priority=1)
    void setup()
    {
        System.out.println("open browser");
    }
    @Test(priority=2)
    void login()
    {
        System.out.println("this is login");
    }
    @Test(priority=3)
    void teardown()
    {
        System.out.println("close browser");
    }
}
