package com.rupeek_Customer.search.app_Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.rupeek_Customer.search.app_Generics.BaseClass;
import com.rupeek_Customer.search.app_Generics.IEndPoint;

import io.restassured.http.ContentType;

public class CreateData extends BaseClass {
	@Test
	public void authenticate_all() {

		given().when().post(IEndPoint.POST_REQUEST)
		.then().assertThat().statusCode(400).and()
				.contentType(ContentType.JSON).and()
				.body("error", Matchers.equalTo("Bad Request")).
				and().time(lessThan(1400l));

}
}
