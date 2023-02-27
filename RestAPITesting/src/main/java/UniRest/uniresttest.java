package UniRest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class uniresttest {

	/*GET REQUEST */
	public void getrequest() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse =Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("status code is "+ jsonResponse.getStatus());
		System.out.println("status Message is "+ jsonResponse.getStatusText());
		System.out.println("Response Body is "+ jsonResponse.getBody());
	}
	/*POST REQUEST */
	public void postrequest() throws UnirestException {

		HttpResponse<JsonNode>jsonResponse =
				Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("{“name”: “Aishwarya”, “salary” : “1500000”,“Age” : “23”}").asJson();
		
		System.out.println("status code is "+ jsonResponse.getStatus());
		System.out.println("status Message is "+ jsonResponse.getStatusText());
		System.out.println("Response Body is "+ jsonResponse.getBody());
	}
	
	/*PUT REQUEST */
	public void putrequest() throws UnirestException {

		HttpResponse<JsonNode>jsonResponse =
				Unirest.put("https://dummy.restapiexample.com/api/v1/update/21").body("{“name”: “Aishwarya”, “salary” : “1800000”,“Age” : “24”}").asJson();
		
		System.out.println("status code is "+ jsonResponse.getStatus());
		System.out.println("status Message is "+ jsonResponse.getStatusText());
		System.out.println("Response Body is "+ jsonResponse.getBody());
	}
	/*DELETE REQUEST */
	public void deleterequest() throws UnirestException {

		HttpResponse<JsonNode>jsonResponse =
				Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/21").asJson();
		
		System.out.println("status code is "+ jsonResponse.getStatus());
		System.out.println("status Message is "+ jsonResponse.getStatusText());
		System.out.println("Response Body is "+ jsonResponse.getBody());
	}
	public static void main(String[] args) throws UnirestException {
		uniresttest test = new uniresttest();
		test.getrequest();
		test.postrequest();
		test.putrequest();
		test.deleterequest();
	}

}
