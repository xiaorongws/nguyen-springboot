package cn.nguyen.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruanzhenrong on 2018/12/23.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello nguyen2";
    }

}
