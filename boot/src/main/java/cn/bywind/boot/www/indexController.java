package cn.bywind.boot.www;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //添加了web依赖可以当做spring mvc的web访问项目
public class indexController {

    @GetMapping("index")
    public @ResponseBody String index(){
        return "hello world";
    }
}
