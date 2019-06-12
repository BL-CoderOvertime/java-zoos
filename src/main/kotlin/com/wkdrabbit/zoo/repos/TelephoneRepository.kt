package com.wkdrabbit.zoo.repos

import com.wkdrabbit.zoo.model.Telephone
import org.springframework.data.repository.CrudRepository

interface TelephoneRepository : CrudRepository<Telephone, Long> {
}