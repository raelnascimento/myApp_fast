/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.israel.myApp.api.controller;

import com.israel.myApp.domain.model.Item;
import com.israel.myApp.domain.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devsys-a
 */

@RestController
@RequestMapping("/item")
public class ItemController {
    
    @Autowired
    private ItemRepository itemRepository;
    
    @GetMapping
    public List<Item> listarItem(){
        return itemRepository.findAll();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item adicionarItem(@RequestBody Item item){
        return itemRepository.save(item);
    }
}
