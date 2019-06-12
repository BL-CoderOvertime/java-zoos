package com.wkdrabbit.zoo.model

import javax.persistence.*

@Entity
@Table(name = "zoo")
class Zoo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var zooId : Long = 0

    var zooName = ""
}