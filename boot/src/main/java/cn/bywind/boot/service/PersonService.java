package cn.bywind.boot.service;

import cn.bywind.boot.dto.PersonDto;


public interface PersonService {

    int addPerson(PersonDto personDto);

    PersonDto getPersonById(Integer id);
}

