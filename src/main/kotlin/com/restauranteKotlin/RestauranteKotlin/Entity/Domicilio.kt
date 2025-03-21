package com.restauranteKotlin.RestauranteKotlin.Entity

import com.restauranteKotlin.RestauranteKotlin.Utils.EstadoEntrega
import jakarta.persistence.*

@Entity
@Table(name ="domicilio")
class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long ? = null

    @Enumerated(EnumType.STRING)
    lateinit var  estadoEntrega :EstadoEntrega

}
