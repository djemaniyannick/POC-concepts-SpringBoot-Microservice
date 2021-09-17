package com.codeimmig.yannick.runner;

import java.util.Arrays;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.codeimmig.yannick.model.Student;





@Component
public class TestGetStringDataRunner implements CommandLineRunner {
	@Autowired
	private RestTemplate rt;

	private static final Logger LOG=org.slf4j.LoggerFactory.getLogger(TestGetStringDataRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-object to RestTemplate 
		//create objet to Resttemplate
		//RestTemplate rt = new RestTemplate();
		
	
		
		//Define request URL
		
		//String url="http://localhost:8081/rest/student/showa";
		String url = "http://localhost:8081/rest/student/showb/{id}/{name}";
		//<String> response=rt.getForEntity(url,String.class);
		
		String url2 = "http://localhost:8081/rest/student/showc";
		//ResponseEntity<String> response = rt.getForEntity(url, String.class);
		ResponseEntity<Student> response2 = rt.getForEntity(url2, Student.class);
		
		String url3 = "http://localhost:8081/rest/student/showd";
		ResponseEntity<Student[]> responseList = rt.getForEntity(url3, Student[].class);
		Student[] array = responseList.getBody();
		
		//Print details
		
		/*System.out.println(response.getBody());
		System.out.println(response.getStatusCodeValue());
		System.out.println(response.getStatusCode().name());*/
		System.out.println("---------------------------------------------------");
		ResponseEntity<String> response = rt.getForEntity(url, String.class,101,"AA");
		System.out.println(response.getBody());
		System.out.println(response.getStatusCodeValue());
		System.out.println(response.getStatusCode().name());
		System.out.println("From ended method");
		
		
		System.out.println("***********************************LOGGER********************************");
		LOG.info("Response Body is {}", response2.getBody());
		LOG.info("Response Status code is {}", response2.getStatusCode().name());
		LOG.info("Response Status value is {}", response2.getStatusCodeValue());
		LOG.info("Response Content-Type is {}", response2.getHeaders().getContentType());
		
		
		System.out.println("####################################Arrays dispplay###########################################");

		LOG.info("Response Body is {}", Arrays.asList(array));
		LOG.info("Response Status code is {}", responseList.getStatusCode().name());
		LOG.info("Response Status value is {}", responseList.getStatusCodeValue());
		LOG.info("Response Content-Type is {}", responseList.getHeaders().getContentType());
		
		
		String url4 = "http://localhost:8081/rest/student/remove/{id}";
		
		//rt.delete(url, 101);
		//[ URL, HttpMethod, HttpEntity, ResponseType, PathVariables]
		System.out.println("-------------------------delete method   -----------------------------------");
		ResponseEntity<String> response4 = rt.exchange(url4, HttpMethod.DELETE, null, String.class, 5501);
		
		LOG.info("Response Body => " + response4.getBody());
		LOG.info("Response Status Code => " + response4.getStatusCode().name());
		LOG.info("Response Status Value => " + response4.getStatusCodeValue());
		LOG.info("Response Content-Type => " + response4.getHeaders().getContentType());
	}

}
