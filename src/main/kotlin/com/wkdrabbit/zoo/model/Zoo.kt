package com.wkdrabbit.zoo.model

import javax.persistence.*

@Entity
@Table(name = "zoo")
class Zoo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var zooId : Long = 0

    var zooName = ""


    @OneToMany(mappedBy = "zoo")
    var telephones = arrayListOf<Telephone>()

    @ManyToMany
    @JoinTable(name = "zooanimals",
            joinColumns = [JoinColumn(name = "animalid")],
            inverseJoinColumns = [JoinColumn(name = "zooid")])
    var animals = arrayListOf<Animal>()

    constructor()

    constructor(zooName: String) {
        this.zooName = zooName
    }

}