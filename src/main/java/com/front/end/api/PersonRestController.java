package com.front.end.api;

import com.front.end.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonRestController {
    @Autowired
    List<Person> allPeople;

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPeople(){
        return new ResponseEntity<>(allPeople, HttpStatus.OK);
    }
}
