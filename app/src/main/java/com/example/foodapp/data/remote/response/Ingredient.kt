package com.example.foodapp.data.remote.response


import com.google.gson.annotations.SerializedName

data class Ingredient(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("localizedName")
    val localizedName: String? = null,
    @SerializedName("name")
    val name: String? = null
)