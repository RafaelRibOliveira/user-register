package com.meckintech.domain

import javax.persistence.*

@Entity
@Table(name = "user")
class User (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Long,
        var name : String
)
