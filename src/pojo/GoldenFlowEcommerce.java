package pojo;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class GoldenFlowEcommerce {

	public static void main(String[] args) {
		
		RequestSpecification Resq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).build();
		
		LoginPara1 tt = new LoginPara1();
		tt.setUserEmail(null);
		
		
		
		RequestSpecification requestLogin = given().spec(Resq).body();
		requestLogin.when().post("api/ecom/auth/login");
		
		
		

	}

}
