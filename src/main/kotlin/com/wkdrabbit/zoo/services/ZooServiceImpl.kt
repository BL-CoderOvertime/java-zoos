package com.wkdrabbit.zoo.services

import com.wkdrabbit.zoo.model.Zoo
import com.wkdrabbit.zoo.repos.ZooRepository
import com.wkdrabbit.zoo.views.CountAnimalsInZoo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.ArrayList
import javax.persistence.EntityNotFoundException
import javax.transaction.Transactional

@Service(value = "zooService")
class ZooServiceImpl : ZooService {

    @Autowired
    val zooRepos : ZooRepository? = null


    override fun findAll(): ArrayList<Zoo> {
        var list = ArrayList<Zoo>()

        zooRepos!!.findAll().forEach { list.add(it) }

        return list
    }


    @Transactional
    override fun delete(id: Long) {
        if(zooRepos!!.findById(id).isPresent){
            zooRepos!!.deleteZooFromZooanimals(id)
            zooRepos!!.deleteById(id)
        } else{
            throw EntityNotFoundException(id.toString())
        }
    }

    override fun getCountAnimalsInZoo(): ArrayList<CountAnimalsInZoo> {
        return zooRepos!!.getCountAnimalsInZoo
    }


}