package com.tintumpic.people_web.data;

import com.tintumpic.people_web.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@Component
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
//            List<Person> people = List.of(
////                    new Person(null, "Pete", "Snake", LocalDate.of(1950, 1, 1), new BigDecimal("50000"), "dummy@sample.com"),
////                    new Person(null, "Jennifer", "Smith", LocalDate.of(1960, 2, 2), new BigDecimal("30000"),"dummy@sample.com"),
////                    new Person(null, "Mark", "Jackson", LocalDate.of(1970, 3, 3), new BigDecimal("300000"),"dummy@sample.com"),
////                    new Person(null, "Vishnu", "McGuire", LocalDate.of(1970, 3, 3), new BigDecimal("300000"),"dummy@sample.com"),
////                    new Person(null, "Jane", "Smith", LocalDate.of(1970, 3, 3), new BigDecimal("300000"),"dummy@sample.com"),
////                    new Person(null, "Bobby", "Kim", LocalDate.of(1980, 4, 4), new BigDecimal("320000"),"dummy@sample.com"));
//            personRepository.saveAll(people);
        }
    }
}
