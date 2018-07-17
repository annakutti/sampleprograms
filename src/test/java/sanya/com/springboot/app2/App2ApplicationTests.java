package sanya.com.springboot.app2;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App2Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class App2ApplicationTests {

	@LocalServerPort
	private int port; 
	
	TestRestTemplate restTemplate = new TestRestTemplate();
	
	HttpHeaders httpHeaders = new HttpHeaders();
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void student(){
		HttpEntity<String> httpEntity = new HttpEntity<String>(null, httpHeaders);
		ResponseEntity<String> message = restTemplate.exchange(createURLWithPort("/students/3/courses/1"), HttpMethod.GET, httpEntity, String.class);
		String expected = "{id:1,name:Food,description:Foo Processing steps}";
		try {
			JSONAssert.assertEquals(expected,message.getBody(),false);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String createURLWithPort(String uri){
		return "http://localhost:"+port+uri;
	}

}
