package com.pets.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by rhzeffa on 23/03/16.
 */
public interface PetRepository extends PagingAndSortingRepository<Pet, Long> {

}
