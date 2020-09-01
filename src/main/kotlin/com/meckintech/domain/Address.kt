package com.meckintech.domain

import javax.persistence.*


@Entity
@Table(name = "address")
class Address (
                @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                var id: Long,
                var logradouro: String,
                var numero: Int,
                var bairro: String,
                var cep: String
)