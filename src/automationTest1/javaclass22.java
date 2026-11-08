package automationTest1;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
//import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.equalTo;

public class javaclass22 {

	public static void main(String[] args) {
		

		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		//given is use to add params, header, body, extracxt is use to get response in output in strig format, otherwise it will under console
				
		String response =given().queryParam("key", "qaclick123").header("Content-Type","application/json")

		.body(BodyInfo.callBody()).when().post("maps/api/place/add/json")

		.then().assertThat().statusCode (200).extract().response().asString();
		
		System.out.println(response);  // got response in string format
//		System.out.println("    ");
		
		//try to get any value in output to print by using Json class
		
		JsonPath JS = new JsonPath(response);  // Everything is converted in Json here 
		
		String Place_ID = JS.get("place_id");   // converted into string to print 
		
		System.out.println("Place ID from JSON respoinse is:"+ "  "   +Place_ID);   // Successfully able ton extract something from entire json response 
		

		// Tried api testing for put method and got o/p to address successfully 
		
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\n"
				+ "\"place_id\": \""+Place_ID+"\",\n"
				+ "\"address\": \"70 Summer walk, USA\",\n"
				+ "\"key\":\"qaclick123\"\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
	}

}
