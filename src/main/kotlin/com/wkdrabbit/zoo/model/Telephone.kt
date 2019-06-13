package com.wkdrabbit.zoo.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
@Table(name = "telephone")
class Telephone{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var phoneid : Long = 0

    var phonetype = ""
    var phonenumber = ""

    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties("telephone")
    var zoo = Zoo()

    constructor()

    constructor(telephoneType: String, telephoneNumber: String) {
        this.phonetype = telephoneType
        this.phonenumber = telephoneNumber
    }


}