package com.wkdrabbit.zoo.model

import javax.persistence.*

@Entity
@Table(name = "animal")
class Telephone{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var telephoneId : Long = 0

    var telephoneName = ""
}