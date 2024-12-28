package org.example.base;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.asserts.AssertActions;
import org.example.modules.PayLoadManager;

public class BaseTest {

    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayLoadManager payLoadManager;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;



}
