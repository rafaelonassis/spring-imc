package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Pessoa;
import com.example.demo.services.ImcService;

@RestController
@RequestMapping("/imc")
public class ImcController {
    @Autowired
    private ImcService svc;

    @PostMapping("/calculate")
    public Pessoa calculateImc(@RequestBody Pessoa pessoa) {
        svc.calculate(pessoa);

        return pessoa;
    }
}
