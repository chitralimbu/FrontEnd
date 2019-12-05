package com.front.end.service;

import com.front.end.domain.Person;
import com.front.end.exception.NoProductsFoundUnderCategoryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{name}")
    public @ResponseBody Person person(@PathVariable String name){
        if(personService.getPersonByName(name) == null){
            throw new NoProductsFoundUnderCategoryException();
        }else{
            return personService.getPersonByName(name);
        }
    }

}
