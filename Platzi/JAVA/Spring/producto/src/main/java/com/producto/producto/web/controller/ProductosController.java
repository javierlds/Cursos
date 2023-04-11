package com.producto.producto.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @GetMapping("/registrar")
    public String registrarProducto(){
        return "registro producto";

    }
}
