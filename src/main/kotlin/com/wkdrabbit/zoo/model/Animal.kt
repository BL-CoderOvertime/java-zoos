package com.wkdrabbit.zoo.model

import javax.persistence.*

@Entity
@Table(name = "animal")
class Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var animalId : Long = 0

    var animalName = ""
}