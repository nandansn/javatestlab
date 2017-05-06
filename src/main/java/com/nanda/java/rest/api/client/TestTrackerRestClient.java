/**
 * 
 */
package com.nanda.java.rest.api.client;

import javax.ws.rs.core.MediaType;

import com.nanda.testtracker.dal.model.TestCase;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * @author Nandakumar 23-Apr-2017
 *
 */
public class TestTrackerRestClient {

    public static Client getRestClient() {

	ClientConfig clientConfig = new DefaultClientConfig();
	clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

	Client client = Client.create(clientConfig);
	return client;

    }

    public static ClientResponse getResource(Client client, String uri) {

	ClientResponse response = client.resource(uri).accept(MediaType.APPLICATION_JSON)
		.header("content-type", MediaType.APPLICATION_JSON).get(ClientResponse.class);
	
	return response;
    }
    
    public static ClientResponse getResource(Client client, String uri, String versionId) {

	ClientResponse response = client.resource(uri).path(versionId).accept(MediaType.APPLICATION_JSON)
		.header("content-type", MediaType.APPLICATION_JSON).get(ClientResponse.class);
	
	return response;
    }
    
    public static void postResource(Client client, String uri, TestCase testCase) {

   	client.resource(uri).accept(MediaType.APPLICATION_JSON)
   		.header("content-type", MediaType.APPLICATION_JSON).post(testCase);
   	
   	
       }

}
