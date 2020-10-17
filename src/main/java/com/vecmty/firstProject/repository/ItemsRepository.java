package com.vecmty.firstProject.repository;

import com.vecmty.firstProject.model.Item;
import org.springframework.data.repository.CrudRepository;


public interface ItemsRepository extends CrudRepository<Item, Integer> {
    void deleteItemById(int id);

}
