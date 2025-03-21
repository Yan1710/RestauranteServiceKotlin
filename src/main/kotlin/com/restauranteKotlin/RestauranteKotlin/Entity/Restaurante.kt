package com.restauranteKotlin.RestauranteKotlin.Entity

import jakarta.persistence.*


@Entity
@Table(name = "restaurante")
class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var nombre: String = ""

    var direccion: String = ""

    var number: Double = 0.0

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    var usuario: Usuario? = null
}