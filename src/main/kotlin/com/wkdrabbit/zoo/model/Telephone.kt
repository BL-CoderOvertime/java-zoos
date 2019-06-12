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

    @ManyToOne
    @JoinColumn(name = "zooid")
    var zoo = Zoo()

    constructor()

    constructor(telephoneType: String, telephoneNumber: Int) {
        this.telephoneType = telephoneType
        this.telephoneNumber = telephoneNumber
    }


}