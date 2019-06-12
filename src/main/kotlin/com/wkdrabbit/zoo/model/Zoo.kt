package com.wkdrabbit.zoo.model

import javax.persistence.*

@Entity
@Table(name = "zoo")
class Zoo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var zooId : Long = 0

    var zooName = ""

    //TODO: Setup relational database type i.e. manyToOne/oneToMany/ManyToMany


    constructor()


    //TODO: Setup Constructor when all data is relational data is set
}