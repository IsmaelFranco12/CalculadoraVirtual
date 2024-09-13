package com.calculadora.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double sumar(double num1, double num2){
        return num1 + num2;
    }
    public double restar(double num1, double num2){
        return num1 - num2;
    }
    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public double dividir(double num1, double num2){
        if (num2 == 0){
            throw new
            IllegalArgumentException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }
    
}
