package com.rupeek_Customer.search.app_Generics;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	private void Config() {
	baseURI="http://13.126.80.194";
	port=8080;

	}

}
