package com.eliaschr.backenddemo

import java.time.LocalDateTime
import jakarta.persistence.*

@Entity
@Table(name = "messages")
data class Message (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val ID: Long? = null,

    @Column(nullable = false)
    var name: String ="guest",

    @Column(nullable = false)
    val message: String = "--",

    @Column(nullable = false)
    val dateCreated: LocalDateTime = LocalDateTime.MIN
)