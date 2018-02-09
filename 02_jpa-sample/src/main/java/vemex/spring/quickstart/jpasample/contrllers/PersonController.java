package vemex.spring.quickstart.jpasample.contrllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vemex.spring.quickstart.jpasample.dao.PersonRepository;
import vemex.spring.quickstart.jpasample.model.Person;

import java.util.List;

/**
 * @author  wangweiwei
 */
@RequestMapping(value = "/users")
@RestController
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable int  id) {
        Person p = personRepository.findOne(id);
        return p;
    }

}
