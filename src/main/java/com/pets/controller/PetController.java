package com.pets.controller;

import com.pets.model.Pet;
import com.pets.model.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rhzeffa on 06/04/16.
 */
@RestController
@RequestMapping(value = "pets")
public class PetController {

    @Autowired
    private PetRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Pet> getAll() {
        return repository.findAll();
    }


    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Pet getAll(@PathVariable("id") Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Pet save(@RequestBody Pet pet) {
        return repository.save(pet);
    }
}
