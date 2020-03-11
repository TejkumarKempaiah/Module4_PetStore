package getRequest;
//Note: Please mention the valid petId for which JSON Output would be received.

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_ListAllPets
{
	@Test
	public static void listASpecificPet() 
	{
		RestAssured.baseURI = "https://petstore.swagger.io";

		// Define the resource path
		String resource = "/v2/pet/105";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, resource);

		// Print the status code
		System.out.println("Status code = " + response.statusCode());

		// Print the status line
		System.out.println("Status line = " + response.statusLine());

		// Print the response body
		System.out.println("Response body = " + response.asString());
		
		//print the response
		System.out.println(response.asString());
	}
}
