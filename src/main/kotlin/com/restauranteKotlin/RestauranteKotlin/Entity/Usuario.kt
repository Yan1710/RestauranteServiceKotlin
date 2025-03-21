package com.restauranteKotlin.RestauranteKotlin.Entity

import com.restauranteKotlin.RestauranteKotlin.Utils.RolEnum
import jakarta.persistence.*

@Entity
@Table(name = "usuario")
class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var name : String = ""

    var email : String = ""

    var password : String = ""

    @Enumerated(EnumType.STRING)
    var rol : RolEnum? = null

}