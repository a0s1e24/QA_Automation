package APIAutomation2;

import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;

public class practice1 {

    1
    public void parseJsonTest() {
        JsonPath js = new JsonPath(Payload2.callBody2());

        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);

        int coursesCount = js.getInt("courses.size()");
        System.out.println(coursesCount);

        String title1 = js.getString("courses[0].title");
        System.out.println(title1);

        int priceTwo = js.getInt("courses[2].price");
        int copiesTwo = js.getInt("courses[2].copies");

        int totalCostCourseTwo = priceTwo * copiesTwo;
//        System.out.println(totalCostCourseTwo);
    }
    
    @Test
    public void secondPrint() {
    	System.out.println("totalCostCourseTwo");
    }
}
