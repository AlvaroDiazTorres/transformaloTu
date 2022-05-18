package com.cebem.transformatolotu.controllers;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Map;
    
import com.cebem.transformatolotu.models.alvaro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class Ejercicio {
    
    @GetMapping("/girar")
    public String add(@RequestParam String frase) {
        frase = alvaro.voltear(frase);
        frase = alvaro.invertir(frase);
        return frase;
    }
}
