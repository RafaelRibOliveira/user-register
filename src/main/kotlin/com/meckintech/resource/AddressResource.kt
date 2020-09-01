package com.meckintech.resource

import com.meckintech.domain.Address
import org.springframework.web.bind.annotation.*
import com.meckintech.service.AddressService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable


@CrossOrigin
@RestController
@RequestMapping("/address")
class AddressResource (private val addressService : AddressService){

    @PostMapping
    fun save (@RequestBody address : Address): Address {
        return this.addressService.save(address)

    }
    @GetMapping
    fun findAll(pageable : Pageable): Page<Address> {
        return this.addressService.findAll(pageable = pageable)

    }
    @GetMapping("/number-of-house/{numero}")
    fun findByNumero(@PathVariable numero: Int): Address{
        return this.addressService.findByNumero(numero)
    }
}