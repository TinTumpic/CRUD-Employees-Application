package com.tintumpic.people_web.biz.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void canParse() {
        String csvLine = "";
        Person person = Person.parse(csvLine);
        assertThat(person.getDob()).isEqualTo(LocalDate.of(1995, 2,19));
    }

}