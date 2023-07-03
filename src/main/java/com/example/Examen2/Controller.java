package com.example.Examen2;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/idat")
public class Controller{

    @GetMapping(path="/")
    public String home(){
        return "A18007010 - Alejandro";
    }
    @GetMapping(path="/codigo")
    public String codigo(){
        return "A18007010";
    }
    @GetMapping(path="/Nombre-completo")
    public String nombre(){
        return "Alejandro Piero Rodriguez";
    }

}
  

