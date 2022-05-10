package br.com.seteideias.xclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TesteController {

    @Value("${data.name : Carlos}")
    private String name;

    @Value("${data.lista : 1,2,3}")
    private List<Integer> listaDeNumeros;

    @GetMapping("/data")
    public String getTeste(){
        return name;
    }

    @GetMapping("/lista")
    public List<Integer> getList(){
        return listaDeNumeros;
    }


}
