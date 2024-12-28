package org.example.modules;

import com.google.gson.Gson;
import io.qameta.allure.testng.TestInstanceParameter;
import org.example.pojos.Booking;
import org.example.pojos.BookingResponse;
import org.example.pojos.Bookingdates;

public class PayLoadManager
{
    //Covert your java Object into String
    //Gson Library can help
    Gson gson;
    //Serialization
    public String createPayloadBookingAsString() {

        Booking booking = new Booking();
        booking.setFirstname("James");
        booking.setLastname("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-03-01");

        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking); //This is Object

        //Object to JsonString
        gson = new Gson();
        String jsonStringpayLoad = gson.toJson(booking);

        System.out.println(jsonStringpayLoad); //JSonString
        return jsonStringpayLoad;

    }

    //In-Future
   //  public String createPayLoadBookingAsStringFromExcel(){}

    //Deserialization
    public BookingResponse bookingResponseJava(String responseString) {
        gson = new Gson();
        BookingResponse bookingResponse = gson.fromJson(responseString, BookingResponse.class);
        return bookingResponse;
    }

}
