package org.example.Integration.Sample;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    //Create Booking
    //Get Booking
    //Update Booking
    //Delete Booking



    @Test(groups = "qa", priority = 1)
   // @Owner("Farhan")
    @Description("TC#INT1 - Step 1. Verify that the Booking can be created")
    public void testCreateBooking()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    //@Owner("Farhan")
    @Description("TC#INT1 - Step 2. Verify that the Booking by ID")
    public void testVerifyBookingID()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    //@Owner("Farhan")
    @Description("TC#INT1 - Step 3. Verify Update Booking by ID")
    public void testUpdateBookingByID()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
  //  @Owner("Farhan")
    @Description("TC#INT1 - Step 4. Verify Delete Booking by ID")
    public void testDeleteBooking()
    {
        Assert.assertTrue(true);
    }

}
