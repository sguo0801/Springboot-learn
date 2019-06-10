package cn.bywind.boot.service.impl;

import cn.bywind.boot.dao.PersonDao;
import cn.bywind.boot.dto.PersonDto;
import cn.bywind.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service  //需要spring来管理的
public class PersonServiceImpl implements PersonService {

    //mybatis的springboot依赖
    @Autowired
    PersonDao personDao;


    @Override
    public int addPerson(PersonDto personDto) {
        return personDao.addPerson(personDto);  //引入依赖重写方法,就用Dao来写
    }

    @Override
    public PersonDto getPersonById(Integer id) {
        return personDao.getPersonById(id);
    }
}
