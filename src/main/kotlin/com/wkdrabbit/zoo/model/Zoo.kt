package com.wkdrabbit.zoo.model

import javax.persistence.*

@Entity
@Table(name = "zoo")
class Zoo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var zooid : Long = 0

    var zooname = ""

    @OneToMany(mappedBy = "zoo")
    var telephones = listOf<Telephone>()

    @ManyToMany
    @JoinTable(name = "zooanimals",
            joinColumns = [JoinColumn(name = "zooid")],
            inverseJoinColumns = [JoinColumn(name = "animalid")])
    var animals = listOf<Animal>()

    constructor()

    constructor(zooName: String) {
        this.zooname = zooName
    }

}