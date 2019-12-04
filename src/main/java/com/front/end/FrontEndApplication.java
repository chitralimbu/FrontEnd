package com.front.end;

import com.front.end.domain.Person;
import com.front.end.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FrontEndApplication {

	@Bean
	public List<Person> allPeople(){
		return Arrays.asList(new Person("chitra", 24, "dev"),
							new Person("bob", 34, "lol"));
	}


/*	@Bean
	public PersonService personService(){
		return new PersonService();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(FrontEndApplication.class, args);
	}

}
