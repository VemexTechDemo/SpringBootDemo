package vemex.spring.quickstart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vemex.spring.quickstart.YmlConfig;

@Controller
public class HomeController {
    @Autowired
    private YmlConfig env;
    @RequestMapping("/")
    @ResponseBody
    String home() {
            return "Hello World!"+env.getSimpleProp();

    }
}
