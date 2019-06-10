package cn.bywind.boot;

import cn.bywind.boot.dto.PersonDto;
import cn.bywind.boot.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {


    @Autowired
    PersonService personService;

    @Test  //基于junit的组件
    public void contextLoads() {

    }

    @Test
    public void testGetPersonById(){
        PersonDto personDto = personService.getPersonById(1);
        System.out.println(personDto);
    }

}
