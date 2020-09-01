package com.meckintech.service

import com.meckintech.domain.Address
import org.springframework.stereotype.Service
import com.meckintech.repository.AddressRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable


@Service
class AddressService (private val addressRepository : AddressRepository){
    fun save(address : Address) : Address {
        return this.addressRepository.save(address)
    }
    
    fun findAll(pageable: Pageable): Page<Address>{
        return this.addressRepository.findAll(pageable)
    }
    fun findByNumero(numero: Int): Address{
        return this.addressRepository.findByNumero(numero)
    }
}