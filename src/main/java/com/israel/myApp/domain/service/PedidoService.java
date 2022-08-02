/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.israel.myApp.domain.service;

import com.israel.myApp.domain.model.Pedido;
import com.israel.myApp.domain.model.StatusPedido;
import com.israel.myApp.domain.repository.PedidoRepository;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author devsys-a
 */
@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    public Pedido criar(Pedido pedido){
     pedido.setDataHoraPedido(LocalDateTime.now());
     pedido.setStatus(StatusPedido.CONFIRMADO);
     
     return pedidoRepository.save(pedido);
    }
}
