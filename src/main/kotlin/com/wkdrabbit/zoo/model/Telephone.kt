package com.wkdrabbit.zoo.model

import javax.persistence.*

@Entity
@Table(name = "animal")
class Telephone{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var telephoneId : Long = 0

    var telephoneType = ""
    var telephoneNumber = 0

    //TODO: Setup relational database type i.e. manyToOne/oneToMany/ManyToMany

    constructor()

    //TODO: Setup Constructor when all data is relational data is set
}