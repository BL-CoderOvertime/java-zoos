package com.wkdrabbit.zoo.controllers

import com.wkdrabbit.zoo.services.ZooService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ZooController{

    @Autowired
    var zooService : ZooService? = null

    @GetMapping(value = "/animalcount")
    fun getCountAnimalsInZoo():ResponseEntity<*>{
        return ResponseEntity(zooService!!.getCountAnimalsInZoo(), HttpStatus.OK)
    }

    @DeleteMapping("/delete/{zooid}")
    fun deleteZooById(@PathVariable zooid: Long):ResponseEntity<*>{
        zooService!!.delete(zooid)
        return ResponseEntity<Any>(HttpStatus.OK)
    }

}