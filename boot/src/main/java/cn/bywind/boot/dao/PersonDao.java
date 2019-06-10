package cn.bywind.boot.dao;

import cn.bywind.boot.dto.PersonDto;
import org.springframework.stereotype.Repository;


//用mybatis的xml实现,需要再mappers中写xml语句,其中是sql语句.(简单的其实可以直接用注解实现@Insert
@Repository
public interface PersonDao {

    int addPerson(PersonDto personDto);

    PersonDto getPersonById(Integer id);
}
