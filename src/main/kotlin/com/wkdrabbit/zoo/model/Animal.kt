package com.wkdrabbit.zoo.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
@Table(name = "animal")
class Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var animalid : Long = 0

    var animalName = ""
    var animaltype = ""

    @ManyToMany(mappedBy = "animals")
    @JsonIgnoreProperties("animals")
    var zoos = listOf<Zoo>()

    constructor()

    constructor(animalName: String, animaltype : String) {
        this.animalName = animalName
        this.animaltype = animaltype
    }


}