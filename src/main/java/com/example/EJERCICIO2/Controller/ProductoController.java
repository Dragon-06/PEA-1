/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EJERCICIO2.Controller;

import com.example.EJERCICIO2.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductoController {

    @GetMapping("/producto/registrar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "formularioProducto";
    }

    @PostMapping("/producto/registrar")
    public String registrarProducto(@ModelAttribute Producto producto, Model model) {
        model.addAttribute("producto", producto);
        return "exitoProducto";
    }
}
