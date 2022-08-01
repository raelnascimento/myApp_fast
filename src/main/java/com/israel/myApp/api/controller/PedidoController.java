/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.israel.myApp.api.controller;

import com.israel.myApp.domain.model.Pedido;
import com.israel.myApp.domain.repository.PedidoRepository;
import com.israel.myApp.domain.service.PedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author devsys-a
 */
@Controller
public class PedidoController {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Autowired
    private PedidoService pedidoService;
    
    
    @GetMapping("/listar")
    public List<Pedido> listar(){
        return pedidoRepository.findAll();
    }
    
    
}
