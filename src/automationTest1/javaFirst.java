package automationTest1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class javaFirst {

	public static void main(String[] args) {
		
		
		
		// Launch base URL

		
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		//given is use to add params, header, body
				
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")

		.body("{\n"
				+ "  \"location\": {\n"
				+ "    \"lat\": -38.383494,\n"
				+ "    \"lng\": 33.427362\n"
				+ "  },\n"
				+ "  \"accuracy\": 50,\n"
				+ "  \"name\": \"Rahul Shetty Academy\",\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\n"
				+ "  \"types\": [\n"
				+ "    \"shoe park\",\n"
				+ "    \"shop\"\n"
				+ "  ],\n"
				+ "  \"website\": \"http://rahulshettyacademy.com\",\n"
				+ "  \"language\": \"French-IN\"\n"
				+ "}").when().post("maps/api/place/add/json")

		.then().log().all().statusCode (200);
		
	}

}
