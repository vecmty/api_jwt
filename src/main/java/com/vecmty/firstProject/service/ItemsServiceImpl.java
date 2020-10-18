package com.vecmty.firstProject.service;

import com.vecmty.firstProject.model.Item;
import com.vecmty.firstProject.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService{

    @Autowired
    ItemsRepository repository;

    @Override
    public List<Item> getAll() {

        return (List<Item>) repository.findAll();
    }

    @Override
    public Item getById(int id) {

        return repository.findById(id).get();
    }

    @Override
    public void save(Item item) {

        repository.save(item);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);


    }
}
