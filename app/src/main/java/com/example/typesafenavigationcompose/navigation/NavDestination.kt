package com.example.typesafenavigationcompose.navigation

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class NavDestination {

    @Serializable
    data object A : NavDestination()

    @Serializable
    data object B : NavDestination()

    @Serializable
    data object C : NavDestination()

    @Serializable
    data object D : NavDestination()

    @Serializable
    data class E(
        @SerialName("parameter1") val parameter1: String = "",
        @SerialName("parameter2") val parameter2: String = ""
    ) : NavDestination()

    fun asRoute(): String? = this.javaClass.canonicalName
}