package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getData 
{
	@Test
	public void testResponseCode()
	{
	Response resp = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
	int code = resp.getStatusCode();
	String code1 = resp.then().log().toString();
	System.out.println("rest code is   "+ code);
	System.out.println("rest body is   "+ code1);
	Assert.assertEquals(code, 200);
	}
	@Test
	public void RegistrationSuccessful()
	{ 
	 RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
	 RequestSpecification request = RestAssured.given();
	 
	 JSONObject requestParams = new JSONObject();
	 requestParams.put("userId", "345"); // Cast
	 requestParams.put("id", "Singh");
	 requestParams.put("title", "sdimpleuser2dd2011");
	 requestParams.put("completed", "false");
	 
	 //requestParams.put("region",  "sample2ee26d9@gmail.com");
	 request.body(requestParams.toJSONString());
	 Response response = request.post("/todos");
	 
	 int statusCode = response.getStatusCode();
	    Assert.assertEquals(statusCode, 201);
	 //int statusCode = response.getStatusCode();
	 //Assert.assertEquals(statusCode, "201");
	 String successCode = response.jsonPath().get("SuccessCode");
	 Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}
}
