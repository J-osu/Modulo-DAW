package com.josue.pizzeria.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//this is java class is a controler.
//Por ser controlador su funcion exclusiva es recibir.
//las peticiones http y enviar las respuestas http.

@Controller
public class HomeControler {

    @GetMapping("/")
    public String home(){
        return "/frontend/home/index";
    }
    @GetMapping("/qsomos")
    public String qSomos(){
        return "/frontend/home/qsomos";
    }
    @GetMapping("/contacto")
    public String contacto(){
        return "/frontend/home/contacto";
    }
}
