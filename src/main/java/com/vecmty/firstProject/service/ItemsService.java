package com.vecmty.firstProject.service;

import com.vecmty.firstProject.model.Item;

import java.util.List;


public interface ItemsService {
    List<Item> getAll();

    Item getById(int id);

    void save(Item item);

    void delete(int id);
}
