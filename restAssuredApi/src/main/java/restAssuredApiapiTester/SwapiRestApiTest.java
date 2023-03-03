package restAssuredApiapiTester;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwapiRestApiTest {

	public static void main(String[] args) {
		
		RestAssured.baseURI ="https://swapi.dev/api/";
		RequestSpecification swapiRequest = RestAssured.given();
		RequestSpecification singleRequest = RestAssured.given();
		
		Response swapiResponse = swapiRequest.get("people");
		Response lukeResponse = singleRequest.get("people/1");
		
		
		 io.restassured.path.json.JsonPath  swapiResp = swapiResponse.jsonPath();
		 
		System.out.println(lukeResponse.getContentType());
		 System.out.println(swapiResp.get("results[0]"));
		 System.out.println(swapiResp.get("count"));
		 System.out.println(swapiResp.get("next"));
	}

}
