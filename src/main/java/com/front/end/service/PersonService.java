package com.front.end.service;

import com.front.end.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {

    @Autowired
    private List<Person> allPeople;

    public Person getPersonByName(String name){
        return allPeople.stream().filter(person -> person.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
