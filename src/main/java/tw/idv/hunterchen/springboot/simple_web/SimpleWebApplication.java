package tw.idv.hunterchen.springboot.simple_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="tw.idv.hunterchen.springboot")
public class SimpleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
	}
	
}
