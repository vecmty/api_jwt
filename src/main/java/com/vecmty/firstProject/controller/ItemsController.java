package com.vecmty.firstProject.controller;

import com.vecmty.firstProject.model.Item;
import com.vecmty.firstProject.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @PostMapping("/save")
    public Item save(@RequestBody Item item){
        itemsService.save(item);
        return item;
    }

    @GetMapping("/list")
    public List<Item> list(){
        return itemsService.getAll();
    }

    @GetMapping("/list/{id}")
    public Item getById(@PathVariable int id){
        return itemsService.getById(id);
    }


/*
    @GetMapping("/delete/{id}")
    public void deleteItem (@PathVariable (value = "id") int id){
        service.delete(id);
    }

 */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        itemsService.delete(id);
        return "redirect:/items";
    }





}
