package dataProvider;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class passingDataArray {
	
	@Test(dataProvider="BookData")
	public void AddBook(String ID){
		
        //Enter base URl
		RestAssured.baseURI="http://216.10.245.166";
		
		//Add given, when is use , then  is use to assert
		String Response = given().body(payload3.calling3(ID))
		.when().post("Library/Addbook.php")
		.then().statusCode(200).extract().response().asString();
		System.out.println(Response);
		
		JsonPath js = new JsonPath(Response);
		String printId = js.get("ID");
		System.out.println(printId);
		
	}
		
		//To pass different values for ID
	
		@DataProvider(name="BookData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"112"},
	            {"113"},
	            {"114"}
	        };
		
		

	}

}
