package com.rupeek_Customer.search.app_Test;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.rupeek_Customer.search.app_Generics.BaseClass;
import com.rupeek_Customer.search.app_Generics.IEndPoint;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.lessThan;

import io.restassured.http.ContentType;

public class GetRequestPhonenum extends BaseClass {

	@Test
	public void get_Contact_Phone() {

		given().when().get(IEndPoint.GET_RESOURCE_PHONENUM).
		then().assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).
				and().body("message", Matchers.equalTo("Unauthorized")).
				and().time(lessThan(1200l));
}
}
