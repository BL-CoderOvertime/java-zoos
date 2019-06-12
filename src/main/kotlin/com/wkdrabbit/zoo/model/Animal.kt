package com.wkdrabbit.zoo.model

import javax.persistence.*

@Entity
@Table(name = "animal")
class Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var animalid : Long = 0

    var animalName = ""
    var animaltype = ""

/*    @ManyToMany(mappedBy = "zoo")
    var zoo = Zoo()*/

    constructor()

    constructor(animalName: String, animaltype : String) {
        this.animalName = animalName
        this.animaltype = animaltype
    }


}