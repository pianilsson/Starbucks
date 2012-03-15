package starbucks.service.servlet;

import java.io.IOException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class StarbucksServiceTest {

	StarbucksService starbucksService;
	HttpClient client;
	HttpPost post;

	
	// @Test
	public void orderCupOfCoffeefromServlet() {

		try {
			client = new DefaultHttpClient();

			post = new HttpPost("http://localhost:8080/"
					+ "Starbucks-1.0-SNAPSHOT" + "/starbucks.do");
			post.addHeader("content-type", "application/xml");

			StringEntity input = new StringEntity("<order>"
					+ "<drink>double machiato</drink>" + "/<order>");

			post.setEntity(input);

			client.execute(post);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assert (true);

	}
}
