import static org.junit.Assert.assertEquals;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	
	public static final int port = 8082;
	private HttpResponse response;
	
@When("^the client calls /version$")
public void the_client_calls_version() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	HttpClient client = new DefaultHttpClient();
	HttpGet request = new HttpGet("http://localhost:" + port + "/version");
	response = client.execute(request);
	
	
    
}

@Then("^the client receives status code of (\\d+)$")
public void the_client_receives_status_code_of(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	assertEquals(arg1, response.getStatusLine().getStatusCode());
}


@Then("^the client receives server version \"([^\"]*)\"$")
public void the_client_receives_server_version(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	ResponseHandler<String> responseHandler = new BasicResponseHandler();
	assertEquals(arg1, responseHandler.handleResponse(response));
}


}
