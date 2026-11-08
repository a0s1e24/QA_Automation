package automationTest1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class firstAPITest {
	
	@test

	public static void apiTest() {
		// TODO Auto-generated method stub
	
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		
		
		String response = given().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(BodyInfo.callBody())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
		 JsonPath JS = new JsonPath(response);
		 String PlaceID = JS.get("place_id");
		 String ID = JS.get("id");
		 
		

       System.out.println("Place ID from above is   "+ PlaceID);
//       System.out.println("Only ID from above is   "+ ID);
       

	}


}

	