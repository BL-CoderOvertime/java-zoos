package com.wkdrabbit.zoo.repos

import com.wkdrabbit.zoo.model.Zoo
import com.wkdrabbit.zoo.views.CountAnimalsInZoo
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import java.util.ArrayList



interface ZooRepository : CrudRepository<Zoo, Long>{


    @get:Query(value = "SELECT s.zooId, zooName, count(s.animalId) as countanimals FROM zooanimals s INNER JOIN zoo c on s.zooid = c.zooid GROUP BY s.zooid, c.zooname", nativeQuery = true)
    val getCountAnimalsInZoo: ArrayList<CountAnimalsInZoo>


    @Modifying
    @Query(value = "DELETE FROM zooanimals WHERE zooid = :zooid" , nativeQuery = true)
    fun deleteZooFromZooanimals(zooid : Long)
}
