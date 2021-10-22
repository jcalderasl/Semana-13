/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author PC
 */
@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(Model modelo){
        log.info("Entrando al Controlador inicio de MVC");
        var msg = "Comisiones";
        var persona = new Persona();
        persona.setNombre("Jesus");
        persona.setApellido("Calderas");
        persona.setEnero(21);
        persona.setFebrero(12);
        persona.setMarzo(10);
        
        var persona2 = new Persona();
        persona2.setNombre("Antonio");
        persona2.setApellido("Lemus");
        persona2.setEnero(11);
        persona2.setFebrero(7);
        persona2.setMarzo(8);
        
        var personas = Arrays.asList(persona,persona2);
        
        modelo.addAttribute("msg",msg);
        modelo.addAttribute("personas",personas);
        
        
        
        return "index";
    }
    
   
}