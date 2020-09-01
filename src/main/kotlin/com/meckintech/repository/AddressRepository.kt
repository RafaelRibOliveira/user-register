package com.meckintech.repository

import com.meckintech.domain.Address
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface AddressRepository : JpaRepository<Address, Long>{
    fun findByNumero(numero: Int): Address
}

