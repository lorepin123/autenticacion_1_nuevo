package com.lorena.autenticacion_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "¡Hola Lorena! Tu aplicación Spring Boot está funcionando.";
    }
}
