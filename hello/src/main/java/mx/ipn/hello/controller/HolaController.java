package mx.ipn.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/hello")
    public String decirHola() {
        return "¡Hola Spring!";
    }
}