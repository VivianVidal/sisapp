package com.imb.sisapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imb.sisapp.model.DadosCadastroFuncionario;
 
@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@GetMapping
	public String carregarFormFuncionario() {
		return "forms/cadFuncionario"; // Templete cadFuncionario.html
	}

    @PostMapping
    public String cadastrarFuncionario(DadosCadastroFuncionario dados){
        System.out.println(dados);
        return "forms/cadFuncionario";
    }
 
}