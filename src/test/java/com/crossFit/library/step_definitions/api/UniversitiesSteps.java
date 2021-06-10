package com.crossFit.library.step_definitions.api;

import com.crossFit.library.pojos.University;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

public class UniversitiesSteps {

    Response response;
    JsonPath jsonPath;
    RequestSpecification request;

    @Given("header should have json")
    public void header_should_have_json() {
        request = given().accept(ContentType.JSON);
    }

    @When("user send get request to {string}")
    public void user_send_get_request_to_universities(String endpoint) {
        response = request.when().get(endpoint);
    }

    @Then("Response status code should be {int}")
    public void response_status_code_should_be(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("header should have content type json")
    public void header_should_have_content_type_json() {
        response.then().assertThat().contentType(ContentType.JSON);
    }

    @Then("number of universities should be {int}")
    public void number_of_universities_should_be(int numOfUni) {
        jsonPath = response.jsonPath();
        List<Map<String, Object>> universities = jsonPath.getList("");
        Assert.assertEquals(numOfUni, universities.size());
    }

    @Then("convert Json to POJO")
    public void convert_Json_to_POJO() {
        jsonPath = response.jsonPath();
        List<University> uni = jsonPath.getList("", University.class);
        System.out.println(uni);
    }

    @Then("convert POJO to Json")
    public void convert_POJO_to_Json() {
        University uni = new University(
                "TX",
                new String[]{"www.mekanrejepov.com"},
                "US",
                "United States",
                "Mekan Rejepov University",
                new String[]{"mekanrejepov.com"}
        );
        Gson gson = new Gson();

        String json = gson.toJson(uni);
        System.out.println(json);
    }
}