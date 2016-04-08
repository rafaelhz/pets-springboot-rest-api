package com.pets.controller;

import com.pets.model.Category;
import com.pets.model.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rhzeffa on 06/04/16.
 */
@RestController
@RequestMapping(value = "categories")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Category> getAll() {
        return repository.findAll();
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Category getAll(@PathVariable("id") Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Category save(@RequestBody Category category) {
        return repository.save(category);
    }
}
