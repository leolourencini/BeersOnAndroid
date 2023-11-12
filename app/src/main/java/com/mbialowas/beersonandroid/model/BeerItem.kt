package com.mbialowas.beersonandroid.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BeerItem(
    @Json(name = "id")
    val id: Int,
    @Json(name = "image")
    val image: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "price")
    val price: String,
    //@Json(name = "rating")
    //val rating: Rating
)