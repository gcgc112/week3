package com.offcn.controller;

import com.offcn.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {

    //此方法只设置参数，向指定的需要此数据的页面送
    @ModelAttribute("person")
    public Person getPerson() {
        Person person = new Person();
        person.setId(1001);
        person.setName("寒冰");
        person.setPsex("女");
        return person;
    }

    //update页面需要person数据，此方法只管送回数据，数据送回不需要管理
    @RequestMapping("modelAttribute.do")
    public String modelAttribute() {
        return "goodsupdate";
    }

    //此方法需要同样的数据，还是由最上面的方法负责处理数据，这样实现了数据的统一管理，简化代码
    @RequestMapping("modelAttribute2.do")
    public String modelAttribute2() {
        return "goodsupdate";
    }


}
