package com.wkdrabbit.zoo.repos

import com.wkdrabbit.zoo.model.Animal
import org.springframework.data.repository.CrudRepository

interface AnimalRepository : CrudRepository<Animal, Long> {
}