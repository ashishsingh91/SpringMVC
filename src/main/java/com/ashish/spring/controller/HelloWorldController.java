package com.ashish.spring.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
   
   @RequestMapping(path={"/"},method=RequestMethod.GET)
   public String sayHello(Model model) {
      model.addAttribute("message","Spring4 MVC, Hello World!!!!!");     
      return "index";
   }
}
