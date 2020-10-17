package com.vecmty.firstProject.controller;

import com.vecmty.firstProject.model.Item;
import com.vecmty.firstProject.repository.ItemsRepository;
import com.vecmty.firstProject.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class ItemsController {

    @Autowired
    private ItemsService service;

    @PostMapping("/save")
    public Item save(@RequestBody Item item){
        service.save(item);
        return item;
    }

    @GetMapping("/list")
    public List<Item> list(){
        return service.getAll();
    }

    @GetMapping("/list/{id}")
    public Item getById(@PathVariable int id){
        return service.getById(id);
    }


/*
    @GetMapping("/delete/{id}")
    public void deleteItem (@PathVariable (value = "id") int id){
        service.delete(id);
    }

 */
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/items";
    }





}
