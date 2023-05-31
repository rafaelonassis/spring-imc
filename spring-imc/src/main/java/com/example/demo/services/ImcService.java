package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.Pessoa;

@Service
public class ImcService {
    public ImcService() {
        super();
    }

    public void calculate(Pessoa pessoa) {
        double imc = pessoa.getWeight() / Math.pow(pessoa.getHeight(), 2);
        String description;
        if (imc < 18.5) {
            description = "Magreza";
        }
        else if (imc < 24.9) {
            description = "Normal";
        } 
        else if (imc < 30) {
            description = "Sobrepeso";
        } else {
            description = "Obesidade";
        }

        pessoa.setImc(imc);
        pessoa.setDescription(description);
    }
}
