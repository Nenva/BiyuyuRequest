package com.example.biyuyurequest.model

data class User(
        val id: String,
        var name: String,
        var lastName: String,
        var email: String,
        var phoneNumber: String,
        var city: String,
        var password: String
) {
    override fun toString(): String {
        return name
    }
}