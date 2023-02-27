package HttpURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpurlconnectionexample {
	/* GET REQUEST */
	public void getrequest() throws IOException{		
		// 1.	Create object for URL class
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		//2. open the connection and store it in parent class
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		// 3.	Set the request type
		connection.setRequestMethod("GET");
		//4.	Connect  - optional
		connection.connect();
		// 5.	Get the status code and print
		int statuscode = connection.getResponseCode();
		System.out.println("Status code is "+ statuscode);   // Status code is 200
		// 6.	Get the response message and print
		String message = connection.getResponseMessage();
		System.out.println("Response message is "+ message);  //  Response message is OK
		// 7.	Read the response using getInputStream
		InputStream inputStream =  connection.getInputStream();
		//8.	Create an inputstreamreader for reading the response body.
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		//9.	Create an buffered reader for reading the inputstreamreader
		BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);
		//10.	Read the lines using Readline() with looping statement to read until it becomes null
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferedReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	/* POST REQUEST */
	public void postrequest() throws IOException {
		// 1.	Create object for URL class
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		//2. open the connection and store it in parent class
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		// 3.	Set the request type and request property 
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		//4.	Form the post body {“name”: “Aishwarya”, “salary” : “1500000”,“Age” : “24”}
		String jsonBody = "{“name”: “Aishwarya”, “salary” : “1500000”,“Age” : “23”}";
		// 5.server cant read the jsonBody so sent it in bytes
		byte[] inputJson = jsonBody.getBytes();
		//6.write the response using getOutputStream
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		//7.	Get the response message and print
		System.out.println("Response code is "+ connection.getResponseCode());
		System.out.println("Response Message is "+ connection.getResponseMessage());

		// 7.	Read the response using getInputStream
		InputStream inputStream =  connection.getInputStream();
		//8.	Create an inputstreamreader for reading the response body.
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		//9.	Create an buffered reader for reading the inputstreamreader
		BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);
		//10.	Read the lines using Readline() with looping statement to read until it becomes null
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferedReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	/* PUT REQUEST */
	public void putrequest() throws IOException {
		// 1.	Create object for URL class
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/21");
		//2. open the connection and store it in parent class
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		// 3.	Set the request type and request property 
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		//4.	Form the post body {“name”: “Aishwarya”, “salary” : “1500000”,“Age” : “24”}
		String jsonBody = "{“name”: “Aishwarya”, “salary” : “1500000”,“Age” : “24”}";
		// 5.server cant read the jsonBody so sent it in bytes
		byte[] inputJson = jsonBody.getBytes();
		//6.write the response using getOutputStream
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		//7.	Get the response message and print
		System.out.println("Response code is "+ connection.getResponseCode());
		System.out.println("Response Message is "+ connection.getResponseMessage());

		// 7.	Read the response using getInputStream
		InputStream inputStream =  connection.getInputStream();
		//8.	Create an inputstreamreader for reading the response body.
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		//9.	Create an buffered reader for reading the inputstreamreader
		BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);
		//10.	Read the lines using Readline() with looping statement to read until it becomes null
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferedReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	
	/* DELETE REQUEST */
	public void deleterequest() throws IOException {
		// 1.	Create object for URL class
		URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/21");
		//2. open the connection and store it in parent class
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		// 3.	Set the request type and request property 
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		//4.	Get the response message and print
		System.out.println("Response code is "+ connection.getResponseCode());
		System.out.println("Response Message is "+ connection.getResponseMessage());

		//5.	Read the response using getInputStream
		InputStream inputStream =  connection.getInputStream();
		//6.	Create an inputstreamreader for reading the response body.
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		//7.	Create an buffered reader for reading the inputstreamreader
		BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);
		//8.	Read the lines using Readline() with looping statement to read until it becomes null
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferedReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	

	public static void main(String[] args) throws IOException {
		httpurlconnectionexample connectionexample  = new httpurlconnectionexample();
		connectionexample.getrequest();
		connectionexample.postrequest();
		connectionexample.putrequest();
		connectionexample.deleterequest();
	}



}
