package com.wkdrabbit.zoo.services

import com.wkdrabbit.zoo.model.Zoo
import com.wkdrabbit.zoo.views.CountAnimalsInZoo
import java.util.ArrayList



interface ZooService {

    fun findAll(): ArrayList<Zoo>

    fun delete(id: Long)

    fun getCountAnimalsInZoo() : ArrayList<CountAnimalsInZoo>
}
