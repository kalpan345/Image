package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@ComponentScan({"com.example.demo","controller"})

@EnableAutoConfiguration
@RunWith(SpringRunner.class)
@SpringBootApplication
public class ImageOp1Application {
	
    @RequestMapping(value="/")
	public static void main(String[] args) {

		SpringApplication.run(ImageOp1Application.class, args);
	}
      
    

}


