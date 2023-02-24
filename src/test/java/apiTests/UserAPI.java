package apiTests;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserAPI {
	
	RequestSpecification req = RestAssured.given();
	File payload ;
	
	@Test
	public void createUser() {
		Response rsp = req.post("https://gorest.co.in/");
		JsonPath js = new JsonPath(rsp.toString());
		System.out.println(rsp.asPrettyString());
	}

}
