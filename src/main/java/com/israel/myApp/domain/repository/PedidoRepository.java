/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.israel.myApp.domain.repository;

import com.israel.myApp.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author devsys-a
 */
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
