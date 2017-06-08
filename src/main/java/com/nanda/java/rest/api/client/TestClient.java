/**
 * 
 *//*
package com.nanda.java.rest.api.client;

import java.util.List;

import com.nanda.testtracker.dal.model.TestCase;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;

*//**
 * @author Nandakumar 22-Apr-2017
 *
 *//*
public class TestClient {

    
     * public static void main(String[] args) {
     * 
     * ClientConfig clientConfig = new DefaultClientConfig();
     * clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
     * Boolean.TRUE);
     * 
     * ClientResponse response = Client.create(clientConfig).resource(
     * "http://localhost:8080/test/testcase/").path("1414")
     * .accept(MediaType.APPLICATION_JSON).header("content-type",
     * MediaType.APPLICATION_JSON) .get(ClientResponse.class); if
     * (response.getStatus() == 200) {
     * 
     * List<TestCase> testCases = response.getEntity(new
     * GenericType<List<TestCase>>() { });
     * 
     * testCases.forEach(testCase -> System.out.println(testCase.toString()));
     * 
     * }
     * 
     * else System.out.println("Error in getting test case details.");
     * 
     * }
     

    public static void main(String[] args) {

	Client client = TestTrackerRestClient.getRestClient();

	//TestVersion version = new TestVersion(1415, "FQA Testing");

	TestCase testCase = new TestCase("Payment", "com.nanda.payment.TestPayment", "testPayment", "Failed");

	TestTrackerRestClient.postResource(client, "http://localhost:8080/test/testcase/add", testCase);

	ClientResponse response = TestTrackerRestClient.getResource(TestTrackerRestClient.getRestClient(),
		"http://localhost:8080/test/testcase/1");

	TestCase testCaseResult = response.getEntity(new GenericType<TestCase>() {
	    
	   
	});

	System.out.println(testCaseResult.getTestCaseName());
	System.out.println(testCaseResult.getStatus());
    }

}
*/