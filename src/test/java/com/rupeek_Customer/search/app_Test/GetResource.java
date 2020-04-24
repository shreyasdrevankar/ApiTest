package com.rupeek_Customer.search.app_Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.rupeek_Customer.search.app_Generics.BaseClass;
import com.rupeek_Customer.search.app_Generics.IEndPoint;

import io.restassured.http.ContentType;

public class GetResource extends BaseClass {
	@Test
	public void get_all_Contacts() {

		given().when().get(IEndPoint.GET_ALL_RESOURCE)
		.then()	.assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).and()
				.body("error", Matchers.equalTo("Unauthorized")).and()
				.body("message", Matchers.equalTo("Unauthorized"))
				.and().time(lessThan(12000l));
	}
}
