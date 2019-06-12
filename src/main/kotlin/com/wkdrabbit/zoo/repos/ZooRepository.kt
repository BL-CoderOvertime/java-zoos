package com.wkdrabbit.zoo.repos

import com.wkdrabbit.zoo.model.Zoo
import org.springframework.data.repository.CrudRepository

interface ZooRepository : CrudRepository<Zoo, Long>{
}