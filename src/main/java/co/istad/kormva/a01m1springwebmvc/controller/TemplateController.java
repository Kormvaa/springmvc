package co.istad.kormva.a01m1springwebmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/templates")
@Slf4j
public class TemplateController {

    @GetMapping("/{id}")
    public String index(@PathVariable Integer id,
                        @PathVariable String username,
                        @RequestParam(required = false, defaultValue = "20") Integer point){
        log.info("ID: {}",id);
        log.info("Username: {}",username);
        log.info("Point: {}",point);
        return "home";
    }

}
