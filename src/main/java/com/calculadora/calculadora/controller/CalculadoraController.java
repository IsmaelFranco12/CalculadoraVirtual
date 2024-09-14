package com.calculadora.calculadora.controller;


import com.calculadora.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")

public class CalculadoraController {

    @Autowired
    private CalculadoraService
    calculadoraService;

    @GetMapping("/sumaremos")
    public double sumar(@RequestParam double num1, @RequestParam double num2){
        return
        calculadoraService.sumar(num1, num2);
        
    }

    @GetMapping("/restar")
    public double restar(@RequestParam double num1, @RequestParam double num2){
        return
        calculadoraService.restar(num1, num2);
    }
    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam double num1, @RequestParam double num2){
        return
        calculadoraService.multiplicar(num1, num2);
        
    }

    @GetMapping("/dividir")
    public double dividir(@RequestParam double num1, @RequestParam double num2){
        return
        calculadoraService.dividir(num1, num2);
    }
}
