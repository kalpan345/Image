package com.example.demo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.ws.rs.core.GenericType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.springframework.web.servlet.ModelAndView;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@SpringBootApplication
@Controller
public class upcontroller 
{
	@RequestMapping(value="/")
	public String index() 
	{
		return "upload.html";
	}
	
	//           return "redirect:/getUser";

	
//	@RequestMapping(value = "/upload")
//	public static RedirectView singleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Model model) throws IOException, TesseractException
	{
		/*		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		
		final String uri = "http://localhost:8081/";
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);*/
	//	return "ocr.html";
		{
			/*	HttpHeaders headers = new HttpHeaders();
		
			headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		
			MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
			body.add("file", file);
		
			HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
		 
			String serverUrl = "http://localhost:8081/";
		 
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.postForEntity(serverUrl, requestEntity, String.class);
        	System.out.println("Response code: " + response.getStatusCode());

        	RedirectView redirectView = new RedirectView();
        	redirectView.setContextRelative(true);
        	redirectView.setUrl("http://localhost:8081/");
        	return redirectView;}
      */  
        
	//	OCR.FileUpload(file, redirectAttributes, model);
	//	return "redirect:http://localhost:8081/up";

	/*	return redirect()->action(
			    'ocrcontroller@FileUpload', ['id' => 1]
			);
*/
	   // return new RedirectView("result");
	}
	/*
	@RequestMapping(value="/result")
	public String result() 
	{
		return "ocr.html";
	}*/

}
}