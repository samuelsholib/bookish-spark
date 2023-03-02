package restAssuredApi;



import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matcher;

import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.Test;
import java.util.HashMap;


	//Get Single User
	// https://swapi.dev/api/people/1
	// GetAllUsers
	// https://swapi.dev/api/people
	// Post Request
	//https://reqres.in/api/users
	//Put Request
	// https://reqres.in/api/users/2
	// Delete 
	// https://reqres.in/api/users/2


public class HttpRequestTester {
	int id;
	
@Test(priority = 1)
// Run | Debug
void getAllUsers() {
	//given ()

	 when()
	.get("https://swapi.dev/api/people")
	
	.then()
	.statusCode(200)
	.body("page", equalTo(2))
	.log().all();
	
	}
@Test(priority = 2)
// Run | Debug 
void createUser() {
	HashMap<String, String> myData = new HashMap<String, String>();
	myData.put("name", "Samuel");
	myData.put("height", "168");
	
	 given()
	.contentType("application/json")
	.body(myData)
	.when()
	.post("https://swapi.dev/api/people")
//	.jsonPath().getInt("id");
	.then()
	.statusCode(201)
	.log().all();
	}
@Test(priority = 3, dependsOnMethods = {"createUser"})
// Run | Debug
void updateUser() {
	HashMap<String, String> myData = new HashMap<String, String>();
	myData.put("name", "Jeremiah");
	myData.put("height", "174");
	
	 given()
	.contentType("application/json")
	.body(myData)
	.when()
	.put("https://swapi.dev/api/people/" + id)
//	.jsonPath().getInt("id")
	.then()
	.statusCode(200)
	.log().all();
	
	}

	@Test(priority = 4)
	void deleteUser() {
	when()
	.delete("https://swapi.dev/api/people/" + id)
	.then()
	.statusCode(204)
	.log().all();

	}
}
